package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class GoldMobileBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-03-31 09:08","title":"经历S5的低谷 Note7爆炸:三星S8成了一款救赎之","description":"通信行业","picUrl":"http://cms-bucket.nosdn.127.net/572eed76a67144b495b383b90fd820b820170331090831.png","url":"http://tech.163.com/17/0331/09/CGRIT3H800097U7S.html"},{"ctime":"2017-03-31 09:19","title":"美国行人死亡人数创20年新高 智能手机或成主因","description":"通信行业","picUrl":"http://cms-bucket.nosdn.127.net/e6a75e05a1be4f85aa2567bf60cb17d020170331091901.png","url":"http://tech.163.com/17/0331/09/CGRJGFQM00097U7S.html"},{"ctime":"2017-03-31 09:34","title":"韩国最大电信运营商SK电讯或被迫放弃与华为合作","description":"通信行业","picUrl":"http://cms-bucket.nosdn.127.net/ccf7fd14405a4f29933b63088cc46a4b20170331093317.png","url":"http://tech.163.com/17/0331/09/CGRKBHGI00097U7S.html"},{"ctime":"2017-03-31 09:43","title":"网秦33.2亿元出售飞流移动和秀色秀场股份","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/4d03ec2d139d40eb949542d4f204dad520170331084745.png","url":"http://tech.163.com/17/0331/09/CGRKT4CO00097U7R.html"},{"ctime":"2017-03-31 09:48","title":"Buzzfeed可能明年上市 独角兽新媒体前景会好吗","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/9da12f6d8c5646779fbdf126293bc8d120170331070907.png","url":"http://tech.163.com/17/0331/09/CGRL62OM00097U7R.html"},{"ctime":"2017-03-31 06:57","title":"暴风净利下滑69% 电视成最大出血点","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/32157a50709c4d3ca9fea57abe7ec23220170331063721.png","url":"http://tech.163.com/17/0331/06/CGRBC0JL00097U7R.html"},{"ctime":"2017-03-31 06:59","title":"VR产业的下沉之路：攻坚战从B端开始","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/d1dd4f9174394d7990109a72eb99cd9420170331064904.jpeg","url":"http://tech.163.com/17/0331/06/CGRBFFJ100097U7R.html"},{"ctime":"2017-03-31 07:09","title":"中国概念股周四多数下跌 58同城跌2.19%","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/9da12f6d8c5646779fbdf126293bc8d120170331070907.png","url":"http://tech.163.com/17/0331/07/CGRC29VK00097U7R.html"},{"ctime":"2017-03-31 06:34","title":"FCC阻止多家网络运营商对穷人提供廉价上网服务","description":"通信行业","picUrl":"http://cms-bucket.nosdn.127.net/74eb1d89784a4ca091d40e9f447973cb20170331063412.png","url":"http://tech.163.com/17/0331/06/CGRA23AM00097U7S.html"},{"ctime":"2017-03-31 06:25","title":"专访杜悦：胜率只有10%，我为什么还要挑战扑A","description":"移动互联","picUrl":"http://cms-bucket.nosdn.127.net/6f1776f8f9244778b1c668cb57569ea720170330224051.png","url":"http://tech.163.com/17/0331/06/CGR9I02D00097U7R.html"}]
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
         * ctime : 2017-03-31 09:08
         * title : 经历S5的低谷 Note7爆炸:三星S8成了一款救赎之
         * description : 通信行业
         * picUrl : http://cms-bucket.nosdn.127.net/572eed76a67144b495b383b90fd820b820170331090831.png
         * url : http://tech.163.com/17/0331/09/CGRIT3H800097U7S.html
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
