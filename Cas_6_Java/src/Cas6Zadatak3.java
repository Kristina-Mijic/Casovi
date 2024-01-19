import java.util.Scanner;

public class Cas6Zadatak3 {
    public static void main(String[] args) {

        //Zadatak:
        //Napraviti metodu koja prima String i karakter, i vraca broj pojavljivanja
        //tog karaktera u Stringu.

       String str = "aerodrom";
       char karakter = 'r';

       int prebrojavanje = brojPojavljivanja(str, karakter);
       System.out.println("Broj pojavljianja jednog karaktera je: " + prebrojavanje);


    }

    public static int brojPojavljivanja(String s, char x) {

        int brojac = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == x) {
                brojac++;
            }
        }
        return brojac;
    }
}
