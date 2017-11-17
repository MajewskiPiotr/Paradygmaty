/**
 * Created by Piotr Majewski on 2017-11-17.
 */
public class PierwiastekMetodaNewtonaRaphsona {

    double precision;
    double liczbaPodpierwiastkowa;
    int iloscIteracji = 0;


    // Lista kroków:
    //  0 – wczytaj precyzje, liczbePodpierwiastkowa, ilosc iteracji
    // 1. Przypisz a=1 - bok prostokata
    // 2. Przypisz b =  liczba Podpierwiastkowo (pole kwadratu po bok z szukanego pierwiastka)
    // 3. oblicz pole startowego protokąta
    // 4. przypisz i=1 - licznik iteracji
    // 5. Dopóki wartość bezwględna róznicy a i b nie będzie mniejsza od ustalonej precyzji wykonuj kroki 6 i 7 lub osiągnięmy okresloną ilosć iteracji
    // 6. przypisz a = średnią artmetyczą długości boków
    // 7. przypisz b = pole dzielone przez a
    // 8. Wypisz a


    private void ustawZmienne() {
        try {
            precision = Tools.podajDaneZwrocWiekszaLubRownaZero("Podaj precyzję z jaka chcesz dokonywać obliczeń");
            iloscIteracji = Tools.IntegerPodajDaneZwrocWiekszaOdZera("Podaj ilosc iteracji");
            liczbaPodpierwiastkowa = Tools.podajDaneZwrocWiekszaLubRownaZero("podaj liczbę podpierwiastkową");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void obliczPierwiastek() {
        ustawZmienne();
        double a = 1;
        double b = liczbaPodpierwiastkowa;
        double pole = a * b;
        int i = 0;

        while (!(iloscIteracji == i) && ((Math.abs(a - b)) >= precision)) {
            a = (a + b) / 2;
            System.out.println("a " + a);

            b = pole / a;
            System.out.println("b " + b);

            i++;
        }
        System.out.println("Pierwiastek z liczby: " + liczbaPodpierwiastkowa + " to : " + a);
        System.out.println("Wyliczony został w Iteracji: " + i);


    }


    public static void main(String[] args) {
        PierwiastekMetodaNewtonaRaphsona pierwiastekMetodaNewtonaRaphsona = new PierwiastekMetodaNewtonaRaphsona();
        pierwiastekMetodaNewtonaRaphsona.obliczPierwiastek();
    }


}