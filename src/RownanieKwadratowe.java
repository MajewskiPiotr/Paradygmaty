/**
 * Created by Piotr Majewski on 2017-11-10.
 */
public class RownanieKwadratowe {

    // Algorytm na równanie kwadratowe drugiego stopnia: ax2 + bx + c = 0.

    // 1. pobierz a
    // 2. pobierz b
    // 3. pobierz c
    // 4. policzyć Delta
    // 5. policzyć wynik w zależności od Delty
    double a;
    double b;
    double c;
    double delta;


    public void oblicz() throws Exception {
        pobierzDane();
        zweryfikujDane();
        policzDelte();
        sprawdzPierwiastki();

    }

    private void sprawdzPierwiastki() {
        if (delta == 0) {
            System.out.println("to równanie ma jedno rozwiązanie rzeczywiste (podwójny pierwiastek rzeczywisty");
            System.out.println("Wynik to: " + -(b / (2 * a)));

        } else if (delta > 0) {
            System.out.println("równanie ma dwa rozwiązania rzeczywiste (dwa pierwiastki rzeczywiste);");
            double licznik1 =-b-Math.sqrt(Math.pow(b,2)-(4*a*c));
            double licznik2 = -b+Math.sqrt(Math.pow(b,2)-(4*a*c));
            double mnożnik = 2*a;
            double x1 = licznik1/mnożnik;
            double x2 = licznik2/mnożnik;
            System.out.println("Wynik to: x1: " + x1 + "  x2: " + x2);


        } else {
            System.out.println("Równanie nie ma rozwiązań rzeczywistych");
        }
    }

    private void policzDelte() {
        //b2 - 4ac
        delta = (Math.pow(b, 2)) - (4 * a * c);
    }

    private void zweryfikujDane() throws Exception {
        if (this.a == 0 || this.b == 0) {
            System.out.println(a + " " + b);
            throw new Exception("wprowadzone dane nie spełniają warunkó równania kwadratowego");
        }
    }

    private void pobierzDane() throws Exception {
        a = Tools.podajDaneZwrocDouble("Podaj A ");
        b = Tools.podajDaneZwrocDouble("Podaj B ");
        c = Tools.podajDaneZwrocDouble("Podaj C ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Badane będzie równanie f(x)=" + a + "x2 + " + b + "x + " + c);
    }


    public static void main(String[] args) throws Exception {
        RownanieKwadratowe rownanieKwadratowe = new RownanieKwadratowe();
        rownanieKwadratowe.oblicz();

    }
}
