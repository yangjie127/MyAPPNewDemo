package com.yang.user.mynewsdemo.ui.fragment;import android.os.Bundle;import android.support.annotation.Nullable;import android.support.v4.app.Fragment;import android.support.v7.widget.AppCompatCheckBox;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import android.widget.CompoundButton;import android.widget.LinearLayout;import android.widget.TextView;import com.yang.user.mynewsdemo.R;import com.yang.user.mynewsdemo.app.Constants;import com.yang.user.mynewsdemo.ui.utils.ACache;import java.io.File;import butterknife.BindView;import butterknife.ButterKnife;import butterknife.OnCheckedChanged;import butterknife.OnClick;/** * Created by User on 2017/3/10. */public class SettingFragment extends Fragment implements CompoundButton.OnCheckedChangeListener{    @BindView(R.id.cb_setting_cache)    AppCompatCheckBox cbSettingCache;    @BindView(R.id.cb_setting_image)    AppCompatCheckBox cbSettingImage;    @BindView(R.id.cb_setting_night)    AppCompatCheckBox cbSettingNight;    @BindView(R.id.ll_setting_feedback)    LinearLayout llSettingFeedback;    @BindView(R.id.tv_setting_clear)    TextView tvSettingClear;    @BindView(R.id.ll_setting_clear)    LinearLayout llSettingClear;    @BindView(R.id.tv_setting_update)    TextView tvSettingUpdate;    @BindView(R.id.ll_setting_update)    LinearLayout llSettingUpdate;    private File cacheFile;    private String versionName;    private boolean isNull = true;    private View view;    private LayoutInflater layoutInflater ;    @Nullable    @Override    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {        layoutInflater = LayoutInflater.from(getActivity());        view = layoutInflater.inflate(R.layout.fragment_setting,container,false);        ButterKnife.bind(this,view);        cacheFile = new File(Constants.PATH_CACHE);        tvSettingClear.setText(ACache.getCacheSize(cacheFile));        return view;    }    @Override    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {            switch (buttonView.getId()){                case R.id.cb_setting_night:                    break;            }    }    @OnClick(R.id.ll_setting_clear)    public void FileClear(){        ACache.deleteDir(cacheFile);        tvSettingClear.setText(ACache.getCacheSize(cacheFile));    }}