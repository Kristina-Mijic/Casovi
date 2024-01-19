public class Zadatak4 {
    public static void main(String[] args) {

        //4. Napraviti metodu koja prima niz celih brojeva i vraca logicki izraz koji nam govori da li je niz monoton.
        // Niz je monoton ako su svi njegovi elementi u striktno rastucem ili striktno opadajucem redosledu,
        //ukoliko se jedan element ne uklapa u raspored, niz nije monoton.
        //Monoton niz : 1, 2, 3,4 ili -10, -9, -8, -7, -6
        //NIJE monoton niz: 1,2, -2, 10 ili -10, -8, 7, -6

            int[] nizBr = {8, 7, 6, 5, 4, 3};
            System.out.println( monoton(nizBr));;

//        System.out.println(monotonRastuci(nizBr));
//        System.out.println(monotonOpadajuci(nizBr));
//
//        if(monotonRastuci(nizBr) || monotonOpadajuci(nizBr)) {
//            System.out.println("Niz je monoton!");
//        }
    }
//    public static boolean monotonRastuci(int[] nizBrojeva) {
//
//        for(int i = 0; i < nizBrojeva.length-1; i++) {
//            if(nizBrojeva[i] > nizBrojeva[i + 1]) {
//               return true;
//            }
//        }
//        return true;
//    }
//    public static boolean monotonOpadajuci(int[] nizBrojeva) {
//        for(int i = 0; i < nizBrojeva.length-1; i++) {
//            if(nizBrojeva[i] < nizBrojeva[i + 1]) {
//                return false;
//            }
//        }
//        return true;
//    }


    public static boolean monoton(int[] niz) {
        if(opadajuci(niz) || rastuci(niz)) {
            return true;
        }
        return false;
    }

    public static boolean opadajuci(int[] niz) {
        boolean rezultat = false;

        for(int i = 0; i < niz.length-1; i++) {
            if(niz[i] > niz[i+1]) {
                rezultat = true;
            } else {
                rezultat = false;
                break;
            }
        }
        return rezultat;
    }

    public static boolean rastuci(int[] niz){
        boolean rezultat = false;

        for(int i = 0; i < niz.length-1; i++) {
            if(niz[i] < niz[i+1]) {
                rezultat = true;
            } else {
                rezultat = false;
                break;
            }
        }
        return rezultat;
    }


}
