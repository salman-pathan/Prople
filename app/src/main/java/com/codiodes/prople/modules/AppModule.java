package com.codiodes.prople.modules;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;

import com.codiodes.prople.PropleApp;
import com.codiodes.prople.activities.MainActivity;
import com.codiodes.prople.fragments.LoginFragment;
import com.codiodes.prople.utils.FragmentHelper;
import com.codiodes.prople.utils.Utils;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Salman on 6/2/2015.
 */

@Module(
        injects = {
                MainActivity.class,
                LoginFragment.class,
                FragmentHelper.class
        },
        library = true,
        complete = false
)
public class AppModule {

    final PropleApp app;

    public AppModule(PropleApp app) {
        this.app = app;
    }
}
