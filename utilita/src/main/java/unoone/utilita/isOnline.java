package unoone.utilita;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


/**
 * Created by andreamolinari on 04/11/14.
 */
public class isOnline {

    private static Context context;

    public static boolean isOnline(Context c) {

        context = c;

        ConnectivityManager cm = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    public static void alertNotOnline(Context c) {

        context = c;

        new AlertDialog.Builder(context, AlertDialog.THEME_HOLO_LIGHT)
                .setTitle("Attenzione !!")
                .setMessage("Connessione Internet assente")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
        return;
    }
}
