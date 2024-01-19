import java.util.Arrays;

public class Zadatak14 {
    public static void main(String[] args) {
        //4.Napraviti metodu koja prima niz brojeva i vraca niz tih brojeva u obrnutom redosledu.

        int[] nizBrojeva = {2, 3, 4, 5, 6};
        String text = "anavolimilovana";

        //System.out.println(obrnutRedosledNizova(nizBrojeva));
        //System.out.println(Arrays.toString(obrnutiRedosled(nizBrojeva)));

        System.out.println(Arrays.toString(vracaObrnutRedosledNiza(nizBrojeva)));
        //obrnutRedosledStringa(text);

        palindrom(text);

    }

    public static int[] obrnutRedosledNizova(int[] nizBrojeva) {
        int[] noviNiz = new int[nizBrojeva.length];

        for(int i = 0; i < nizBrojeva.length; i++) {
            noviNiz[i] = nizBrojeva[(nizBrojeva.length-i)-1];
        }

        for(int niz:nizBrojeva) {
            System.out.println("Prvi niz: " + niz);
        }

        for (int niz: noviNiz) {
            System.out.println("Drugi niz: " + niz);
        }
        return noviNiz;
    }

    public static int[] obrnutiRedosled(int[] nizBrojeva) {
        int[] noviNiz = new int[nizBrojeva.length];

        for(int i = 0; i < nizBrojeva.length; i++) {
            noviNiz[i] = nizBrojeva[(nizBrojeva.length-i)-1];
        }
        return noviNiz;
    }


    public static int[] vracaObrnutRedosledNiza(int[] nizBr) {
        int[] noviNiz = new int[nizBr.length];

        for(int i = 0; i < nizBr.length; i++) {
            noviNiz[i] = nizBr[(nizBr.length-i)-1];
        }
        return noviNiz;
    }

    public static void obrnutRedosledStringa(String stringText) {
      char karakter = 0;
      String noviString = "";

      for(int i = 0; i < stringText.length(); i++) {
          karakter = stringText.charAt(i);
          noviString = karakter + noviString;
      }
    }

    //palindrom:
    public static void palindrom(String text) {
        char karakter = 0;
        String noviString = "";

        for(int i = 0; i < text.length(); i++) {
            karakter = text.charAt(i);
            noviString = karakter + noviString;
        }
        if(noviString.equalsIgnoreCase(text)) {
            System.out.println("Palindrom!");
        } else {
            System.out.println("Nije palindrom!");
        }
    }
}
