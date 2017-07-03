package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class VtexMeiNvBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-03-27 21:00","title":"冷艳妹子","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-03/27/20/20170327203801651-619336.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7723926-0-1.html"},{"ctime":"2017-03-27 21:00","title":"青丝飞扬","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-03/27/20/201703272039318611-619336.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7723933-0-1.html"},{"ctime":"2017-03-27 14:00","title":"[原创](AfterSchool)","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-03/27/12/201703271234078711-4797292.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7722563-0-1.html"},{"ctime":"2017-03-27 11:00","title":"美人[12P][贴图]","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-03/27/10/201703271036297411-2497165.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7722053-0-1.html"},{"ctime":"2017-03-27 10:00","title":"离开","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-03/26/18/20170326180912481-1876615.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7721157-0-1.html"},{"ctime":"2017-03-27 01:00","title":"美到骨子里","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-03/26/21/201703262141133461-5493522.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7721350-0-1.html"},{"ctime":"2017-03-27 00:00","title":"唯美","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-03/26/22/201703262229153241-1876615.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7721410-0-1.html"},{"ctime":"2017-03-27 00:00","title":"丽柜美模95（AMY 2017.03.23）","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-03/23/09/201703230927442751-2285289.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7714408-0-1.html"},{"ctime":"2017-03-26 23:00","title":"花丛里","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-03/26/19/201703261901151911-1876615.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7721199-0-1.html"},{"ctime":"2017-03-26 23:00","title":"早安","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-03/26/19/20170326190611371-1876615.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7721205-0-1.html"}]
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
         * ctime : 2017-03-27 21:00
         * title : 冷艳妹子
         * description : 华声美女
         * picUrl : http://image.hnol.net/c/2017-03/27/20/20170327203801651-619336.jpg
         * url : http://bbs.voc.com.cn/mm/meinv-7723926-0-1.html
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
