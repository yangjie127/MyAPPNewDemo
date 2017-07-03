package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class GoldVRBean {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-12-12 08:12","title":"传微软Surface Book 2将支持4K视频及VR","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/a2a2345dfb7a4500bbec8348ce6dfcfc20161212081103.png","url":"http://tech.163.com/16/1212/08/C82QARNQ00097U7U.html"},{"ctime":"2016-12-12 08:54","title":"Oculus发布WebVR浏览器Carmel开发者预览版","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/fd9dd82b94a34a5898bc2f0a7270450b20161212085359.png","url":"http://tech.163.com/16/1212/08/C82SPD2T00097VK4.html"},{"ctime":"2016-12-12 11:50","title":"知名游戏开发商：VR目前不赚钱，想办法自求活路","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/00785fe506534e5681e39e47e3c32f8720161212114854.png","url":"http://tech.163.com/16/1212/11/C836R0RF00097U7U.html"},{"ctime":"2016-12-11 08:50","title":"新科学研究：VR能否解决\u201c时间旅行悖论\u201d","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/605a9b5f94e44cad8128e69ddd4a9bb120161211085018.png","url":"http://tech.163.com/16/1211/08/C80A4MMJ00097U7U.html"},{"ctime":"2016-12-11 08:51","title":"新说法：姿势摇摆让女性更容易产生晕动症","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/64526bbaf66840f6ae6f3930e47eb59320161211085056.png","url":"http://tech.163.com/16/1211/08/C80A5UMK00097U7U.html"},{"ctime":"2016-12-11 08:51","title":"让人分心缓解痛苦 虚拟现实被用于孕妇分娩","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/3f9b1b758f9344d98050dca056d7ef5820161211085138.png","url":"http://tech.163.com/16/1211/08/C80A775000097U7U.html"},{"ctime":"2016-12-11 08:52","title":"最高端VR体验馆在巴黎开业，20分钟12欧元","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/f1f0a87ce8ec4980a462b8ee0e32ebe420161211085218.png","url":"http://tech.163.com/16/1211/08/C80A8AUF00097U7U.html"},{"ctime":"2016-12-11 08:53","title":"尼康调查研究：90%的美国人看好360度视频技术","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/7fcbd42379b341d6a0817071480bbbb020161211085252.png","url":"http://tech.163.com/16/1211/08/C80A9P1H00097U7U.html"},{"ctime":"2016-12-11 08:54","title":"VR/AR成主流 如何在体验中植入广告不招人烦？","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/0dfe42269ad740708e062eaeb0e2377520161211085346.png","url":"http://tech.163.com/16/1211/08/C80AB6EO00097U7U.html"},{"ctime":"2016-12-11 08:54","title":"《纽约时报》推360度黑白影片 让你和巨星搭戏","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/9ee6922b64a649b39267168c5de7b2e920161211085426.png","url":"http://tech.163.com/16/1211/08/C80ACE9H00097U7U.html"}]
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
         * ctime : 2016-12-12 08:12
         * title : 传微软Surface Book 2将支持4K视频及VR
         * description : 网易VR
         * picUrl : http://cms-bucket.nosdn.127.net/a2a2345dfb7a4500bbec8348ce6dfcfc20161212081103.png
         * url : http://tech.163.com/16/1212/08/C82QARNQ00097U7U.html
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
