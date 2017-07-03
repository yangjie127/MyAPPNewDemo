package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class GoldITBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-02-06 01:44","title":"入围谷歌Lunar XPrize大赛 这五款机器人即将登","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/1/13/133f6dba315aa13e7535743f5642f8a4.jpg","url":"http://tech.163.com/17/0206/01/CCIAE3FC00097U7T.html"},{"ctime":"2017-02-05 13:02","title":"董明珠再度炮轰:买回的技术都落后 中国人缺信心","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/52fbb936e1004f5482a9a12988e7729120170205130159.png","url":"http://tech.163.com/17/0205/13/CCGUPV8N00097U7T.html"},{"ctime":"2017-02-04 18:19","title":"厉害！这根特殊的光纤可以实现135亿人同时通话","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/8670e6a5caa148b9ad6154943aef334f20170204181401.png","url":"http://tech.163.com/17/0204/18/CCEUH1JP00097U7T.html"},{"ctime":"2017-02-04 13:20","title":"全球一半网站已用HTTPS：HTTP加速淘汰","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/2a523b26564c4680885ed35e54689e7520170204132026.png","url":"http://tech.163.com/17/0204/13/CCEDEMNV00097U7T.html"},{"ctime":"2017-02-04 13:22","title":"心碎！少年因为没钱放弃珍贵苹果藏品","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/7/7f/7fd2eace89366694a9d86a9bf2ce9954.jpg","url":"http://tech.163.com/17/0204/13/CCEDIGSP00097U7T.html"},{"ctime":"2017-02-04 07:04","title":"美官员：法拉第工厂缩水，产能由10万辆减至1万","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/29e0dbdd9f03410ca7134d556199932620170204070434.png","url":"http://tech.163.com/17/0204/07/CCDNUDJ400097U7T.html"},{"ctime":"2017-02-04 07:11","title":"北京 共享汽车为啥总是\u201c抢不到：目前仅几百辆","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/bc544d36d75d43448bdb5ad0af67ef6020170204071105.png","url":"http://tech.163.com/17/0204/07/CCDOA75400097U7T.html"},{"ctime":"2017-02-03 19:21","title":"苹果曝新专利，智能穿戴增强续航成当务之急","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/4779a38d2d084c8fa91179fad58500f920170203192047.png","url":"http://tech.163.com/17/0203/19/CCCFLSC400097U7T.html"},{"ctime":"2017-02-03 12:58","title":"特朗普发推感谢三星在美国开新工厂","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/catchpic/2/20/20ffa8ea36d0ae4136796005432f87fe.jpg","url":"http://tech.163.com/17/0203/12/CCBPPJLP00097U7T.html"},{"ctime":"2017-02-03 07:19","title":"GoPro第四季度营收5.41亿美元 净亏1.16亿美元","description":"网易IT","picUrl":"http://cms-bucket.nosdn.127.net/c64de03e9c584d8fb032bd8f60965dd020170202225542.png","url":"http://tech.163.com/17/0203/07/CCB6CBUG00097U7T.html"}]
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
         * ctime : 2017-02-06 01:44
         * title : 入围谷歌Lunar XPrize大赛 这五款机器人即将登
         * description : 网易IT
         * picUrl : http://cms-bucket.nosdn.127.net/catchpic/1/13/133f6dba315aa13e7535743f5642f8a4.jpg
         * url : http://tech.163.com/17/0206/01/CCIAE3FC00097U7T.html
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
