package com.yang.user.mynewsdemo.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.yang.user.mynewsdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AndroidWebViewActivity extends AppCompatActivity {
    String url;
    @BindView(R.id.gank_detail_webview)
    WebView mWebView;
//    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_web_view);
        ButterKnife.bind(this);
        initData();
        initWebView();
        
    }

    private void initWebView() {
        final WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setBlockNetworkImage(true);

        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
//                mLoading.hide();
                settings.setBlockNetworkImage(false);
            }
        });

        mWebView.loadUrl(url);

    }

    private void initData() {
        Intent intent = getIntent();
        url = intent.getExtras().getString("gank_girlitem_data");
//        id = intent.getExtras().getString("id");
//        Log.e("yangjie111","android -- : " + url);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
            mWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        mWebView.destroy();
        super.onDestroy();
    }
}
