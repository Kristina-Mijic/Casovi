public class Cas7Zadatak3 {
    public static void main(String[] args) {
        //Zadatak 2:
        //Napraviti metodu koja prima dva Stringa, i vraca nam poruku koji je od ta dva String duzi.

        String text1 = "Danas ucimo javu";
        String text2 = "Sutra imamo probni test!";

        kojiStringJeDuzi(text1, text2);
    }
    public static void kojiStringJeDuzi(String a, String b) {
        if(a.length() > b.length()) {
            System.out.println("Prvi String je duzi!");
        } else if(b.length() > a.length()) {
            System.out.println("Drugi String je duzi!");
        } else  {
            System.out.println("Oba stringa su iste duzine!");
        }
    }
}
