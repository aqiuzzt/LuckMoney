package com.aqiu.luckymoney;

import android.app.Application;

import com.flurry.android.FlurryAgent;

/**
 * Created by zhou on 16-2-13.
 */
public class LuckyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlurryAgent.init(this, "85S4J7SKEAYPY9MR");
    }
}
