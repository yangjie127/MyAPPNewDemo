package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class GoldHealthBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-03-31 09:33","title":"看病太贵？应该让医生的技术更值钱","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/f68463b1d1424270a8b47ebd52e31f6820170331093151.png_150x100x1x85.jpg","url":"http://jiankang.163.com/17/0331/09/CGRK9OSK0038804U.html"},{"ctime":"2017-03-31 09:38","title":"20颗卵子能卖2.5万？ 医生：别拿生命冒险","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/9c4745b6b84b438b91c939d1d07e682420170331093755.png_150x100x1x85.jpg","url":"http://jiankang.163.com/17/0331/09/CGRKIKTA0038804U.html"},{"ctime":"2017-03-30 15:29","title":"看病更方便！北京推18项改善医疗服务措施","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/3592e64d058648169a215f58ad28d57620170330152641.jpeg_150x100x1x85.jpg","url":"http://jiankang.163.com/17/0330/15/CGPM91FO0038804U.html"},{"ctime":"2017-03-30 15:31","title":"医生没时间写病历？让患者\u201c写\u201d效果更好","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/b62ed60366874bbe9064a80dcecf8f0920170330153109.png_150x100x1x85.jpg","url":"http://jiankang.163.com/17/0330/15/CGPMCLT60038804U.html"},{"ctime":"2017-03-30 13:20","title":"我国60岁以上老年人已超过2.3亿！","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/10c65254fab348c79a514ec7f877a01c20170330131956.png_150x100x1x85.jpg","url":"http://jiankang.163.com/17/0330/13/CGPETAR70038804U.html"},{"ctime":"2017-03-29 16:49","title":"科学家用菠菜叶培育出\u201c心脏组织\u201d","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/4f3eddec42e14313b5486d340f9bd64b20170329164954.png_150x100x1x85.jpg","url":"http://jiankang.163.com/17/0329/16/CGN8G2820038804U.html"},{"ctime":"2017-03-29 16:55","title":"中国科学家发明人工喉 助聋哑人开口说话","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/30756135b60140b8805bbbb701b0bead20170329165458.png_150x100x1x85.jpg","url":"http://jiankang.163.com/17/0329/16/CGN8PHSF0038804U.html"},{"ctime":"2017-03-29 14:29","title":"缺乏标准监管难度大 互联网医院经受大考","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/9bd5d88dc79d4075a903b4bdfa90774920170329142935.png_150x100x1x85.jpg","url":"http://jiankang.163.com/17/0329/14/CGN0F56H0038804U.html"},{"ctime":"2017-03-28 15:26","title":"教科书将被改写？肺居然是重要造血器官！","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/1181659322e345e7a6679fc4b731a57220170328152636.png_150x100x1x85.jpg","url":"http://jiankang.163.com/17/0328/15/CGKHAQO20038804U.html"},{"ctime":"2017-03-28 15:42","title":"县级医院专科排座次 看病不必再往省会跑","description":"网易健康","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/a14d48dd485d42c1811cd8cc2f85023120170328154055.png_150x100x1x85.jpg","url":"http://jiankang.163.com/17/0328/15/CGKI8DIL0038804U.html"}]
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
         * ctime : 2017-03-31 09:33
         * title : 看病太贵？应该让医生的技术更值钱
         * description : 网易健康
         * picUrl : http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/f68463b1d1424270a8b47ebd52e31f6820170331093151.png_150x100x1x85.jpg
         * url : http://jiankang.163.com/17/0331/09/CGRK9OSK0038804U.html
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
