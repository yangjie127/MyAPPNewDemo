package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class VtexGuoneiBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-03-31 13:34","title":"北京商住房\u201c速冻\u201d：3天仅7套 交易降99.9%","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170331/Img485755806_ss.jpg","url":"http://news.sohu.com/20170331/n485783215.shtml"},{"ctime":"2017-03-31 13:43","title":"北京卫计委2017重点工作：将建雾霾健康防护专家组","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170331/Img485758665_ss.jpeg","url":"http://news.sohu.com/20170331/n485784999.shtml"},{"ctime":"2017-03-31 13:52","title":"宗国英任云南省副省长 任军号任省公安厅厅长","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170331/Img485785000_ss.png","url":"http://news.sohu.com/20170331/n485786380.shtml"},{"ctime":"2017-03-31 12:00","title":"台\u201c太阳花学运\u201d22名学生被告被判全部无罪","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170331/Img485747986_ss.jpeg","url":"http://news.sohu.com/20170331/n485765962.shtml"},{"ctime":"2017-03-31 12:27","title":"网络版银联终于来了 已完成首笔交易上线试运行","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170331/Img485755806_ss.jpg","url":"http://news.sohu.com/20170331/n485773029.shtml"},{"ctime":"2017-03-31 12:48","title":"济南：因卖淫嫖娼赌博被拘留将通知当事人家属","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170331/Img485758665_ss.jpeg","url":"http://news.sohu.com/20170331/n485777150.shtml"},{"ctime":"2017-03-31 11:03","title":"听习近平讲植树节的意义","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170331/Img485747986_ss.jpeg","url":"http://news.sohu.com/20170331/n485755805.shtml"},{"ctime":"2017-03-31 11:19","title":"清明假期京津冀及周边将遭遇一轮空气污染过程","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170331/Img485755806_ss.jpg","url":"http://news.sohu.com/20170331/n485758663.shtml"},{"ctime":"2017-03-31 11:29","title":"芬兰国家概况","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170331/Img485758665_ss.jpeg","url":"http://news.sohu.com/20170331/n485760777.shtml"},{"ctime":"2017-03-31 10:06","title":"教授：北京房价腰斩一半对经济不会有影响","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170331/Img485737959_ss.jpg","url":"http://news.sohu.com/20170331/n485743963.shtml"}]
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
         * ctime : 2017-03-31 13:34
         * title : 北京商住房“速冻”：3天仅7套 交易降99.9%
         * description : 搜狐国内
         * picUrl : http://photocdn.sohu.com/20170331/Img485755806_ss.jpg
         * url : http://news.sohu.com/20170331/n485783215.shtml
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
