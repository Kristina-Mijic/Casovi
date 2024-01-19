public class Zadatak11 {
    public static void main(String[] args) {

        //Dodatni za test:
        //1.Napraviti metodu koja prima broj i niz brojeva, proverava da li se taj broj nalazi u tom nizu .

        int[] nizBrojeva = {2, 3, 4, 7, 9};
        int broj = 8;


//        if(locirajBroj(broj, nizBrojeva)) {
//            System.out.println("Broj se nalazi u nizu");
//        } else {
//            System.out.println("Broj se NE nalazi u nizu");
//        }
       // System.out.println(locirajBrojUNizu(broj, nizBrojeva));


        System.out.println(locirajBroj(broj, nizBrojeva));
    }
    public static boolean locirajBrojUNizu(int broj, int[] nizBrojeva) {

        for(int i = 0; i < nizBrojeva.length; i++) {
            if(nizBrojeva[i] == broj) {
                return true;
            }
        }
       return false;
    }

    public static int locirajBroj(int broj, int[] nizBrojeva) {

        for(int i = 0; i < nizBrojeva.length; i++) {
            if(nizBrojeva[i] == broj) {
                broj = nizBrojeva[i];
            }
        }
        return broj;
    }
}
