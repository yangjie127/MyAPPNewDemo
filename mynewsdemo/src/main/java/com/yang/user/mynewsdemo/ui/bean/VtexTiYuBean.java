package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/31.
 */

public class VtexTiYuBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-03-30 15:53","title":"土耳其田径名将涉药被禁赛 两奥运银牌被剥夺","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p3.ifengimg.com/a/2017_13/89e7799ad1e5330_size25_w530_h441.jpg","url":"http://sports.ifeng.com/a/20170330/50864849_0.shtml"},{"ctime":"2017-03-30 13:01","title":"峨眉传奇布局全球，签约十六家战略合作俱乐部","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0330/3966D224560E5EF48DE1C28CE26E02527652C872_size52_w640_h427.jpeg","url":"http://sports.ifeng.com/a/20170330/50864562_0.shtml"},{"ctime":"2017-03-30 14:04","title":"4年情尽！华裔前花滑名将关颖珊离婚 丈夫提交离婚申请","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/a/2017_13/dbb3f3322ddcaef_size36_w593_h416.jpg","url":"http://sports.ifeng.com/a/20170330/50863988_0.shtml"},{"ctime":"2017-03-30 13:00","title":"张常宁出国路已被堵死？女排天才只能窝里横真的好吗","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0330/5FF63D30B70862314C0B007A7598F5E0F5BE8807_size19_w460_h392.jpeg","url":"http://sports.ifeng.com/a/20170330/50863647_0.shtml"},{"ctime":"2017-03-30 13:00","title":"中国女排洗牌！惠若琪魏秋月恐无缘奥运 郎平点朱婷当队长","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0330/4CA5B1E1BDA4B4EB294040F77E58025C7629CF69_size1354_w1320_h924.png","url":"http://sports.ifeng.com/a/20170330/50863648_0.shtml"},{"ctime":"2017-03-30 01:01","title":"史上最美长腿姑娘军团！新中国女排颜值要逆天","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0330/EAE7C935A6528CBDEB759584589AE82D0B9ABCFD_size672_w1320_h924.png","url":"http://sports.ifeng.com/a/20170330/50863680_0.shtml"},{"ctime":"2017-03-30 09:49","title":"刘国梁卸任男乒主帅！马龙恩师上位 招马琳王皓造豪阵","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0330/E6CCD41F75149F810791DB944438BA6AF780AD27_size1109_w1320_h924.png","url":"http://sports.ifeng.com/a/20170330/50863236_0.shtml"},{"ctime":"2017-03-30 00:19","title":"遗憾！邹市明无愧中国第一拳王 在亚洲却仅排第60！","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0330/488CDF7B365D9656E3D8172FA0C36C2DED98EB2E_size14_w640_h360.jpeg","url":"http://sports.ifeng.com/a/20170330/50861782_0.shtml"},{"ctime":"2017-03-30 08:00","title":"中国赛奥沙利文4-5爆冷出局 无缘出战丁俊晖","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0329/84BC5912CECD375B98A3C8CEFAD4A0698C5B086E_size212_w633_h385.png","url":"http://sports.ifeng.com/a/20170330/50861338_0.shtml"},{"ctime":"2017-03-30 00:57","title":"郎平口中下一个\u201c朱婷\u201d已在酝酿，这3人或带来惊喜","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0330/CF63494D72AD14D73A2991D294F356DE75132FCC_size692_w1320_h924.png","url":"http://sports.ifeng.com/a/20170330/50861378_0.shtml"}]
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
         * ctime : 2017-03-30 15:53
         * title : 土耳其田径名将涉药被禁赛 两奥运银牌被剥夺
         * description : 凤凰体育
         * picUrl : http://d.ifengimg.com/w145_h103/p3.ifengimg.com/a/2017_13/89e7799ad1e5330_size25_w530_h441.jpg
         * url : http://sports.ifeng.com/a/20170330/50864849_0.shtml
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
