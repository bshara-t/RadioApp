package com.hackathon.radioetzionapp.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.Snackbar;
import android.view.View;

import com.hackathon.radioetzionapp.R;

public class Utils {


    public static boolean hasInternet(Context context){
        //if we have internet >> true, otherwise>> false
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        assert connectivityManager != null;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static void displayMsg(String msg, View parentView){
        // display snackbar msg to user
        final Snackbar myMsg = Snackbar.make(parentView,msg,Snackbar.LENGTH_LONG);
        myMsg.setAction(R.string.ok, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMsg.dismiss();
            }
        });
        myMsg.show();
    }
}
