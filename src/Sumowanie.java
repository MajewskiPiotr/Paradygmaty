import java.io.IOException;

/**
 * Created by Piotr Majewski on 2017-11-10.
 */
public class Sumowanie {
    public double suma;

    // Algorytm na sumowanie wartości z przedziału od 1 do 10.

    //1. Wczytaj liczbe
    //2. sprawdz czy to liczba z przedziału 1-10
    //3. dodaj do wyniku
    //4. powrót do kroku 1

    public void sumuj() throws Exception {
        String wprowadzonaLiczba = Tools.weryfikacjaPoprawnosciDanych(Tools.podajDane("Podaj liczbe z przedzialu 1-10 "));
        Double liczba = Double.parseDouble(wprowadzonaLiczba);
        if (liczba < 1 || liczba > 10) {
            System.out.println("podana liczba nie miesci się w zadanym przedziale");
        }
        suma += liczba;
        System.out.println("aktualna wartość sumy to " + suma);
    }




    public static void main(String[] args) throws Exception {

        Sumowanie sum = new Sumowanie();
        while (true) {
            sum.sumuj();
        }
    }
}
