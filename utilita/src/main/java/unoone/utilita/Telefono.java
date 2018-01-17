package unoone.utilita;

import android.os.Build;

/**
 * Created by andreamolinari on 21/07/16.
 */

public class Telefono {

    public static String VersioneApp() {

        return BuildConfig.VERSION_NAME;
    }

    public static int VersioneAppCode() {

        return BuildConfig.VERSION_CODE;
    }

    public static String ReleaseSO() {

        return Build.VERSION.RELEASE;
    }

    public static int SDK() {

        return Build.VERSION.SDK_INT;
    }

    public static String Brand() {

        return Build.BRAND;
    }

    public static String Modello() {

        return Build.MODEL;
    }
}
