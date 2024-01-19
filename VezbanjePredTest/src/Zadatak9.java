public class Zadatak9 {
    public static void main(String[] args) {

        //Napraviti metodu fakotrijel koja za proslednjeni broj vraca njegov faktorijel.

        System.out.println(faktorijelBroja(4));
        System.out.println(faktorijelBr(6));

    }
    public static int faktorijelBroja(int broj) {
        int faktorijel = 1;

        for(int i = 1; i <= broj; i++) {
            faktorijel *= i;
        }
        return faktorijel;
    }

    //
    public static int faktorijelBr(int br) {
        int faktorijel = 1;

        for(int i = 1; i < br; i++) {
           faktorijel *= i;
        }
        return faktorijel;
    }

}
