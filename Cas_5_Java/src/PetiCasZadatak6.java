public class PetiCasZadatak6 {
    public static void main(String[] args) {

        //Zadatak:
        //Proveriti da li su dva niza jednaka.
        //(Nizovi su jednaki ako imaju isti broj elemenata, i ako se na svakom mestu nalazi isti element)

        int[] nizA = {3, 5, 6, 8, 20};
        int[] nizB;
        nizB = nizA;

        //I PRIMER
//        for(int i = 0; i < nizA.length; i++) {
//            if(nizA[i] == nizB[i]) {
//                System.out.println("Nizovi su jednaki");
//                break;
//            } else {
//                System.out.println("Nizovi nisu jednaki");
//            }
//        }


        if(nizA.length == nizB.length) {
            for(int i = 0; i < nizA.length; i++) {
               if ( nizA[i] != nizB[i]) {
                   System.out.println("Nizovi nisu jednaki");
                   break;
               }
                System.out.println("Elementi su jednaki");
            }

        } else {
            System.out.println("Nizovi nisu jednaki");
        }


    }
}
