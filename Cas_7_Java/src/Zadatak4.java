public class Zadatak4 {
    public static void main(String[] args) {
        //Zadatak 3:
        //Napraviti metodu koja prima dva broja a i b, ukoliko je a(prvi broj) veci vratiti true, u suprotnom false.

        int broj1 = 2;
        int broj2 = 12;

        boolean veciBroj = kojiJeBrojVeci(broj1, broj2);
        System.out.println(veciBroj);
    }

    public static boolean kojiJeBrojVeci(int a, int b) {
        if(a > b) {
           return  true;
        } else {
            return false;
        }

        //Primer 2:
        // boolean promenljiva = a > b;
        // return promenljiva;

        //Primer 3:
        // return a > b;
    }
}
