package unoone.utilita;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andreamolinari on 18/02/16.
 */

public class EmailConvalid {

    private Pattern p;
    private Matcher match;
    private static final String exEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailConvalid() {p = Pattern.compile(exEmail);}

    public boolean controllo(final String email) {
        match = p.matcher(email);
        return match.matches();
    }
}
