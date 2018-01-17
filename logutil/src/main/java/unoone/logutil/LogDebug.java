package unoone.logutil;

import android.util.Log;

/**
 * Created by imac on 17/01/18.
 */

public class LogDebug {

    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
