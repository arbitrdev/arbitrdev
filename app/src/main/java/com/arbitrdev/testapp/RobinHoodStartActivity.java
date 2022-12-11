package com.arbitrdev.testapp;

import com.arbitrdev.wsc.StartActivity;

public class RobinHoodStartActivity extends StartActivity {

    @Override
    public Class<?> getPlaceholderStartActivity() {
        return ExampleActivity.class;
    }

    @Override
    public Class<?> getAlartReceiver() {
        return NotificationReceiver.class;
    }

    @Override
    public String getPackageName() {
        return BuildConfig.APPLICATION_ID;
    }

    @Override
    public int getSplashImage() {
        return R.drawable.com_facebook_button_icon;
    }

    @Override
    public String getStartReviewDateYyyyMMdd() {
        return "2022-12-12";
    }
}
