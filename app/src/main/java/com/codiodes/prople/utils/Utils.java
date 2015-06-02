package com.codiodes.prople.utils;

import android.app.Activity;
import android.text.TextUtils;

import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * Created by Salman on 6/2/2015.
 */
public class Utils {

    public static void showErrorDialog(Activity activity, String title, String subTitle) {
        new SweetAlertDialog(activity, SweetAlertDialog.ERROR_TYPE)
                .setTitleText(title)
                .setContentText(subTitle)
                .show();
    }

    public final static boolean isValidEmail(CharSequence target) {
        if (TextUtils.isEmpty(target)) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }
}
