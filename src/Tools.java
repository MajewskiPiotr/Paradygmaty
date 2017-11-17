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

    public static void wypiszKomunikat(String s) {
        System.out.println(s);
    }

    public static String podajDane(String text) throws Exception {
        wypiszKomunikat(text);
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        return weryfikacjaPoprawnosciDanych(odczyt.nextLine());
    }

    public static Double podajDaneZwrocDouble(String text) throws Exception {
        wypiszKomunikat(text);
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        return Double.parseDouble(weryfikacjaPoprawnosciDanych(odczyt.nextLine()));

    }

    public static Double podajDaneZwrocWiekszaOdZera(String text) throws Exception {
        wypiszKomunikat(text);

        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        double war = Double.parseDouble(weryfikacjaPoprawnosciDanych(odczyt.nextLine()));
        if (war > 0) {
            return war;
        } else System.out.println("liczba jest mniejsza od Zera lub jest zerem");
        return null;

    }

    public static Integer IntegerPodajDaneZwrocWiekszaOdZera(String text) throws Exception {
        wypiszKomunikat(text);

        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        Integer war = Integer.parseInt(weryfikacjaPoprawnosciDanych(odczyt.nextLine()));
        if (war > 0) {
            return war;
        } else System.out.println("liczba jest mniejsza od Zera lub jest zerem");
        return null;

    }

    public static Double podajDaneZwrocWiekszaLubRownaZero(String text) throws Exception {
        wypiszKomunikat(text);
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        double war = Double.parseDouble(weryfikacjaPoprawnosciDanych(odczyt.nextLine()));
        if (war >= 0) {
            return war;
        } else System.out.println("liczba jest mniejsza od Zera");
        return null;
    }
}
