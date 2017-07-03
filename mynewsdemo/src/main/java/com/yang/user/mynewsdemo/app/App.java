package com.yang.user.mynewsdemo.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by User on 2017/3/31.
 */

public class App extends Application{
    public static Context Appcontext;
    @Override
    public void onCreate() {
        super.onCreate();
        Appcontext = this.getApplicationContext();
    }
}
