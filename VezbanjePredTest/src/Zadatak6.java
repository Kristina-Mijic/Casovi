public class Zadatak6 {
    public static void main(String[] args) {
        //Zadatak 6:
        //Napraviti metodu koja prima niz brojeva, i broji parne brojeve u tom nizu.

        int[] nizBrojeva = {2, 4, 6, 7, 8, 9, 10, 11};

        //System.out.println("Broj parnih brojeva: " + brojiParneBrojeve(nizBrojeva));
        System.out.println("Parni brojevi: " + parniBrojeviUNizu(nizBrojeva));
        System.out.println("Neparni brojevi: " + neparniBrojeviUNizu(nizBrojeva));
    }
    public static int brojiParneBrojeve(int[] nizBrojeva) {
        int brojac = 0;

        for(int brojParnih : nizBrojeva) {
            if(brojParnih % 2 == 0) {
                brojac++;
            }
        }
        return brojac;
    }


    public static int parniBrojeviUNizu(int[] nizBrojeva) {
        int brojac = 0;

        for(int niz: nizBrojeva) {
            if(niz % 2 == 0) {
                brojac++;
            }
        }
        return brojac;
    }

    public static int neparniBrojeviUNizu(int[] nizBrojeva) {
        int brojac = 0;

        for(int nizBr:nizBrojeva) {
            if(nizBr % 2 == 1) {
                brojac++;
            }
        }
        return brojac;
    }
}
