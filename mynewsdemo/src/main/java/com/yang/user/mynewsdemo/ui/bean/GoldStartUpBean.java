package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class GoldStartUpBean {
    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-03-31 10:00","title":"\u201c直播元年\u201d：驻唱歌手、夜场和看客们的另一种生存方式","description":"创业新闻","picUrl":"http://pic.chinaz.com/thumb/2017/0331/6362654961647922952038056.jpeg","url":"http://www.chinaz.com/start/2017/0331/681375.shtml"},{"ctime":"2017-03-30 19:00","title":"同样爆火的王者荣耀和阴阳师，是如何慢慢拉开差距的？","description":"创业新闻","picUrl":"http://pic.chinaz.com/thumb/2017/0330/6362649088175468651791587.jpeg","url":"http://www.chinaz.com/start/2017/0330/681201.shtml"},{"ctime":"2017-03-30 19:00","title":"蓝港互动十周年，创始人王峰献声","description":"创业新闻","picUrl":"http://pic.chinaz.com/thumb/2017/0330/6362649116227258604235642.jpeg","url":"http://www.chinaz.com/start/2017/0330/681208.shtml"},{"ctime":"2017-03-30 18:00","title":"《创业秘诀三部曲》之灵感篇：创新与约束并行，找对时机创业才重要","description":"创业新闻","picUrl":"http://pic.chinaz.com/thumb/2017/0330/6362648933733233918646960.jpeg","url":"http://www.chinaz.com/start/2017/0330/681182.shtml"},{"ctime":"2017-03-30 18:00","title":"「百万应援」背后的女孩们：疯狂、认同感、一天46万","description":"创业新闻","picUrl":"http://pic.chinaz.com/thumb/2017/0330/6362649006714824433632174.jpeg","url":"http://www.chinaz.com/start/2017/0330/681190.shtml"},{"ctime":"2017-03-30 18:00","title":"10%成了裁员标配，科技行业为什么老裁员？","description":"创业新闻","picUrl":"http://pic.chinaz.com/thumb/2017/0330/201703301705327271.jpeg","url":"http://www.chinaz.com/start/2017/0330/681191.shtml"},{"ctime":"2017-03-30 11:00","title":"我们做不了徐静蕾，最多只能做咪蒙的助理","description":"创业新闻","picUrl":"http://pic.chinaz.com/thumb/2017/0330/201703301005264293.jpg","url":"http://www.chinaz.com/start/2017/0330/680737.shtml"},{"ctime":"2017-03-30 11:00","title":"大V内容付费很可能昙花一现，大规模UGC才有机会","description":"创业新闻","picUrl":"http://pic.chinaz.com/thumb/2017/0330/201703301012152097.jpg","url":"http://www.chinaz.com/start/2017/0330/680743.shtml"},{"ctime":"2017-03-30 10:00","title":"从MySpace的失败，看知识付费平台们需要提防的\u201c流量陷阱","description":"创业新闻","picUrl":"http://pic.chinaz.com/thumb/2017/0330/201703300852467739.jpg","url":"http://www.chinaz.com/start/2017/0330/680677.shtml"},{"ctime":"2017-03-30 10:00","title":"2年融资上亿，这家公司还要和全国互联网+公司\u201c发生关系\u201d","description":"创业新闻","picUrl":"http://pic.chinaz.com/thumb/2017/0330/6362646200424274752766044.jpeg","url":"http://www.chinaz.com/start/2017/0330/680687.shtml"}]
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
         * ctime : 2017-03-31 10:00
         * title : “直播元年”：驻唱歌手、夜场和看客们的另一种生存方式
         * description : 创业新闻
         * picUrl : http://pic.chinaz.com/thumb/2017/0331/6362654961647922952038056.jpeg
         * url : http://www.chinaz.com/start/2017/0331/681375.shtml
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
