public class Zadatak1 {
    public static void main(String[] args) {
        //Zadatak 1:
        //Napraviti metodu koja prima 2 broja, i stampa sve parne brojeve izmedju ta dva broja.

        System.out.println(parniBrojevi(20, 40));
        System.out.println(parniBrojeviIzmedjuDvaBroja(21, 35));
        System.out.println(parniBrojevi2(18, 30));

        System.out.println("Neparni brojevi: " + neparniBrojeviIzmedjuDvaBroja(5, 10));
    }

    public static int parniBrojevi(int broj1, int broj2) {
        int brojac = 0;

        for(int i = broj1; i < broj2; i++) {
            if(i % 2 == 0) {
                brojac++;
            }
        }
        return brojac;
    }

    public static int parniBrojeviIzmedjuDvaBroja(int br1, int br2) {
        int brojac = 0;
        for(int i = br1; i < br2; i++) {
            if(i % 2 == 0) {
                brojac ++;
            }
        }
        return brojac;
    }

    public static int parniBrojevi2(int broj1, int broj2) {
        int brojac = 0;

        for(int i = broj1; i < broj2; i++) {
            if(i % 2 == 0) {
                brojac++;
            }
        }
        return brojac;
    }

    public static int neparniBrojeviIzmedjuDvaBroja(int br1, int br2) {
        int brojac = 0;

        for(int i = br1; i < br2; i++) {
            if(i % 2 == 1) {
                brojac++;
            }
        }
        return brojac;
    }
}
