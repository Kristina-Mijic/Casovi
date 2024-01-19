public class Zadatak17 {
    public static void main(String[] args) {
        //5.Napraviti metodu koja prima ceo broj, racuna njegov kvadrat, pa ga zatim deli sa dva i vraca rezultat.

        System.out.println(racunaKvadratBroja(2));
    }
    public static int racunaKvadratBroja(int nekiBroj) {

        int kvadrat = (int) Math.pow(nekiBroj, 2);
        int deljenjeSaDva = kvadrat / 2;

        return deljenjeSaDva;
    }
}
