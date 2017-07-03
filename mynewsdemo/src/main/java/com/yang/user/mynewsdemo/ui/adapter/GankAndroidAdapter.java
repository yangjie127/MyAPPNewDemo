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

public class GankAndroidAdapter extends RecyclerView.Adapter{
    private OnItemClickListener onItemClickListener;
    private LayoutInflater layoutInflater;
    private List<GankTechHttpBean.ResultsBean> resultsBeanList = null;
    private Context context;

    public GankAndroidAdapter (Context context,List<GankTechHttpBean.ResultsBean> resultsBeanList){
        this.context = context;
        this.resultsBeanList = resultsBeanList;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_gankteach,parent,false);
        GankTeachHolder gankTeachHolder = new GankTeachHolder(view);
        return gankTeachHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        final GankTeachHolder gankTeachHolder = (GankTeachHolder) holder;
        gankTeachHolder.ivIcon.setImageResource(R.mipmap.ic_android);
        gankTeachHolder.tvContent.setText(resultsBeanList.get(position).getDesc());
        gankTeachHolder.tvAuthor.setText(resultsBeanList.get(position).getWho());
        gankTeachHolder.tvTime.setText(DataUtils.formatDateTime(DataUtils.subStandardTime(resultsBeanList.get(position).getPublishedAt()),true));
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
        return resultsBeanList.size()==0 ? 0:resultsBeanList.size();
    }
    class  GankTeachHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.iv_tech_icon)
        ImageView ivIcon;
        @BindView(R.id.tv_tech_title)
        TextView tvContent;
        @BindView(R.id.tv_tech_author)
        TextView tvAuthor;
        @BindView(R.id.tv_tech_time)
        TextView tvTime;

        public GankTeachHolder(View itemView) {
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
