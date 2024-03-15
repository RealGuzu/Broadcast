package com.example.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class AirplaneModeReceiver extends BroadcastReceiver {

    TextView txt;


    @Override
    public void onReceive(Context context, Intent intent) {


//            this method is called when the broadcast receiver
//            receives a broadcast

        if(intent.getAction() != null &&
        intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED));


        boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);

            //Looks to see if it Airplane mode is On or Not then displays a toast showing the String(msg)
        String msg = isAirplaneModeOn ? "Airplane mode is ON" : "Airplane mode is off";

        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();


    }
}
