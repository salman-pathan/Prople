package com.codiodes.prople;

import android.app.Application;

import com.codiodes.prople.modules.AppModule;

import java.util.Arrays;

import dagger.ObjectGraph;

/**
 * Created by Salman on 6/2/2015.
 */
public class PropleApp extends Application {

    ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(getModules());
    }

    public void inject(Object target) {
        objectGraph.inject(target);
    }

    public Object[] getModules() {
        return Arrays.asList(new AppModule(this)).toArray();
    }
}
