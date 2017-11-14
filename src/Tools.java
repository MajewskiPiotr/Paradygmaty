import java.util.Scanner;

/**
 * Created by Piotr Majewski on 2017-11-10.
 */
public class Tools {

    public static String weryfikacjaPoprawnosciDanych(String wartosc) throws Exception {
        String newString = wartosc;

        if (wartosc.contains(",")) {
            newString = wartosc.replace(",", ".");
        }
        try {
            Double.parseDouble(newString);
        } catch (Exception e) {
            throw new Exception("wpisany ciąg znaków nie jest liczbą ze zbioru R");
        }
        return newString;
    }


    public static String podajDane(String text) throws Exception {
        System.out.println(text);
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        return weryfikacjaPoprawnosciDanych(odczyt.nextLine());
    }

    public static Double podajDaneZwrocDouble(String text) throws Exception {
        System.out.println(text);
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        return Double.parseDouble(weryfikacjaPoprawnosciDanych(odczyt.nextLine()));

    }

}
