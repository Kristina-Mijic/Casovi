public class PetiCasZadatak3 {
    public static void main(String[] args) {
        //Zadatak napredniji;
        //Kreirati proizvod niz int-ove, zatim kreirati drugi niz u koji ce te smestati prvi, ali obrnutim redosledom:

        int[] prviNiz = {2, 4, 6, 10, 24};
        int[] drugiNiz = new int[prviNiz.length];

        for(int i = 0; i < prviNiz.length; i++) {

            drugiNiz[i] = prviNiz[(prviNiz.length - i)-1];
        }

        for(int k: prviNiz) {
            System.out.println("Prvi niz: " + k);
        }

        for (int k: drugiNiz) {
            System.out.println("Drugi niz: " + k);
        }
    }
}
