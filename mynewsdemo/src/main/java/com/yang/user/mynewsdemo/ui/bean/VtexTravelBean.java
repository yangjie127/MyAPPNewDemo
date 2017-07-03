package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class VtexTravelBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-03-06 14:11","title":"中国两年修世界第二高吊桥 吓懵英国人","description":"网易旅游","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img1.cache.netease.com/travel/2015/12/15/2015121517410669f8b_550.jpg_180x130x1x85.jpg","url":"http://travel.163.com/15/1215/17/BAT4RRVP00063KE8.html"},{"ctime":"2016-03-06 14:11","title":"大陆雾霾飘到台湾 \u201c北霾南送\u201d如何破解？","description":"网易旅游","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img6.cache.netease.com/travel/2015/12/16/20151216093252ebefb_550.jpg_180x130x1x85.jpg","url":"http://travel.163.com/15/1216/09/BAURC9SB00063KE8.html"},{"ctime":"2016-03-06 14:11","title":"猛赞！微信可以申请续签港澳通行证啦！","description":"网易旅游","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img2.cache.netease.com/travel/2015/12/16/20151216104932bfd27_550.jpg_180x130x1x85.jpg","url":"http://travel.163.com/15/1216/10/BAUVLNBS00063KE8.html"},{"ctime":"2016-03-06 14:11","title":"那些为吃货们操碎了心的高科技懒人利器","description":"网易旅游","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img2.cache.netease.com/travel/2015/12/16/20151216113644b7621_550.jpg_180x130x1x85.jpg","url":"http://travel.163.com/15/1216/11/BAV2NFJL00063KE8.html"},{"ctime":"2016-03-06 14:11","title":"像只老虎去战斗！大口吃生肉的青海於菟舞","description":"网易旅游","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img5.cache.netease.com/travel/2015/12/16/20151216134156ded25_550.jpg_180x130x1x85.jpg","url":"http://travel.163.com/15/1216/13/BAV9MMOF00063KE8.html"},{"ctime":"2016-03-06 14:11","title":"[易游人]穿越西伯利亚的四季","description":"网易旅游","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img4.cache.netease.com/travel/2015/12/16/20151216114614ea466.jpg_180x130x1x85.jpg","url":"http://travel.163.com/special/travelease98/"},{"ctime":"2016-03-06 14:11","title":"出国不逛逛当地市场可就亏大了","description":"网易旅游","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img1.cache.netease.com/catchpic/2/2B/2B59D7332B250F33A622629F3A9D01A2.jpg_180x130x1x85.jpg","url":"http://travel.163.com/15/0909/16/B3383FM700063KE8.html"},{"ctime":"2016-03-06 14:11","title":"清明上河图重现故宫 千名游客排长队参观","description":"网易旅游","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img1.cache.netease.com/catchpic/2/21/215FCDAA0D1E4F437C9B84CDFAF5AD3A.jpg_180x130x1x85.jpg","url":"http://travel.163.com/15/0910/09/B351DDVB00063JSA.html"},{"ctime":"2016-03-06 14:11","title":"国庆黄金周好去处 10大长途旅行目的地推荐","description":"网易旅游","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img3.cache.netease.com/travel/2015/9/9/201509091707038f9fb.jpg_180x130x1x85.jpg","url":"http://travel.163.com/15/0910/09/B352U0F600063KE8.html"},{"ctime":"2016-03-06 14:11","title":"冰雪奇缘：追踪阿拉斯加的狩猎文化","description":"网易旅游","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img5.cache.netease.com/travel/2015/9/10/2015091011214228cfd_550.jpg_180x130x1x85.jpg","url":"http://travel.163.com/15/0910/11/B3595F2J00063KE8.html"}]
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
         * ctime : 2016-03-06 14:11
         * title : 中国两年修世界第二高吊桥 吓懵英国人
         * description : 网易旅游
         * picUrl : http://imgsize.ph.126.net/?imgurl=http://img1.cache.netease.com/travel/2015/12/15/2015121517410669f8b_550.jpg_180x130x1x85.jpg
         * url : http://travel.163.com/15/1215/17/BAT4RRVP00063KE8.html
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
