package com.majeur.applicationsinfo;

import android.app.Application;

public class App extends Application {
    private static App mApp;

    public static App getInstance() {
        return mApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
    }
}
