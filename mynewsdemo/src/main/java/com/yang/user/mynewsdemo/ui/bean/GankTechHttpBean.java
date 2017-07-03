package com.yang.user.mynewsdemo.ui.bean;

import java.util.List;

/**
 * Created by User on 2017/3/23.
 */

public class GankTechHttpBean {
    /**
     * error : false
     * results : [{"_id":"58d2fd54421aa90f131786b9","createdAt":"2017-03-23T06:40:20.505Z","desc":"成本最低的夜间模式实现，以及各种填坑！！","images":["http://img.gank.io/53075196-fce2-45f0-b772-16935e7fa0f0"],"publishedAt":"2017-03-23T11:44:38.634Z","source":"web","type":"Android","url":"http://www.jianshu.com/p/abcd4574b8c3","used":true,"who":"Paul_ZJ"},{"_id":"58d33db9421aa90efc4fb719","createdAt":"2017-03-23T11:15:05.491Z","desc":"Android 开发的一些 Tips 集合","images":["http://img.gank.io/b9b93d8c-94c6-4f8b-ad7b-042ca81a071f"],"publishedAt":"2017-03-23T11:44:38.634Z","source":"chrome","type":"Android","url":"https://github.com/nisrulz/android-tips-tricks","used":true,"who":"代码家"},{"_id":"58d34200421aa95810795cc6","createdAt":"2017-03-23T11:33:20.539Z","desc":"又一个 MD 风格的 ImagePicker","images":["http://img.gank.io/ad775edd-16d2-4b11-8050-c02923105969"],"publishedAt":"2017-03-23T11:44:38.634Z","source":"chrome","type":"Android","url":"https://github.com/myinnos/AwesomeImagePicker","used":true,"who":"daimajia"},{"_id":"58d3423b421aa90f033451c6","createdAt":"2017-03-23T11:34:19.290Z","desc":"简洁的一个数字输入键盘效果","images":["http://img.gank.io/85ecda37-2e8b-400b-bb54-9f6fa57a9fde"],"publishedAt":"2017-03-23T11:44:38.634Z","source":"chrome","type":"Android","url":"https://github.com/StephaneBg/SimpleNumberPicker","used":true,"who":"嗲马甲 "},{"_id":"58d34278421aa90efc4fb71c","createdAt":"2017-03-23T11:35:20.957Z","desc":"Android6.0运行时权限简析和一个开源库介绍，通过回调方式一行代码完成动态权限申请","publishedAt":"2017-03-23T11:44:38.634Z","source":"web","type":"Android","url":"http://www.jianshu.com/p/cdcbd3038902","used":true,"who":"Abe"},{"_id":"58d1eae9421aa90f131786b0","createdAt":"2017-03-22T11:09:29.904Z","desc":"Android Picture in Picture 效果 Demo。","images":["http://img.gank.io/41541b3b-4d98-44e3-a595-f47567544a82"],"publishedAt":"2017-03-22T11:47:09.555Z","source":"chrome","type":"Android","url":"https://github.com/googlesamples/android-PictureInPicture","used":true,"who":"带马甲"},{"_id":"58d1eb7b421aa95810795caf","createdAt":"2017-03-22T11:11:55.134Z","desc":"Android SpringAnimation 安卓模拟弹簧动画。","images":["http://img.gank.io/a74c3e42-1801-48c8-acb3-c7a68b30c96a"],"publishedAt":"2017-03-22T11:47:09.555Z","source":"chrome","type":"Android","url":"http://www.jianshu.com/p/870334f2e2d4","used":true,"who":"allen"},{"_id":"58d1ee83421aa90f131786b2","createdAt":"2017-03-22T11:24:51.435Z","desc":"基于 MD 实现的一些 List Item 的模板布局，可以帮助大家在开发的时候省时间。","images":["http://img.gank.io/1701f633-68db-422c-b94c-c8e20d23fe64"],"publishedAt":"2017-03-22T11:47:09.555Z","source":"chrome","type":"Android","url":"https://github.com/lurbas/ListItemView","used":true,"who":"士兵"},{"_id":"58cbf72b421aa90f13178688","createdAt":"2017-03-17T22:48:11.282Z","desc":"Android存储路径你了解多少？","images":["http://img.gank.io/f58881ff-000f-4e7e-8b72-25112be5b830"],"publishedAt":"2017-03-21T12:19:46.895Z","source":"web","type":"Android","url":"http://itfeifei.win/2017/03/17/Android%E5%AD%98%E5%82%A8%E8%B7%AF%E5%BE%84%E4%BD%A0%E4%BA%86%E8%A7%A3%E5%A4%9A%E5%B0%91/","used":true,"who":null},{"_id":"58cca37b421aa95810795c86","createdAt":"2017-03-18T11:03:23.757Z","desc":"Android TensorFlow MachineLearning Example (Building TensorFlow for Android)","images":["http://img.gank.io/75f15c11-3fc0-4426-ac3b-d91352d3afd0","http://img.gank.io/76ef2be4-e495-4f72-9809-334d288ebfda"],"publishedAt":"2017-03-21T12:19:46.895Z","source":"web","type":"Android","url":"https://github.com/MindorksOpenSource/AndroidTensorFlowMachineLearningExample","used":true,"who":"AMIT SHEKHAR"}]
     */
    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 58d2fd54421aa90f131786b9
         * createdAt : 2017-03-23T06:40:20.505Z
         * desc : 成本最低的夜间模式实现，以及各种填坑！！
         * images : ["http://img.gank.io/53075196-fce2-45f0-b772-16935e7fa0f0"]
         * publishedAt : 2017-03-23T11:44:38.634Z
         * source : web
         * type : Android
         * url : http://www.jianshu.com/p/abcd4574b8c3
         * used : true
         * who : Paul_ZJ
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}
