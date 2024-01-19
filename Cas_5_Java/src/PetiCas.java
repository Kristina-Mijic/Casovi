public class PetiCas {
    public static void main(String[] args) {

                                            //NIZOVI -


        // I NACIN:
         int[] prviNiz = {2, 3, -1, 23};

         //II NACIN:
        int[] drugiNiz = new int[4]; //Nasi elementi se ovako vide kao: {0, 0, 0, 0}
        drugiNiz[0] = 13; //ovaj niz ce nama sada izgledati: {13, 0, 0, 0}
        drugiNiz[1] = 10; //ovaj niz ce nama sada izgledati  {13, 10, 0, 0}
        drugiNiz[3] = 5; //ovaj niz ce nam sada izgledati: {13, 10, 0, 5}



        //FOR LOOP:
//        for(int i = 0; i < prviNiz.length; i++) {
//            System.out.println(prviNiz[i]);
//        }


//        for(int i = 0; i < prviNiz.length-1; i++) {
//            System.out.println(prviNiz[i]); //ispisuje {2, 3, -1} bez zadnjeg !!!!!!!
//        }


        //WHILE LOOP:

        int i = 0;
        while (i < prviNiz.length) {
            System.out.println(prviNiz[i]);
            i++;
        }


        //FOR EACH LOOP - koristicemo najvise za iteraciju tj prolazak kroz niz.
            //pivot - prolazi kroz niz i on ce za svako izvrsavanje petlje uzeti vrednost jednog index-a
            //prednost FOR EACH LOOP zato sto zna odakle treba da krene i za dokle treba da ide!!
            //pivot - je zapravo promenljiva koju definisemo kako zelimo.
            //pivot - to je figura koju uzima svaku od ovih vrednosti

        for(int pivot:prviNiz) { // {2, 16, 17, 4}
            System.out.println(pivot); // poivot = 2, pivot = 16,
        }

    }
}
