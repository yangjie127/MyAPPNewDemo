package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class VtexSocialBean {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-03-31 13:17","title":"外籍男在上海被人持刀片划伤：嫌犯系精神病患者","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170331/Img485778445_ss.jpeg","url":"http://news.sohu.com/20170331/n485780711.shtml"},{"ctime":"2017-03-31 13:18","title":"福建商人陕西遭跨省追砍多名嫌疑人翻供 谁是买凶者？","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170331/Img485780712_ss.jpeg","url":"http://news.sohu.com/20170331/n485780890.shtml"},{"ctime":"2017-03-31 13:27","title":"杭州：共享单车违停与机动车\u201c同罪\u201d 罚款10元","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170331/Img485780892_ss.jpg","url":"http://news.sohu.com/20170331/n485782513.shtml"},{"ctime":"2017-03-31 13:39","title":"江西奉新县政府成\u201c老赖\u201d 县领导出行将受限","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170331/Img485782516_ss.jpeg","url":"http://news.sohu.com/20170331/n485783936.shtml"},{"ctime":"2017-03-31 13:47","title":"温州瑞安民房煤气爆炸 致1人死亡","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170331/Img485783937_ss.jpeg","url":"http://news.sohu.com/20170331/n485785562.shtml"},{"ctime":"2017-03-31 12:15","title":"男子杀前妻后自杀 殡仪馆里女儿仍等母亲送她上学","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170331/Img485762081_ss.jpeg","url":"http://news.sohu.com/20170331/n485769578.shtml"},{"ctime":"2017-03-31 12:23","title":"云南多名男子暴打女收费员 警方：因停车引发","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170331/Img485763154_ss.jpeg","url":"http://news.sohu.com/20170331/n485771364.shtml"},{"ctime":"2017-03-31 12:23","title":"网民投资失败喝两瓶老鼠药\u201c直播自杀\u201d 已获救","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170331/Img485763381_ss.jpeg","url":"http://news.sohu.com/20170331/n485771526.shtml"},{"ctime":"2017-03-31 12:49","title":"男友酒驾撞车致1死1伤 女友为其\u201c顶包\u201d被批捕","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170331/Img485769579_ss.jpeg","url":"http://news.sohu.com/20170331/n485777237.shtml"},{"ctime":"2017-03-31 12:52","title":"女子借给同学17万后对方赖账 幸好她留了这一手","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170331/Img485771527_ss.jpeg","url":"http://news.sohu.com/20170331/n485777855.shtml"}]
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
         * ctime : 2017-03-31 13:17
         * title : 外籍男在上海被人持刀片划伤：嫌犯系精神病患者
         * description : 搜狐社会
         * picUrl : http://photocdn.sohu.com/20170331/Img485778445_ss.jpeg
         * url : http://news.sohu.com/20170331/n485780711.shtml
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
