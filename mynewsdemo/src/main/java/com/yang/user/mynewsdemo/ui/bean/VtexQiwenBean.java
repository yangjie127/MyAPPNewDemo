package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class VtexQiwenBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-07-26 00:00","title":"揭开：全球十二具最恐怖的木乃伊面纱","description":"猎奇奇闻","picUrl":"http://img9.lieqi.com/upload1/thumb/28/131773.jpg","url":"http://www.lieqi.com/read/44/131773/"},{"ctime":"2016-07-22 00:00","title":"中国军队在酒泉神秘消失惊人内幕曝光","description":"猎奇奇闻","picUrl":"http://img9.lieqi.com/upload1/thumb/28/131645.jpg","url":"http://www.lieqi.com/read/44/131645/"},{"ctime":"2016-07-22 00:00","title":"真的会碰之毙命？ 民间流传的被诅咒之物","description":"猎奇奇闻","picUrl":"http://img9.lieqi.com/upload1/thumb/28/131690.jpg","url":"http://www.lieqi.com/read/44/131690/"},{"ctime":"2016-07-20 00:00","title":"盘点全球十大离奇死亡事件","description":"猎奇奇闻","picUrl":"http://img9.lieqi.com/upload1/thumb/28/131613.jpg","url":"http://www.lieqi.com/read/44/131613/"},{"ctime":"2016-07-20 00:00","title":"揭秘一夫多妻的喀麦隆部落王国 首领娶妻过百","description":"猎奇奇闻","picUrl":"http://img9.lieqi.com/upload1/thumb/28/131614.jpg","url":"http://www.lieqi.com/read/44/131614/"},{"ctime":"2016-07-19 00:00","title":"无人卧房竟拍到灵异画面：吓出一身冷汗","description":"猎奇奇闻","picUrl":"http://img9.lieqi.com/upload1/thumb/28/131557.jpg","url":"http://www.lieqi.com/read/44/131557/"},{"ctime":"2016-07-15 00:00","title":"传说：玛雅人神秘消失 进入地心世界？","description":"猎奇奇闻","picUrl":"http://img9.lieqi.com/upload1/thumb/28/131468.jpg","url":"http://www.lieqi.com/read/44/131468/"},{"ctime":"2016-07-13 00:00","title":"惊魂！业主装修时从商铺内挖出棺材","description":"猎奇奇闻","picUrl":"http://img9.lieqi.com/upload1/thumb/28/131221.jpg","url":"http://www.lieqi.com/read/44/131221/"},{"ctime":"2016-07-14 00:00","title":"10大穿越时空铁证：南极上空竟然有时间之门","description":"猎奇奇闻","picUrl":"http://img9.lieqi.com/upload1/thumb/28/131317.jpg","url":"http://www.lieqi.com/read/44/131317/"},{"ctime":"2016-07-14 00:00","title":"中国这一地区天灾人祸频发：真相不寒而栗","description":"猎奇奇闻","picUrl":"http://img9.lieqi.com/upload1/thumb/28/131433.jpg","url":"http://www.lieqi.com/read/44/131433/"}]
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
         * ctime : 2016-07-26 00:00
         * title : 揭开：全球十二具最恐怖的木乃伊面纱
         * description : 猎奇奇闻
         * picUrl : http://img9.lieqi.com/upload1/thumb/28/131773.jpg
         * url : http://www.lieqi.com/read/44/131773/
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
