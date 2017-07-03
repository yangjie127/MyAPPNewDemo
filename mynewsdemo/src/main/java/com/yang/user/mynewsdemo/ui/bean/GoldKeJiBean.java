package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class GoldKeJiBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-03-31 08:06","title":"净利下滑69% \u201c妖股\u201d暴风如何给未来\u201c讲故事\u201d？","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1335524441_300240/0","url":"http://tech.qq.com/a/20170331/007822.htm"},{"ctime":"2017-03-31 08:42","title":"李开复：人工智能泡沫严重，期待更开放的AI生态","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1335605542_300240/0","url":"http://tech.qq.com/a/20170331/010250.htm"},{"ctime":"2017-03-31 08:37","title":"卖厂、裁员、全线降价 VR不再火爆未来怎么走？","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1335593167_300240/0","url":"http://tech.qq.com/a/20170331/009945.htm"},{"ctime":"2017-03-31 08:04","title":"日媒：苹果公司参与对东芝芯片业务竞购","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1335520634_300240/0","url":"http://tech.qq.com/a/20170331/007649.htm"},{"ctime":"2017-03-31 08:14","title":"未满12周岁使用共享单车涉嫌违法 后果监护人承担","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1335544279_300240/0","url":"http://tech.qq.com/a/20170331/008292.htm"},{"ctime":"2017-03-31 08:51","title":"搭车卖软件 微软将在美国开卖定制版Galaxy S8","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1335633856_300240/0","url":"http://tech.qq.com/a/20170331/011010.htm"},{"ctime":"2017-03-31 07:57","title":"乐视暂时安全落地：贾跃亭60亿元股权转让给融创","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1335504446_300240/0","url":"http://tech.qq.com/a/20170331/007066.htm"},{"ctime":"2017-03-31 08:40","title":"专访暴风CEO冯鑫：A股市场对互联网的不理解还要持续5年","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1335607601_300240/0","url":"http://tech.qq.com/a/20170331/010154.htm"},{"ctime":"2017-03-31 07:21","title":"小蜜电动车重现北京市场 此前因不合规被叫停","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1335446767_300240/0","url":"http://tech.qq.com/a/20170331/004739.htm"},{"ctime":"2017-03-31 07:30","title":"美图也要做电商了 但能否突破盈利红线？","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1335462100_300240/0","url":"http://tech.qq.com/a/20170331/005347.htm"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2017-03-31 08:06
         * title : 净利下滑69% “妖股”暴风如何给未来“讲故事”？
         * description : 腾讯科技
         * picUrl : http://inews.gtimg.com/newsapp_ls/0/1335524441_300240/0
         * url : http://tech.qq.com/a/20170331/007822.htm
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
