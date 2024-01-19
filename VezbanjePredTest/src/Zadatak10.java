public class Zadatak10 {
    public static void main(String[] args) {
        //Napraviti metodu koja prima platu nekog radnika,
        //zatim oduzima 15% na porez, od toga sto ostane oduzme 17% za racune, i vrati ostatak.

        double plata = 50.000;
        System.out.println(vratiOstatak(plata));

        double plata2 = 45.000;
        System.out.println(ostatak(plata2));

    }
    public static double vratiOstatak(double plata) {
        double sumaPorez = plata * 0.85;
        double sumaRacuni = sumaPorez * 0.83;

        return sumaRacuni;
    }

    public static double ostatak(double plata) {
        double sumaPorez = plata * 0.85;
        double sumaRacuni = sumaPorez * 0.83;

        return sumaRacuni;
    }
}
