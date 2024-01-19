public class Zadatak16 {
    public static void main(String[] args) {
        //2. Napraviti metodu koja prima neki niz brojeva i neki broj,
        //ukoliko se taj proslednjeni broj nalazi vise od 3 puta u tom nizu,
        //ispisati poruku da je nas broj presao granici, u suprotnom ispisati da nije presao granicu.

        int[] nizBr = {2, 3, 4, 2, 5, 6, 2, 6, 2, 4};
        int broj = 2;

        //System.out.println(brojPojavljivanja(nizBr, 6));

     brojPojavljivanja(nizBr, broj);
    }
    public static void brojPojavljivanja(int[] nizBrojeva, int nekiBroj) {

        int brojac = 0;

        for(int i = 0; i < nizBrojeva.length; i++) {
          if(nizBrojeva[i] == nekiBroj) {
              brojac++;
          }
        }
        if(brojac > 3) {
            System.out.println("Broj prelazi granicu!");
        } else {
            System.out.println("Broj ne prelazi granicu!");

        }

    }



}
