package unoone.utilita;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by andreamolinari on 15/02/16.
 */

public class Data {

    /*
        Rigira la data Giorno Mese Anno di Twitter
     */
    public static String convertiDataTwitter(String data) {

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy", Locale.US);
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

            Date dateIn = formatter.parse(data);
            String newData = df.format(dateIn);

            return newData;

        } catch (ParseException e1)

        {
            System.out.println(e1.getMessage());
            return data.replace("CEST", "");
        }

    }


    /*
        Rigira la data Giorno Mese Anno
    */
    public static String convertiData(String data) {

        if (data.equals("0001-01-01T00:00:00")) {
            return "";
        }

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            Date dateIn = formatter.parse(data);

            String newData = df.format(dateIn);

            return newData;

        } catch (ParseException e1)

        {}

        return "";
    }


    /*
        Rigira la data in Ora Minuti
    */
    public static String convertiOra(String data) {

        if (data.equals("0001-01-01T00:00:00")) {
            return "";
        }

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            DateFormat df = new SimpleDateFormat("HH:mm");

            Date dateIn = formatter.parse(data);

            String newData = df.format(dateIn);

            return newData;

        } catch (ParseException e1)

        {}

        return "";
    }


    /*
        Converte la data da Stringa in Data
    */
    public static Date convertiStringToData(String data) {

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            Date dateIn = formatter.parse(data);

            return dateIn;

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    /*
    Converte la data da Stringa in Data
*/
    public static Date convertiStringToData2(String data) {

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Date dateIn = formatter.parse(data);

            return dateIn;

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    /*
        Riporta il giorno della data
    */
    public static String riportaGiorno(String data) {

        if (data.equals("0001-01-01T00:00:00")) {
            return "";
        }

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            DateFormat df = new SimpleDateFormat("dd");

            Date dateIn = formatter.parse(data);

            String newData = df.format(dateIn);

            return newData;

        } catch (ParseException e1)

        {}

        return "";
    }

    /*
        Riporta il mese della data
    */
    public static String riportaMese(String data) {

        if (data.equals("0001-01-01T00:00:00")) {
            return "";
        }

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            DateFormat df = new SimpleDateFormat("MM");

            Date dateIn = formatter.parse(data);

            String newData = df.format(dateIn);

            return newData;

        } catch (ParseException e1)

        {}

        return "";
    }

    /*
        Riporta l'anno della data
    */
    public static String riportaAnno(String data) {

        if (data.equals("0001-01-01T00:00:00")) {
            return "";
        }

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            DateFormat df = new SimpleDateFormat("yyyy");

            Date dateIn = formatter.parse(data);

            String newData = df.format(dateIn);

            return newData;

        } catch (ParseException e1)

        {}

        return "";
    }

    /*
        Riporta l'ora della data
    */
    public static String riportaOra(String data) {

        if (data.equals("0001-01-01T00:00:00")) {
            return "";
        }

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            DateFormat df = new SimpleDateFormat("HH");

            Date dateIn = formatter.parse(data);

            String newData = df.format(dateIn);

            return newData;

        } catch (ParseException e1)

        {}

        return "";
    }

    /*
        Riporta i minuti della data
    */
    public static String riportaMinuti(String data) {

        if (data.equals("0001-01-01T00:00:00")) {
            return "";
        }

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            DateFormat df = new SimpleDateFormat("mm");

            Date dateIn = formatter.parse(data);

            String newData = df.format(dateIn);

            return newData;

        } catch (ParseException e1)

        {}

        return "";
    }

    /*
        Rigira la data Giorno Mese in Lettere Anno
    */
    public static String convertiDataMeseLettere(String data) {

        if (data.equals("0001-01-01T00:00:00")) {
            return "";
        }

        try {
            Locale.setDefault(Locale.ITALIAN);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            DateFormat dfGiorno = new SimpleDateFormat("dd");
            DateFormat dfMese = new SimpleDateFormat("MMMM");
            DateFormat dfAnno = new SimpleDateFormat("yyyy");

            Date dateIn = formatter.parse(data);

            String newData = dfGiorno.format(dateIn) + " " + dfMese.format(dateIn).substring(0,1).toUpperCase() + dfMese.format(dateIn).substring(1) + " " + dfAnno.format(dateIn);

            return newData;

        } catch (ParseException e1)

        {}

        return "";
    }


    /*
        Riporta l'anno della data
    */
    public static String riportaMeseAnno(String data) {

        if (data.equals("0001-01-01T00:00:00")) {
            return "";
        }

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            DateFormat mese = new SimpleDateFormat("MM");
            DateFormat anno = new SimpleDateFormat("yyyy");

            Date dateIn = formatter.parse(data);

            String newDataMese = mese.format(dateIn);
            String newDataAnno = anno.format(dateIn);
            String meseLettere;

            switch (newDataMese) {

                case "01":
                    meseLettere = "GEN";
                    break;

                case "02":
                    meseLettere = "FEB";
                    break;

                case "03":
                    meseLettere = "MAR";
                    break;

                case "04":
                    meseLettere = "APR";
                    break;

                case "05":
                    meseLettere = "MAG";
                    break;

                case "06":
                    meseLettere = "GIU";
                    break;

                case "07":
                    meseLettere = "LUG";
                    break;

                case "08":
                    meseLettere = "AGO";
                    break;

                case "09":
                    meseLettere = "SET";
                    break;

                case "10":
                    meseLettere = "OTT";
                    break;

                case "11":
                    meseLettere = "NOV";
                    break;

                case "12":
                    meseLettere = "DIC";
                    break;

                default:
                    meseLettere = "...";
            }


            return meseLettere + " " + newDataAnno;

        } catch (ParseException e1)

        {}

        return "";
    }




    /*
        Rigira la data Giorno Mese Anno + Ora Minuti Secondi
     */
    public static String convertiDataOra(String data) {

        if (data.equals("0001-01-01T00:00:00")) {
            return "";
        }

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            Date dateIn = formatter.parse(data);

            String newData = df.format(dateIn);

            return newData;

        } catch (ParseException e1)

        {}

        return "";
    }


    /*
        Riporta la data corrente
     */
    public static String riportaDataCorrente() {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Date today = Calendar.getInstance().getTime();

        String dataToday = df.format(today);

        return dataToday;
    }


    /*
        Riporta la data e ora corrente
     */
    public static String riportaDataOraCorrente() {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date today = Calendar.getInstance().getTime();

        String dataToday = df.format(today);

        return dataToday;
    }


    public static String riportaGiornoCorrente() {

        DateFormat df = new SimpleDateFormat("dd");

        Date today = Calendar.getInstance().getTime();

        String dataToday = df.format(today);

        return dataToday;
    }

    public static String riportaMeseCorrente() {

        DateFormat df = new SimpleDateFormat("MM");

        Date today = Calendar.getInstance().getTime();

        String dataToday = df.format(today);

        return dataToday;
    }

    public static String riportaAnnoCorrente() {

        DateFormat df = new SimpleDateFormat("yyyy");

        Date today = Calendar.getInstance().getTime();

        String dataToday = df.format(today);

        return dataToday;
    }

    public static String riportaOraCorrente() {

        DateFormat df = new SimpleDateFormat("HH");

        Date today = Calendar.getInstance().getTime();

        String dataToday = df.format(today);

        return dataToday;
    }

    public static String riportaMinutiCorrenti() {

        DateFormat df = new SimpleDateFormat("mm");

        Date today = Calendar.getInstance().getTime();

        String dataToday = df.format(today);

        return dataToday;
    }

    /*
        Rigira la data Anno Mese Giorno + Ora Minuti Secondi da riportare sul server
     */
    public static String riportaDataPerServer(String data) {

        String dataServer;

        String giorno = data.substring(0, 2);
        String mese = data.substring(3,5);
        String anno = data.substring(6, 10);

        dataServer = anno + "-" + mese + "-" + giorno + "T00:00:00";

        return dataServer;
    }

    /*
        Rigira la data Anno Mese Giorno + Ora Minuti Secondi da riportare sul server
    */
    public static String riportaDataOraPerServer(String data) {

        String dataServer;

        String giorno = data.substring(0, 2);
        String mese = data.substring(3,5);
        String anno = data.substring(6, 10);
        String oraMinuti = data.substring(11,16);

        dataServer = anno + "-" + mese + "-" + giorno + "T" + oraMinuti + ":00";

        return dataServer;
    }

    public static String riportaOraJson(String data) {

        Long datetimestamp = Long.parseLong(data.replaceAll("\\D", ""));
        Date date = new Date(datetimestamp);
        DateFormat formatter = new SimpleDateFormat("HH:mm");
        String dateFormatted = formatter.format(date);

        return dateFormatted;
    }


    public static String riportaDataOreDisdetta(String data, Integer ore) {

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Date dateIn = formatter.parse(data);


            Calendar cal = Calendar.getInstance(); // creates calendar
            cal.setTime(dateIn); // sets calendar time/date
            cal.add(Calendar.HOUR_OF_DAY, -ore); // adds one hour
            cal.getTime(); // returns new date object, one hour in the future


            DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String newData = df.format(cal.getTime());

            return newData;

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }


    // Confronta la data odierna con quella della partenza
    public static boolean confrontaDataBiglietti(String data) {

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Date dateIn = formatter.parse(data);

            // Recupera data e ora corrente
            Date today = Calendar.getInstance().getTime();

            Calendar cal = Calendar.getInstance(); // creates calendar
            cal.setTime(dateIn); // sets calendar time/date

            if (cal.getTime().compareTo(today) >= 0) {
                return true;
            } else {
                return false;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return false;
    }
}