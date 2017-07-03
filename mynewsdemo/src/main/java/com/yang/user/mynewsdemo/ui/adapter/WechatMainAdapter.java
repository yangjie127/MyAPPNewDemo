package com.yang.user.mynewsdemo.ui.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yang.user.mynewsdemo.R;
import com.yang.user.mynewsdemo.ui.bean.WXItemBean;
import com.yang.user.mynewsdemo.ui.widget.SquareImageView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 2017/3/29.
 */

public class WechatMainAdapter extends RecyclerView.Adapter {
    Context context;
    private OnItemClickListener onItemClickListener;
    List<WXItemBean.NewslistBean> mList = null;
    LayoutInflater layoutInflater = null;

    public WechatMainAdapter(Context context, List<WXItemBean.NewslistBean> mList) {
        this.context = context;
        this.mList = mList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.wechat_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final MyViewHolder myViewHolder = (MyViewHolder) holder;
        Glide.with(context).load(mList.get(position).getPicUrl()).into(myViewHolder.ivImage);
        ((MyViewHolder) holder).tvFrom.setText(mList.get(position).getDescription());
        ((MyViewHolder) holder).tvTitle.setText(mList.get(position).getTitle());
        ((MyViewHolder) holder).tvTime.setText(mList.get(position).getCtime());
         myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    CardView cv = (CardView) v.findViewById(R.id.cv_tech_content);
                    onItemClickListener.onItemClick(myViewHolder.getAdapterPosition(), cv);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_wechat_item_title)
        TextView tvTitle;
        @BindView(R.id.tv_wechat_item_time)
        TextView tvTime;
        @BindView(R.id.tv_wechat_item_from)
        TextView tvFrom;
        @BindView(R.id.iv_wechat_item_image)
        SquareImageView ivImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position, View view);
    }
}
