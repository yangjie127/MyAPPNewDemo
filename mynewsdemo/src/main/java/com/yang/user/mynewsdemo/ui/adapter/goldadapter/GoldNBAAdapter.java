package com.yang.user.mynewsdemo.ui.adapter.goldadapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yang.user.mynewsdemo.R;
import com.yang.user.mynewsdemo.ui.bean.GoldITBean;
import com.yang.user.mynewsdemo.ui.bean.GoldNBABean;
import com.yang.user.mynewsdemo.ui.widget.SquareImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 2017/3/31.
 */

public class GoldNBAAdapter extends RecyclerView.Adapter{
    Context context = null;
    List<GoldNBABean.NewslistBean> mList = new ArrayList<>();
    public GoldNBAAdapter(Context context, List<GoldNBABean.NewslistBean> mList){
        this.context = context;
        this.mList = mList;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_goldfragmet,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.tvTitle.setText(mList.get(position).getTitle());
        myViewHolder.tvTime.setText(mList.get(position).getCtime());
        myViewHolder.tvAuthor.setText(mList.get(position).getDescription());
        Glide.with(context).load(mList.get(position).getPicUrl()).error(R.mipmap.ic_launcher).placeholder(R.mipmap.ic_launcher).into(myViewHolder.ivImg);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onItemClickListener != null){
                    CardView cv = (CardView) v.findViewById(R.id.cv_tech_content);
                    onItemClickListener.onItemClick(holder.getAdapterPosition(),cv);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tv_gold_item_title)
        TextView tvTitle;
        @BindView(R.id.tv_gold_item_like)
        TextView tvLike;
        @BindView(R.id.tv_gold_item_author)
        TextView tvAuthor;
        @BindView(R.id.tv_gold_item_time)
        TextView tvTime;
        @BindView(R.id.iv_gold_item_img)
        SquareImageView ivImg;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    public OnItemClickListener onItemClickListener;
    public void setOnItemClickListener(OnItemClickListener onItemClickListener ) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position,View view);
    }
    /*holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(onItemClickListener != null){
                CardView cv = (CardView) v.findViewById(R.id.cv_tech_content);
                onItemClickListener.onItemClick(holder.getAdapterPosition(),cv);
            }
        }
    });*/
}
