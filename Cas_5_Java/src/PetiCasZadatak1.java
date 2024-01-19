public class PetiCasZadatak1 {
    public static void main(String[] args) {

        //Zadatak:
        //Kreirati niz brojeva, istampati sve brojeve osim 3 i 23.

        int[] brojevi = {14, 23, 3, -33, 7, 13};

        for(int i = 0; i < brojevi.length; i++) {
            if(brojevi[i] != 3 && brojevi[i] != 23) {
                System.out.println(brojevi[i]);
            }
        }
    }
}
