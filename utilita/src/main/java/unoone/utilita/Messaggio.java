package unoone.utilita;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by andreamolinari on 11/02/16.
 */

public class Messaggio {

    public static void toast(Context mcontext, String messaggio) {

        Toast toast = Toast.makeText(mcontext, messaggio, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public static void alertMessage(Context mcontext, String titolo, String messaggio) {

        AlertDialog.Builder builder = new AlertDialog.Builder(mcontext);
        builder.setTitle(titolo);
        builder.setMessage(messaggio);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.create().show();
    }

    public static void alertMessageCancelable(Context mcontext, String titolo, String messaggio) {

        AlertDialog.Builder builder = new AlertDialog.Builder(mcontext);
        builder.setTitle(titolo);
        builder.setMessage(messaggio);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.create().show();
    }
}