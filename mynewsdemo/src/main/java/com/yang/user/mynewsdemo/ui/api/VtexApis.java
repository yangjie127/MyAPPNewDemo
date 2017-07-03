package com.yang.user.mynewsdemo.ui.api;

import com.yang.user.mynewsdemo.ui.bean.VtexFootBallBean;
import com.yang.user.mynewsdemo.ui.bean.VtexGuoneiBean;
import com.yang.user.mynewsdemo.ui.bean.VtexHuabianBean;
import com.yang.user.mynewsdemo.ui.bean.VtexJokeBean;
import com.yang.user.mynewsdemo.ui.bean.VtexMeiNvBean;
import com.yang.user.mynewsdemo.ui.bean.VtexQiwenBean;
import com.yang.user.mynewsdemo.ui.bean.VtexSocialBean;
import com.yang.user.mynewsdemo.ui.bean.VtexTiYuBean;
import com.yang.user.mynewsdemo.ui.bean.VtexTravelBean;
import com.yang.user.mynewsdemo.ui.bean.VtexWorldBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by User on 2017/3/31.
 */

public interface VtexApis {
    public String HOST = "https://api.tianapi.com/";

    /**
     * 社会新闻
     * social/?key=APIKEY&num=10
     */

    @GET("{social}/")
    Call<VtexSocialBean> getSocialBean(@Path("social") String social , @Query("key") String key, @Query("num") int num , @Query("page") int page);


    /**
     * 国内新闻
     * guonei/?key=APIKEY&num=10
     */
    @GET("{guonei}/")
    Call<VtexGuoneiBean> getGuoneiBean(@Path("guonei") String guonei, @Query("key") String key, @Query("num") int num, @Query("page") int page);

    /**
     *国际新闻
     * world/?key=APIKEY&num=10
     *
     */

    @GET("{world}/")
    Call<VtexWorldBean> getWorldBean(@Path("world") String world, @Query("key") String key, @Query("num") int num, @Query("page") int page);

    /**
     *娱乐新闻
     * huabian/?key=APIKEY&num=10
     *
     */
    @GET("{huabian}/")
    Call<VtexHuabianBean> getHuabianBean(@Path("huabian") String huabian, @Query("key") String key, @Query("num") int num , @Query("page") int page);


    /**
     * 体育新闻
     *tiyu/?key=APIKEY&num=10
     */

    @GET("{tiyu}/")
    Call<VtexTiYuBean> getTiYuBean(@Path("tiyu") String tiyu, @Query("key") String key, @Query("num") int num, @Query("page") int page);

    /**
     * 足球新闻
     * football/?key=APIKEY&num=10
     */
    @GET("{football}/")
    Call<VtexFootBallBean> getFootBallBean(@Path("football") String football, @Query("key") String key, @Query("num") int num, @Query("page") int page);

    /**
     * 旅游咨询
     *travel/?key=APIKEY&num=10
     */
    @GET("{travel}/")
    Call<VtexTravelBean> getTravelBean(@Path("travel") String travel , @Query("key") String key, @Query("num") int num, @Query("page") int page);

    /**
     * 奇闻异事
     *qiwen/?key=APIKEY&num=10
     */
    @GET("{qiwen}/")
    Call<VtexQiwenBean> getQiwenBean(@Path("qiwen") String qiwen, @Query("key") String key, @Query("num") int num, @Query("page") int page);

    /**
     *美女图片
     * meinv/?key=APIKEY&num=10
     */
    @GET("{meinv}/")
    Call<VtexMeiNvBean> getMeiNvBean(@Path("meinv") String meinv, @Query("key") String key, @Query("num") int num, @Query("page") int page);

    /**
     * 笑话
     *https://api.tianapi.com/txapi/joke/?key=dae53cd0762f3bcc6a8285cd5ca64b9c&num=20&page=1
     */
    @GET("{txapi}/{joke}/")
    Call<VtexJokeBean> getJokeBean(@Path("txapi") String txapi, @Path("joke") String joke, @Query("key") String key, @Query("num") int num, @Query("page") int page);
}
