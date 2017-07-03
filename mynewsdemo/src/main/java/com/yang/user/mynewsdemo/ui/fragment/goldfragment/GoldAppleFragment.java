package com.yang.user.mynewsdemo.ui.fragment.goldfragment;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.andview.refreshview.XRefreshView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yang.user.mynewsdemo.R;
import com.yang.user.mynewsdemo.app.Constants;
import com.yang.user.mynewsdemo.ui.activity.AndroidWebViewActivity;
import com.yang.user.mynewsdemo.ui.adapter.goldadapter.GoldAppleAdapter;
import com.yang.user.mynewsdemo.ui.api.GoldApis;
import com.yang.user.mynewsdemo.ui.bean.GoldAppleBean;
import com.yang.user.mynewsdemo.ui.fragment.MyBaseFragment;
import com.yang.user.mynewsdemo.ui.utils.SnackbarUtil;

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

public class GoldAppleFragment extends MyBaseFragment {
    @BindView(R.id.gold_rv_content)
    RecyclerView recyclerView;

    @BindView(R.id.xrefreshview)
    XRefreshView xRefreshView;

    @BindView(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefreshLayout;

    private int currentpage = 1;/*当前页数*/
    private int totalPagerNumber = 10;/*总页数*/
    private static final int pagerNumberContent = 2;

    GoldAppleAdapter adapter;
    List<GoldAppleBean.NewslistBean> mList = new ArrayList<>();

    @Override
    protected void initView() {
        //设置为垂直布局，这也是默认的
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setOrientation(OrientationHelper.VERTICAL);

        //设置刷新完成以后，headerview固定的时间
        xRefreshView.setPinnedTime(1000);
        xRefreshView.setMoveForHorizontal(true);
        xRefreshView.setPullLoadEnable(true);
        xRefreshView.setAutoLoadMore(false);
//        adapter.setCustomLoadMoreView(new XRefreshViewFooter(this));
        xRefreshView.enableReleaseToLoadMore(true);
        xRefreshView.enableRecyclerViewPullUp(true);
        xRefreshView.enablePullUpWhenLoadCompleted(true);

//        recyclerView.setLoadMore(true);
//        recyclerView.setRefresh(false);
//        recyclerView.setAutoLoadMore(true);
//        recyclerView.setLFRecyclerViewListener(this);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_text_pull;
    }

    @Override
    protected void initData() {
        Gson gson = new GsonBuilder().create();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(GoldApis.HOST).addConverterFactory(GsonConverterFactory.create(gson)).build();
        GoldApis goldApis = retrofit.create(GoldApis.class);
        Call<GoldAppleBean> goldITBeanCall = goldApis.getGoldAppleBean("apple", Constants.TIANXING_KEY, pagerNumberContent, currentpage);

        goldITBeanCall.enqueue(new Callback<GoldAppleBean>() {
            @Override
            public void onResponse(Call<GoldAppleBean> call, Response<GoldAppleBean> response) {
//                mList = response.body().getNewslist();
                mList.addAll(response.body().getNewslist());
                adapter = new GoldAppleAdapter(mContext, mList);
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();

                adapter.setOnItemClickListener(new GoldAppleAdapter.OnItemClickListener() {
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
            public void onFailure(Call<GoldAppleBean> call, Throwable t) {

            }
        });

    }

    @Override
    protected void loadUpData() {
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
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
                    swipeRefreshLayout.setRefreshing(false);
//                    Toast.makeText(getContext(), "" + mList.size() + "---" + currentpage, Toast.LENGTH_SHORT).show();
                    SnackbarUtil.showShort(getActivity().getWindow().getDecorView(), "一共" + (mList.size() + pagerNumberContent) + "条数据" + "第" + currentpage + "页");
                }
            }
        });


        xRefreshView.setXRefreshViewListener(new XRefreshView.SimpleXRefreshListener() {

            @Override
            public void onRefresh(boolean isPullDown) {
                xRefreshView.stopRefresh();
            }

            @Override
            public void onLoadMore(boolean isSilence) {

                if (currentpage >= totalPagerNumber) {
                    xRefreshView.setLoadComplete(true);
//                    Toast.makeText(getContext(), "我是一个有底线的", Toast.LENGTH_SHORT).show();
                    SnackbarUtil.showShort(getActivity().getWindow().getDecorView(), "我是一个有底线的");

                } else {
                    currentpage++;
                    xRefreshView.stopLoadMore(true);
                    initData();
                    adapter.notifyDataSetChanged();
//                    Toast.makeText(getContext(), "" + mList.size() + "---" + currentpage, Toast.LENGTH_SHORT).show();
                    SnackbarUtil.showShort(getActivity().getWindow().getDecorView(), "一共" + (mList.size() + pagerNumberContent) + "条数据" + "第" + currentpage + "页");
                }

            }
        });

    }

   /* @Override
    public void onRefresh() {

    }

    @Override
    public void onLoadMore() {
        //模拟下拉加载更多
        if (currentpage >= totalPagerNumber) {
            recyclerView.stopLoadMore();
//            Toast.makeText(getContext(), "我是一个有底线的", Toast.LENGTH_SHORT).show();
            SnackbarUtil.showShort(getActivity().getWindow().getDecorView(), "我是一个有底线的");
            recyclerView.setFootText("");
        } else {
            currentpage++;
            initData();
            adapter.notifyDataSetChanged();
            recyclerView.stopLoadMore();
//            Toast.makeText(getContext(), "" + mList.size() + "---" + currentpage, Toast.LENGTH_SHORT).show();
            SnackbarUtil.showShort(getActivity().getWindow().getDecorView(), "一共" + (mList.size() + pagerNumberContent) + "条数据" + "第" + currentpage + "页");

        }
    }*/
    /*View view = null;
    LayoutInflater layoutInflater = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layoutInflater = LayoutInflater.from(getActivity());
        view = layoutInflater.inflate(R.layout.fragment_goldtable,container,false);
        return view;
    }*/
}
