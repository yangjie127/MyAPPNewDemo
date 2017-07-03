package com.yang.user.mynewsdemo.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yang.user.mynewsdemo.R;
import com.yang.user.mynewsdemo.ui.bean.ThemeListBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 2017/3/29.
 */

public class ZHihuThemeAdapter extends RecyclerView.Adapter{
    LayoutInflater layoutInflater = null;
    Context context;
    List<ThemeListBean.OthersBean> mList = null;
    private OnItemClickListener onItemClickListener;

    public ZHihuThemeAdapter( Context context,List<ThemeListBean.OthersBean> mList){
        this.context = context;
        this.mList = mList;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =layoutInflater.inflate(R.layout.item_zhihutheme,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.tvKind.setText(mList.get(position).getName());
        Glide.with(context).load(mList.get(position).getThumbnail()).into(myViewHolder.ivBg);
        final int id = mList.get(position).getId();
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(id);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.theme_bg)
        ImageView ivBg;
        @BindView(R.id.theme_kind)
        TextView tvKind;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener ) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(int id);
    }
}
