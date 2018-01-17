package unoone.errorutil;

import android.util.Log;

/**
 * Created by imac on 17/01/18.
 */

public class ErrorDebug {

    private static final String TAG = "SUPER_AWESOME_APP";

    public static void e(String message) {
        Log.e(TAG, message);
    }
}
