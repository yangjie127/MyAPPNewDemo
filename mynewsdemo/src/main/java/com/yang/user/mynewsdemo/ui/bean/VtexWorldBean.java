package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class VtexWorldBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-03-31 13:41","title":"马来西亚被困公民回国：在朝期间最担心的是家人","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20170331/Img485784431_ss.jpeg","url":"http://news.sohu.com/20170331/n485784428.shtml"},{"ctime":"2017-03-31 11:17","title":"法国数千华人集会 悼念遭法警察枪杀中国公民","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20170331/Img485748079_ss.jpeg","url":"http://news.sohu.com/20170331/n485758333.shtml"},{"ctime":"2017-03-31 11:31","title":"朴槿惠被拘能化妆吗？禁止染发 可擦粉底乳液","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20170331/Img485753553_ss.jpeg","url":"http://news.sohu.com/20170331/n485761179.shtml"},{"ctime":"2017-03-31 11:32","title":"马来西亚赴朝接人飞行员：飞离朝鲜才松了口气","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20170331/Img485758334_ss.jpeg","url":"http://news.sohu.com/20170331/n485761532.shtml"},{"ctime":"2017-03-31 11:50","title":"朴槿惠得知被捕：默默走进洗手间卸掉全部妆容","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20170331/Img485764337_ss.jpg","url":"http://news.sohu.com/20170331/n485764336.shtml"},{"ctime":"2017-03-31 11:53","title":"韩媒揭秘朴槿惠拘留所生活 设施齐全每顿四菜一汤","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20170331/Img485764999_ss.jpeg","url":"http://news.sohu.com/20170331/n485764997.shtml"},{"ctime":"2017-03-31 10:23","title":"漫长一天 朴槿惠被罢免21天后从受审到收押全纪录","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20170331/Img485748079_ss.jpeg","url":"http://news.sohu.com/20170331/n485748077.shtml"},{"ctime":"2017-03-31 10:53","title":"旧金山华裔街头莫名遭枪击身亡 警方正追捕枪手","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20170331/Img485753553_ss.jpeg","url":"http://news.sohu.com/20170331/n485753552.shtml"},{"ctime":"2017-03-31 09:07","title":"普京否认俄罗斯影响美国大选","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20170331/Img485728853_ss.jpeg","url":"http://news.sohu.com/20170331/n485735551.shtml"},{"ctime":"2017-03-31 09:08","title":"载\u201c世越号\u201d半潜船出发赴木浦新港 船体将被搬上岸","description":"搜狐国际","picUrl":"http://photocdn.sohu.com/20170331/Img485729329_ss.jpeg","url":"http://news.sohu.com/20170331/n485735940.shtml"}]
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
         * ctime : 2017-03-31 13:41
         * title : 马来西亚被困公民回国：在朝期间最担心的是家人
         * description : 搜狐国际
         * picUrl : http://photocdn.sohu.com/20170331/Img485784431_ss.jpeg
         * url : http://news.sohu.com/20170331/n485784428.shtml
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
