package com.yang.user.mynewsdemo.ui.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.yang.user.mynewsdemo.R;
import com.yang.user.mynewsdemo.ui.utils.MyBitmapImageViewTarget;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GirlDetailActivity extends AppCompatActivity {
    @BindView(R.id.tool_bar)
    Toolbar toolBar;
    @BindView(R.id.iv_girl_detail)
    ImageView ivGirlDetail;

    Bitmap bitmap;
//    RealmHelper mRealmHelper;
//    PhotoViewAttacher mAttacher;
    MenuItem menuItem;

    String url;
    String id;

    boolean isLiked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girlphoto);
        ButterKnife.bind(this);
        initView();
        initData();

    }

    private void initData() {

        Intent intent = getIntent();
        url = intent.getExtras().getString("url");
        id = intent.getExtras().getString("id");
        if (url != null) {
            //Glide.with(this).load(url).asBitmap().into(ivGirlDetail);
            Glide.with(this).load(url).asBitmap().centerCrop().placeholder(R.drawable.icon).into(ivGirlDetail);
        }
    }

    private void initView() {

    }
}
