package com.marlonjones.gyrochecklib;

import android.app.Activity;
import android.view.ViewGroup;

public class GyroCheck {

    public static void addTo(Activity activity) {
        ((ViewGroup) activity.findViewById(android.R.id.content)).addView(new GyroView(activity));
    }

}
