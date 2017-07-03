package com.yang.user.mynewsdemo.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by User on 2017/3/31.
 */

public abstract class MyBaseFragment extends Fragment {
    protected Activity mActivity;
    protected Context mContext;
    protected View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(getLayoutId(), container, false);
        ButterKnife.bind(this, mView);
        initView();
        initData();
        loadUpData();
        return mView;
    }

    @Override
    public void onAttach(Context context) {
        mActivity = (Activity) context;
        mContext = context;
        super.onAttach(context);
    }

    protected abstract void initView();

    protected abstract int getLayoutId();

    protected abstract void initData();

    protected abstract void loadUpData();
}
