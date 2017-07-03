package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class VtexHuabianBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-03-27 10:32","title":"王中磊出席博鳌 谈\u201c文创强国\u201d践行之道","description":"腾讯明星","picUrl":"","url":"http://ent.qq.com/a/20170327/027068.htm"},{"ctime":"2017-03-27 10:48","title":"张杨智子惊艳亮相国际时装周 黑衣长腿秒杀众人","description":"腾讯明星","picUrl":"","url":"http://ent.qq.com/a/20170327/025424.htm"},{"ctime":"2017-03-27 11:04","title":"女星怀孕4个月血溅舞台：你们怎么忍心这样对孕妇","description":"腾讯明星","picUrl":"","url":"http://ent.qq.com/a/20170327/019168.htm"},{"ctime":"2017-03-27 11:17","title":"影响世界华人盛典将举办 成龙获奖姚晨提名","description":"腾讯明星","picUrl":"","url":"http://ent.qq.com/a/20170327/019918.htm"},{"ctime":"2017-03-27 11:37","title":"曾经在CD封面上惊艳我们的人 如今都已变了模样","description":"腾讯明星","picUrl":"","url":"http://ent.qq.com/a/20170327/013746.htm"},{"ctime":"2017-03-27 13:33","title":"吉克隽逸露营照曝光 网友：放开那小子冲我来","description":"腾讯明星","picUrl":"","url":"http://ent.qq.com/a/20170327/024862.htm"},{"ctime":"2017-03-27 13:43","title":"蔡少芬为女儿庆4岁生日 好友朱茵也带宝宝来庆贺","description":"腾讯明星","picUrl":"","url":"http://ent.qq.com/a/20170327/025226.htm"},{"ctime":"2017-03-27 13:48","title":"彬彬扫大佬终章开启 博鳌胜女时代强势来袭","description":"腾讯明星","picUrl":"","url":"http://ent.qq.com/a/20170327/025375.htm"},{"ctime":"2017-03-27 13:54","title":"孙宁小清新形象出席公益活动 为流浪动物再发声","description":"腾讯明星","picUrl":"","url":"http://ent.qq.com/a/20170327/025557.htm"},{"ctime":"2017-03-27 14:12","title":"蒋梦婕拍摄现场被殴打 带伤参加发布会","description":"腾讯明星","picUrl":"","url":"http://ent.qq.com/a/20170327/026204.htm"}]
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
         * ctime : 2017-03-27 10:32
         * title : 王中磊出席博鳌 谈“文创强国”践行之道
         * description : 腾讯明星
         * picUrl :
         * url : http://ent.qq.com/a/20170327/027068.htm
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
