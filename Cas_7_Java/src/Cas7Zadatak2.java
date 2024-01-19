public class Cas7Zadatak2 {
    public static void main(String[] args) {

        //Zadatak 1:
        //Napraviti metodu koja prima 2 broja, i stampa sve parne brojeve izmedju ta dva broja.

        int broj1 = 5;
        int broj2 = 20;

        parniBrojeviIzmedjuDvaBroja(broj1, broj2);
    }
    public static void parniBrojeviIzmedjuDvaBroja(int a, int b) {
        for(int i = a; i < b; i++) {
            if(i % 2 == 0) {
                System.out.println("Suma parnih brojeva je: " + i);
            }
        }
    }
}
