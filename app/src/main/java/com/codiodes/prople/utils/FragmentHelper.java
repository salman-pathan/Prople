package com.codiodes.prople.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;

import javax.inject.Inject;

/**
 * Created by Salman on 6/2/2015.
 */
public class FragmentHelper {

    static ActionBarActivity activity;

    @Inject
    public FragmentHelper(ActionBarActivity activity) {
        this.activity = activity;
    }

    public static void addFragment(Fragment fragment, int containerId) {
        FragmentTransaction transaction = activity.getSupportFragmentManager().beginTransaction();
        transaction.add(containerId, fragment);
        transaction.commit();
    }
}
