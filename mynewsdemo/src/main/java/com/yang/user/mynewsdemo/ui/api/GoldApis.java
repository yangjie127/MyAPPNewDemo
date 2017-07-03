package com.yang.user.mynewsdemo.ui.api;

import com.yang.user.mynewsdemo.ui.bean.GoldAppleBean;
import com.yang.user.mynewsdemo.ui.bean.GoldHealthBean;
import com.yang.user.mynewsdemo.ui.bean.GoldITBean;
import com.yang.user.mynewsdemo.ui.bean.GoldKeJiBean;
import com.yang.user.mynewsdemo.ui.bean.GoldMobileBean;
import com.yang.user.mynewsdemo.ui.bean.GoldNBABean;
import com.yang.user.mynewsdemo.ui.bean.GoldStartUpBean;
import com.yang.user.mynewsdemo.ui.bean.GoldVRBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by User on 2017/3/31.
 */

public interface GoldApis {
    public String HOST = "https://api.tianapi.com/";

    /**
     * It咨询
     * it/?key=APIKEY&num=10&page=10
     */

    @GET("{it}/")
    Call<GoldITBean> getGoldITBean(@Path("it") String it, @Query("key") String key,@Query("num") int num,@Query("page") int page);

    /**
     * VR咨询
     * vr/?key=APIKEY&num=10&page=10
     */
    @GET("{vr}/")
    Call<GoldVRBean> getGoldVRBean (@Path("vr")  String vr,@Query("key") String key,@Query("num") int num,@Query("page") int page);

    /**
     * 移动互联
     * mobile/?key=APIKEY&num=10
     */
    @GET("{mobile}/")
    Call<GoldMobileBean> getGoldMobileBean(@Path("mobile") String mobile,@Query("key") String key,@Query("num") int num ,@Query("page") int page);

    /**
     * 创业新闻
     * startup/?key=APIKEY&num=10
     */
    @GET("{startup}/")
    Call<GoldStartUpBean> getGoldStartUpBean(@Path("startup") String startup ,@Query("key") String key,@Query("num") int num,@Query("page") int page);

    /**
     * 科技新闻
     * keji/?key=APIKEY&num=10
     */

    @GET("{keji}/")
    Call<GoldKeJiBean> getGoldKeJiBean(@Path("keji") String keji, @Query("key") String key , @Query("num") int num, @Query("page") int page);

    /**
     * 苹果新闻
     * apple/?key=APIKEY&num=10&page=10
     */

    @GET("{apple}/")
    Call<GoldAppleBean> getGoldAppleBean (@Path("apple") String apple, @Query("key") String key , @Query("num") int num, @Query("page") int page);

    /**
     *
     * 健康知识
     * health/?key=APIKEY&num=10&page=10
     */
    @GET("{health}/")
    Call<GoldHealthBean> getGoldHealthBean (@Path("health") String health, @Query("key") String key , @Query("num") int num , @Query("page") int page);

    /**
     * NBA新闻
     *nba/?key=APIKEY&num=10
     */
    @GET("{nba}/")
    Call<GoldNBABean> getGoldNBABean (@Path("nba") String nba, @Query("key") String key, @Query("num") int num , @Query("page") int page);


}
