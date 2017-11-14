/**
 * Created by Piotr Majewski on 2017-11-10.
 */
//Całkowanie metodą prostokątów
public class Calka {
    Integer iloscCalek;
    Double przedzial;
    //odleglosc między punktami
    double dx;


    //Okresl Przedzial calkowania
    private void setPrzedzial() throws Exception {
        String p;
        p = Tools.podajDane("Podaj przedział w jakim chcesz dokonac całkowania [wartość podaj w Stopniach]");
        double stopnie = Double.parseDouble(p);
        przedzial = Math.toRadians(stopnie);
    }


    private void setDx() throws Exception {
        if (przedzial == null || iloscCalek == null) {
            throw new Exception("napotaliśmy problem, nie został ustawiony przedział lub ilosc całek");
        }
        dx = przedzial / iloscCalek;
    }

    private void setIloscCalek() throws Exception {
        String p;
        p = Tools.podajDane("Podaj ilość całek jakie mają zostac wykonane");
        iloscCalek = Integer.parseInt(p);

    }

    public double wyliczCalke() throws Exception {
        System.out.println("Program wylicza Całkę z funkcji F(x)=sin(x)");
        setPrzedzial();
        setIloscCalek();
        //Obliczamy odległość między dwoma sąsiednimi punktami - będzie to podstawa każdego prostokąta:
        try {
            setDx();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Obliczamy sumę iloczynów wyznaczonych wartości funkcji przez odległość dx między dwoma sąsiednimi punktami - da to sumę pól poszczególnych prostokątów ograniczonych wykresem funkcji:
        //a po wyprowadzeniu wspólnego czynnika przed nawias:
        double tabFx[] = new double[iloscCalek];
        double sumaFx = 0;
        double licznik = 1;

        for (int i = 0; i < iloscCalek; i++) {
            double pomocnicza = licznik / iloscCalek;
            tabFx[i] = Math.sin(pomocnicza * przedzial);
            sumaFx += tabFx[i];
            licznik++;
        }
        //Otrzymana suma jest przybliżoną wartością całki oznaczonej funkcji f(x) w przedziale <xp,xk>.
        Double calka = dx * sumaFx;
        return calka;
    }


    public static void main(String[] args) throws Exception {
        Calka test = new Calka();
        System.out.println(test.wyliczCalke());


    }
}
