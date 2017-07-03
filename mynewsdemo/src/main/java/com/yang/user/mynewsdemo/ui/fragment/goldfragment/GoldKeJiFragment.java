package com.yang.user.mynewsdemo.ui.fragment.goldfragment;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yang.user.mynewsdemo.R;
import com.yang.user.mynewsdemo.app.Constants;
import com.yang.user.mynewsdemo.ui.activity.AndroidWebViewActivity;
import com.yang.user.mynewsdemo.ui.adapter.goldadapter.GoldKeJiAdapter;
import com.yang.user.mynewsdemo.ui.api.GoldApis;
import com.yang.user.mynewsdemo.ui.bean.GoldKeJiBean;
import com.yang.user.mynewsdemo.ui.fragment.MyBaseFragment;
import com.yang.user.mynewsdemo.ui.view.basepullrefresh.MyBaseSwipeRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by User on 2017/3/30.
 */

public class GoldKeJiFragment extends MyBaseFragment {
    @BindView(R.id.gold_rv_content)
    RecyclerView recyclerView;

    @BindView(R.id.swipe_refresh)
    MyBaseSwipeRefreshLayout myBaseSwipeRefreshLayout;

    private int currentpage = 1;/*当前页数*/
    private int totalPagerNumber = 10;/*总页数*/
    private static final int pagerNumberContent = 2;

    GoldKeJiAdapter adapter;
    List<GoldKeJiBean.NewslistBean> mList = new ArrayList<>();

    @Override
    protected void initView() {
        //设置为垂直布局，这也是默认的
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_goldtable;
    }

    @Override
    protected void initData() {
        Gson gson = new GsonBuilder().create();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(GoldApis.HOST).addConverterFactory(GsonConverterFactory.create(gson)).build();
        GoldApis goldApis = retrofit.create(GoldApis.class);
        Call<GoldKeJiBean> goldITBeanCall = goldApis.getGoldKeJiBean("keji", Constants.TIANXING_KEY, pagerNumberContent, currentpage);

        goldITBeanCall.enqueue(new Callback<GoldKeJiBean>() {
            @Override
            public void onResponse(Call<GoldKeJiBean> call, Response<GoldKeJiBean> response) {
//                mList = response.body().getNewslist();
                mList.addAll(response.body().getNewslist());
                adapter = new GoldKeJiAdapter(mContext, mList);
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();

                adapter.setOnItemClickListener(new GoldKeJiAdapter.OnItemClickListener() {
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
            public void onFailure(Call<GoldKeJiBean> call, Throwable t) {

            }
        });

    }

    @Override
    protected void loadUpData() {
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
}
