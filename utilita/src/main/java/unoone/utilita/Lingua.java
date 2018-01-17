package unoone.utilita;

import java.util.Locale;

/**
 * Created by imac on 10/11/17.
 */

public class Lingua {

    public static String LinguaLocaleImpostata() {

        String lingua = "";

        // Recupera il tipo di lingua selezionata sul device
        lingua = Locale.getDefault().getLanguage();

        return lingua;
    }
}
