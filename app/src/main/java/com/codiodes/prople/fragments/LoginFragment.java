package com.codiodes.prople.fragments;


import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.codiodes.prople.PropleApp;
import com.codiodes.prople.R;
import com.codiodes.prople.utils.Utils;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    public static final int MIN_EMAIL_LENGTH = 6;
    @InjectView(R.id.etLoginUsername)
    EditText mUsername;

    @InjectView(R.id.etLoginPassword)
    EditText mPassword;

    @InjectView(R.id.cbTerms)
    CheckBox mTerms;

    @InjectView(R.id.signup)
    Button mSignUp;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.inject(this, view);

        //  Change typeface for password field.
        mPassword.setTypeface(Typeface.DEFAULT);
        mPassword.setTransformationMethod(new PasswordTransformationMethod());

        //  Remove background color of button.
        mSignUp.setBackgroundColor(0x00000000);
        return view;
    }

    @OnClick(R.id.btnLogin)
    public void login(View view) {
        String title = getActivity().getResources().getString(R.string.validation_fail);
        String subTitle;
        if (mUsername.getText().toString().isEmpty()) {
            subTitle = getActivity().getResources().getString(R.string.hint_username);
            Utils.showErrorDialog(getActivity(), title, subTitle);
        } else if (Utils.isValidEmail(mUsername.getText())) {
            subTitle = getActivity().getResources().getString(R.string.invalid_email);
            Utils.showErrorDialog(getActivity(), title, subTitle);
        } else if (mPassword.getText().toString().isEmpty()) {
            subTitle = getActivity().getResources().getString(R.string.hint_password);
            Utils.showErrorDialog(getActivity(), title, subTitle);
        } else if (mPassword.getText().length() < MIN_EMAIL_LENGTH) {
            subTitle = getActivity().getResources().getString(R.string.password_length);
            Utils.showErrorDialog(getActivity(), title, subTitle);
        } else if (!mTerms.isChecked()) {
            subTitle = getActivity().getResources().getString(R.string.agree_terms_condition);
            Utils.showErrorDialog(getActivity(), title, subTitle);
        } else {
            //TODO: Call login API

        }
    }

    @OnClick(R.id.signup)
    public void signup() {
        Log.i("SIGNUP", "SIGNUP");
    }
}
