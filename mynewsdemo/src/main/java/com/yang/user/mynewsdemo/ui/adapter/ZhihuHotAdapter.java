package com.yang.user.mynewsdemo.ui.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yang.user.mynewsdemo.R;
import com.yang.user.mynewsdemo.ui.bean.HotListBean;
import com.yang.user.mynewsdemo.ui.widget.SquareImageView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 2017/3/29.
 */

public class ZhihuHotAdapter extends RecyclerView.Adapter{
    Context context;
    List<HotListBean.RecentBean> mList = null;
    LayoutInflater layoutInflater;
    private OnItemClickListener onItemClickListener;
    public ZhihuHotAdapter( Context context,List<HotListBean.RecentBean> mList){
        this.context = context;
        this.mList = mList;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_zhihuhot,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        final MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.title.setText(mList.get(position).getTitle());

        if (mList.get(position).isReadState()) {
            myViewHolder.title.setTextColor(ContextCompat.getColor(context,R.color.news_read));
        } else {
            myViewHolder.title.setTextColor(ContextCompat.getColor(context,R.color.news_unread));
        }

        Glide.with(context).load(mList.get(position).getThumbnail()).into(myViewHolder.image);

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onItemClickListener != null) {
                    ImageView iv = (ImageView) view.findViewById(R.id.iv_daily_item_image);
                    onItemClickListener.onItemClick(myViewHolder.getAdapterPosition(),iv);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    class  MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tv_daily_item_title)
        TextView title;
        @BindView(R.id.iv_daily_item_image)
        SquareImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position,View view);
    }

    public void setReadState(int position,boolean readState) {
        mList.get(position).setReadState(readState);
    }
}
