public class Zadatak3i4 {
    public static void main(String[] args) {
        //Zadatak 3:
        //Napraviti metodu koja prima dva broja a i b, ukoliko je a(prvi broj) veci vratiti true, u suprotnom false.
        //Zadatak 4:
        //Napraviti metodu koja prima dva cela broja i izracunava razliku tako sto veci oduzima od manjeg.

        int broj1 = 25;
        int broj2 = 40;

        if(vratiVeciBr(broj1, broj2)) {
            System.out.println("Prvi je veci!");
        } else {
            System.out.println("Drugi je veci!");
        }

        //System.out.println("Razlika izmedju dva br je:" + razlika(broj1, broj2));
        System.out.println(razlikaDvaBroja(broj1, broj2));
    }

    public static boolean vratiVeciBroj(int broj1, int broj2) {
        return broj1 > broj2;
    }

    public static int  razlika(int br1, int br2) {
        boolean veci = vratiVeciBroj(br1, br2);
        int razlikaBr;

        if(veci) {
            razlikaBr = br1 - br2;
        }else {
            razlikaBr = br2 - br1;
        }
        return razlikaBr;
    }


    public static boolean vratiVeciBr(int br1, int br2) {
        return br1 > br2;
    }

    public static int razlikaDvaBroja(int broj1, int broj2) {
        boolean veci = vratiVeciBroj(broj1, broj2);
        int razlika = 0;

        if(veci) {
            razlika = broj1 - broj2;
        } else {
            razlika = broj2 - broj1;
        }
        return razlika;
    }
}
