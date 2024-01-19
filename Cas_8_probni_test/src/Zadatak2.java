public class Zadatak2 {
    public static void main(String[] args) {

        //2. Napraviti metodu koja prima neki niz brojeva i neki broj,
        // ukoliko se taj proslednjeni broj nalazi vise od 3 puta u tom nizu,
        // ispisati poruku da je nas broj presao granici, u suprotnom ispisati da nije presao granicu.

        int[] nizBrojeva = {2, 3, 2, 4, 2, 5, 6, 7, 2};
        proveriBrojPojavljivanja(nizBrojeva, 7);


        //System.out.println(brojPonavljanja(nizBrojeva, broj));
    }
//    public static int brojPonavljanja(int[] nizBrojeva, int broj) {
//        int brPonavljaja = 0;
//
//        for(int i = 0; i < nizBrojeva.length; i++) {
//            if(nizBrojeva[i] == broj) {
//                brPonavljaja++;
//            }
//        }
//        if(brPonavljaja > 3) {
//            System.out.println("Nas broj se ponavlja vise od 3 puta!");
//        } else {
//            System.out.println("Nas broj ne prelazi granicu!");
//        }
//        return brPonavljaja;
//    }


    public static void proveriBrojPojavljivanja(int[] niz, int broj) {

        int brojac = 0;

        for(int element: niz) {
            if(element == broj) {
                brojac++;
            }
            if(brojac > 3) {
                System.out.println("Broj je presao granicu!");
                return;
            }
        }
        System.out.println("Broj nije presao granicu!");
    }


}
