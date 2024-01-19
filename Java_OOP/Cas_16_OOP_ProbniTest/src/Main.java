import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Staza staza1 = new Staza("Suva planina", 10);
//        Staza staza2 = new Staza("Stara planina", 20);
//        Staza staza3 = new Staza("Trem", 40);
//
//
//        ArrayList<Staza> listaStaza = new ArrayList<>();
//        listaStaza.add(staza1);
//        listaStaza.add(staza2);
//        listaStaza.add(staza3);
//
//        Maratonac maratonac1 = new Maratonac(20, listaStaza);
//        System.out.println(maratonac1);

        Staza s1 = new Staza("Beogradski Maraton", 43);
        Staza s2 = new Staza("Novosadski Maraton", 42);
        Staza s3 = new Staza("Arandjelovacki Maraton", 21);
        Staza s4 = new Staza("Mladenovacki Maraton", 10);
        Staza s5 = new Staza(" Maraton", 42);
        Staza s6 = new Staza("Ultra Maraton", 100);

        ArrayList<Staza> listaStaza1 = new ArrayList<>();
        listaStaza1.add(s1);
        listaStaza1.add(s2);
        listaStaza1.add(s3);

        ArrayList<Staza> listaStaza2 = new ArrayList<>();
        listaStaza2.add(s3);
        listaStaza2.add(s4);
        listaStaza2.add(s5);

        ArrayList<Staza> listaStaza3 = new ArrayList<>();
        listaStaza3.add(s3);

        Maratonac m1 = new Amater(19,listaStaza1);
        Maratonac m2 = new Profesionalac(22, listaStaza2);
        Maratonac m3 = new Amater(17,listaStaza3);

        ArrayList<Maratonac> listaMaratonaca = new ArrayList<>();
        listaMaratonaca.add(m1);
        listaMaratonaca.add(m2);
        listaMaratonaca.add(m3);

        System.out.println(m1);
        System.out.println(m2);

    }
}