package com.codiodes.prople.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.codiodes.prople.R;
import com.codiodes.prople.fragments.LoginFragment;
import com.codiodes.prople.utils.FragmentHelper;

import javax.inject.Inject;


public class MainActivity extends ActionBarActivity {

    @Inject
    FragmentHelper mFragmentHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentHelper = new FragmentHelper(this);
        mFragmentHelper.addFragment(new LoginFragment(), R.id.main_activity_container);
    }
}
