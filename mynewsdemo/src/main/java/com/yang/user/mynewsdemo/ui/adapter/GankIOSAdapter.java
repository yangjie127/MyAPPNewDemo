package com.yang.user.mynewsdemo.ui.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yang.user.mynewsdemo.R;
import com.yang.user.mynewsdemo.ui.bean.GankTechHttpBean;
import com.yang.user.mynewsdemo.ui.utils.DataUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 2017/3/23.
 */

public class GankIOSAdapter extends RecyclerView.Adapter{
    private List<GankTechHttpBean.ResultsBean> mList = null;
    private Context context;
    private OnItemClickListener onItemClickListener;
    private LayoutInflater layoutInflater= null;
    public GankIOSAdapter(Context context,List<GankTechHttpBean.ResultsBean> mList){
        this.context = context;
        this.mList   = mList;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_gankteach,parent,false);
        GankIOSViewHolder holder = new GankIOSViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
        final GankIOSViewHolder gankIOSViewHolder = (GankIOSViewHolder) holder;
        gankIOSViewHolder.ivIcon.setImageResource(R.mipmap.ic_ios);
        gankIOSViewHolder.tvContent.setText(mList.get(position).getDesc());
        gankIOSViewHolder.tvAuthor.setText(mList.get(position).getWho());
        gankIOSViewHolder.tvTime.setText(DataUtils.formatDateTime(DataUtils.subStandardTime(mList.get(position).getPublishedAt()),true));
        gankIOSViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onItemClickListener != null){
                    CardView cv = (CardView) v.findViewById(R.id.cv_tech_content);
                    onItemClickListener.onItemClick(gankIOSViewHolder.getAdapterPosition(),cv);
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return mList.size() == 0 ? 0 : mList.size();
    }

    class GankIOSViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.iv_tech_icon)
        ImageView ivIcon;
        @BindView(R.id.tv_tech_title)
        TextView tvContent;
        @BindView(R.id.tv_tech_author)
        TextView tvAuthor;
        @BindView(R.id.tv_tech_time)
        TextView tvTime;

        public GankIOSViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position,View view);
    }
}
