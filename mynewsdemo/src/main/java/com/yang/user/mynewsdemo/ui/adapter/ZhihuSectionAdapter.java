package com.yang.user.mynewsdemo.ui.adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yang.user.mynewsdemo.R;
import com.yang.user.mynewsdemo.ui.activity.SectionActivity;
import com.yang.user.mynewsdemo.ui.bean.SectionListBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 2017/3/29.
 */

public class ZhihuSectionAdapter extends RecyclerView.Adapter{
    List<SectionListBean.DataBean> mList = null;
    Context context;
    LayoutInflater layoutInflater = null;

    public ZhihuSectionAdapter(Context context,List<SectionListBean.DataBean> mList ){
        this.context = context;
        this.mList = mList;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_zhisection,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final MyViewHolder myViewHolder = (MyViewHolder) holder;
        Glide.with(context).load(mList.get(position).getThumbnail()).into(((MyViewHolder) holder).ivBg);
        myViewHolder.tvKind.setText(mList.get(position).getName());
        myViewHolder.tvDes.setText(mList.get(position).getDescription());

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(context, SectionActivity.class);
                intent.putExtra("id",mList.get(myViewHolder.getAdapterPosition()).getId());
                intent.putExtra("title",mList.get(myViewHolder.getAdapterPosition()).getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends  RecyclerView.ViewHolder{
        @BindView(R.id.section_bg)
        ImageView ivBg;
        @BindView(R.id.section_kind)
        TextView tvKind;
        @BindView(R.id.section_des)
        TextView tvDes;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
