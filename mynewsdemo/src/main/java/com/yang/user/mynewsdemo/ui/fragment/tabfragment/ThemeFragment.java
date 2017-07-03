package com.yang.user.mynewsdemo.ui.fragment.tabfragment;import android.os.Bundle;import android.support.annotation.Nullable;import android.support.v4.app.Fragment;import android.support.v4.widget.SwipeRefreshLayout;import android.support.v7.widget.GridLayoutManager;import android.support.v7.widget.RecyclerView;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import com.google.gson.Gson;import com.google.gson.GsonBuilder;import com.yang.user.mynewsdemo.R;import com.yang.user.mynewsdemo.ui.adapter.ZHihuThemeAdapter;import com.yang.user.mynewsdemo.ui.api.ZhihuApis;import com.yang.user.mynewsdemo.ui.bean.ThemeListBean;import com.yang.user.mynewsdemo.ui.utils.SnackbarUtil;import java.util.ArrayList;import java.util.List;import butterknife.BindView;import butterknife.ButterKnife;import retrofit2.Call;import retrofit2.Callback;import retrofit2.Response;import retrofit2.Retrofit;import retrofit2.converter.gson.GsonConverterFactory;/** * Created by User on 2017/3/10. */public class ThemeFragment extends Fragment{    private View view;    private ZHihuThemeAdapter adapter;    LayoutInflater layoutInflater;    private List<ThemeListBean.OthersBean> mList = new ArrayList<ThemeListBean.OthersBean>();    @BindView(R.id.rv_content)    RecyclerView recyclerView;    @BindView(R.id.swipe_refresh)    SwipeRefreshLayout swipeRefreshLayout;    @Nullable    @Override    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {        layoutInflater = LayoutInflater.from(getActivity());        view = layoutInflater.inflate(R.layout.tabfragment_theme,container,false);        ButterKnife.bind(this,view);        initView();        initData();        loadUpData();        return view;    }    private void loadUpData() {        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {            @Override            public void onRefresh() {                mList.clear();                initData();                adapter.notifyDataSetChanged();                swipeRefreshLayout.setRefreshing(false);                SnackbarUtil.showShort(getActivity().getWindow().getDecorView(), "刷新成功");            }        });    }    private void initData() {        final Gson gson = new GsonBuilder().create();        Retrofit retrofit = new Retrofit.Builder().baseUrl(ZhihuApis.HOST).addConverterFactory(GsonConverterFactory.create(gson)).build();        ZhihuApis zhihuapis = retrofit.create(ZhihuApis.class);        Call<ThemeListBean> themebean = zhihuapis.getThemelistbean(4);        themebean.enqueue(new Callback<ThemeListBean>() {            @Override            public void onResponse(Call<ThemeListBean> call, Response<ThemeListBean> response) {                mList = response.body().getOthers();                adapter = new ZHihuThemeAdapter(getActivity(), mList);                recyclerView.setAdapter(adapter);                adapter.notifyDataSetChanged();            }            @Override            public void onFailure(Call<ThemeListBean> call, Throwable t) {            }        });    }    private void initView() {        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorAccent, R.color.colorPrimaryDark);        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));    }}