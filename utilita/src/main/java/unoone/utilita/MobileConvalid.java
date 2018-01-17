package unoone.utilita;

import java.util.regex.Pattern;

/**
 * Created by andreamolinari on 18/02/16.
 */

public class MobileConvalid {

    public static boolean isValidMobile(String number)
    {
        boolean check;
        if(!Pattern.matches("[a-zA-Z]+", number))
        {
            if(number.length() < 8 || number.length() > 13)
            {
                check = false;
            }
            else
            {
                check = true;
            }
        }
        else
        {
            check=false;
        }
        return check;
    }
}
