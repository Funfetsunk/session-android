package org.thoughtcrime.securesms.util;

import android.app.Activity;
import android.content.Intent;

import network.loki.messenger.R;

public class Utils {
    private static int sTheme;
    public final static int THEME_DEFAULT = 0;
    public final static int THEME_PURPLE = 1;
    public final static int THEME_RED = 2;

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    /**
     * Set the theme of the activity, according to the configuration.
     */
    public static void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            default:
            case THEME_DEFAULT:
                activity.setTheme(R.style.Base_Theme_Session);
                break;
            case THEME_PURPLE:
                activity.setTheme(R.style.Base_Theme_Session_Purple);
                break;
            case THEME_RED:
                activity.setTheme(R.style.Base_Theme_Session_Red);
                break;
        }
    }
}