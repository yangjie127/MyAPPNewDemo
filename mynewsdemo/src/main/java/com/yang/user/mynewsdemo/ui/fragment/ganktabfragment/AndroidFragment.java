package com.yang.user.mynewsdemo.ui.fragment.ganktabfragment;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yang.user.mynewsdemo.R;
import com.yang.user.mynewsdemo.ui.activity.AndroidWebViewActivity;
import com.yang.user.mynewsdemo.ui.adapter.GankAndroidAdapter;
import com.yang.user.mynewsdemo.ui.api.GankApis;
import com.yang.user.mynewsdemo.ui.bean.GankTechHttpBean;
import com.yang.user.mynewsdemo.ui.view.basepullrefresh.MyBaseSwipeRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by User on 2017/3/23.
 */

public class AndroidFragment extends Fragment {
    private View view;
    LayoutInflater layoutInflater;
    private List<GankTechHttpBean.ResultsBean> mList = new ArrayList<GankTechHttpBean.ResultsBean>();
    private GankAndroidAdapter adapter;
    @BindView(R.id.rv_tech_content)
    RecyclerView recyclerView;
    @BindView(R.id.swipe_refresh)
    MyBaseSwipeRefreshLayout myBaseSwipeRefreshLayout;
    private int currentpage = 1;/*当前页数*/
    private int totalPagerNumber = 10;/*总页数*/
    private static final int pagerNumberContent = 2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        layoutInflater = LayoutInflater.from(getActivity());
        view = layoutInflater.inflate(R.layout.ganktabfragment_android, container, false);
        ButterKnife.bind(this, view);
        initView();
        initData();
        loadUpData();
        return view;
    }

    //加载下拉刷新
    private void loadUpData() {
       /* swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //模拟下拉加载更多
                if (currentpage >= totalPagerNumber) {
                    swipeRefreshLayout.setRefreshing(false);
//                    Toast.makeText(getContext(), "我是一个有底线的", Toast.LENGTH_SHORT).show();
                    SnackbarUtil.showShort(getActivity().getWindow().getDecorView(), "我是一个有底线的");

                } else {
                    currentpage++;
                    initData();
                    adapter.notifyDataSetChanged();
                    swipeRefreshLayout.setRefreshing(false);
//                    Toast.makeText(getContext(), "" + mList.size() + "---" + currentpage, Toast.LENGTH_SHORT).show();
                    SnackbarUtil.showShort(getActivity().getWindow().getDecorView(), "一共" + (mList.size() + pagerNumberContent) + "条数据" + "第" + currentpage + "页");
                }
            }
        });*/
        myBaseSwipeRefreshLayout.setColorSchemeColors(Color.RED,Color.GREEN,Color.BLUE);
        myBaseSwipeRefreshLayout.setOnRefreshListener(new MyBaseSwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if(currentpage >= totalPagerNumber){
                    myBaseSwipeRefreshLayout.setRefreshing(false);
                    adapter.notifyDataSetChanged();
                }else{
                    currentpage++;
                    initData();
                    adapter.notifyDataSetChanged();
                    myBaseSwipeRefreshLayout.setRefreshing(false);
                }

            }
        });

        myBaseSwipeRefreshLayout.setBottomColorSchemeColors(Color.GREEN,Color.BLUE,Color.YELLOW,Color.RED);
        myBaseSwipeRefreshLayout.setOnBottomRefreshListenrer(new MyBaseSwipeRefreshLayout.OnBottomRefreshListener() {
            @Override
            public void onBottomRefresh() {
                if(currentpage >= totalPagerNumber){
                    myBaseSwipeRefreshLayout.setBottomRefreshing(false);
                    adapter.notifyDataSetChanged();
                }else{
                    currentpage++;
                    initData();
                    adapter.notifyDataSetChanged();
                    myBaseSwipeRefreshLayout.setBottomRefreshing(false);
                }
            }
        });

    }


    private void initView() {
        //设置为垂直布局，这也是默认的
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setLoadMore(true);
//        recyclerView.setRefresh(false);
//        recyclerView.setAutoLoadMore(true);
//        recyclerView.setLFRecyclerViewListener(this);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
    }

    private void initData() {
        final Gson gson = new GsonBuilder().create();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(GankApis.HOST).addConverterFactory(GsonConverterFactory.create(gson)).build();
        GankApis gankApis = retrofit.create(GankApis.class);
        Call<GankTechHttpBean> gankTechHttpBeanCall = gankApis.getGankTechList("Android", pagerNumberContent, currentpage);
        gankTechHttpBeanCall.enqueue(new Callback<GankTechHttpBean>() {
            @Override
            public void onResponse(Call<GankTechHttpBean> call, Response<GankTechHttpBean> response) {
                // mList = response.body().getResults();
                mList.addAll(response.body().getResults());
                adapter = new GankAndroidAdapter(getActivity(), mList);
                recyclerView.setAdapter(adapter);

                adapter.notifyDataSetChanged();
                adapter.setOnItemClickListener(new GankAndroidAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(int position, View view) {
                        Intent intent = new Intent();
                        intent.setClass(getActivity(), AndroidWebViewActivity.class);
                        intent.putExtra("gank_girlitem_data", mList.get(position).getUrl());
                        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(getActivity(), view, "webview");
                        getActivity().startActivity(intent, options.toBundle());
                    }
                });
            }

            @Override
            public void onFailure(Call<GankTechHttpBean> call, Throwable t) {

            }
        });
    }
}
