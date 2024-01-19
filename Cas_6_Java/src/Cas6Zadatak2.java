public class Cas6Zadatak2 {
    public static void main(String[] args) {

        //Zadatak:
        //Napraviti metode za sledece operacije:
        //oduzimanje
        //mnozenje
        //deljenje
        //sabiranje

        int a = 57;
        int b = 20;

        int rezOduzimanja = oduzimanje(a, b);
        System.out.println("Rezultat oduzimanja je: " + rezOduzimanja);

        int rezMnozenja = mnozenje(a, b);
        System.out.println("Rezultat mnozenja je: " + rezMnozenja);

        int rezDeljenja = deljenje(a, b);
        System.out.println("Rezultat deljenja je: " + rezDeljenja);

        int rezSabiranja = sabiranje(a, b);
        System.out.println("Rezultat sabiranja je: " + rezSabiranja);
    }

    public static int oduzimanje(int x, int y) {
        int rezultatOduzimanja = x - y;
        return rezultatOduzimanja;
    }

    public static int mnozenje(int x, int y) {
        int rezultatMnozenja = x * y;
        return rezultatMnozenja;
    }

    public static int deljenje(int x, int y) {
        int rezultatDeljenja = x / y;
        return rezultatDeljenja;
    }

    public static int sabiranje(int x, int y) {
        int rezultatSabiranja = x + y;
        return rezultatSabiranja;
    }

}
