public class zadatak2 {
    public static void main(String[] args) {
        //Zadatak 2:
        //Napraviti metodu koja prima dva Stringa, i vraca nam poruku koji je od ta dva String duzi.

        String str1 = "Danas ucimo za test";
        String str2 = "Danas ucimooooooooo";

        //kojiJeDuziString(str1, str2);
        //poredjenjeDuzineDvaStringa(str1, str2);
        duzinaStringova(str1, str2);

    }

    public static void kojiJeDuziString(String text1, String text2) {

        if(text1.length() > text2.length()) {
            System.out.println("Prvi string je duzi!");
        } else if (text2.length() > text1.length()) {
            System.out.println("Drugi string je duzi!");
        } else {
            System.out.println("Duzina je jednaka");
        }
    }

    public static void poredjenjeDuzineDvaStringa(String str1, String str2) {

        if(str1.length() > str2.length()) {
            System.out.println("Prvi String je duzi!");
        } else if(str2.length() > str1.length()) {
            System.out.println("Drugi String je druzi!");
        } else {
            System.out.println("Duzina oba stringa su jednaka!");
        }
    }

    public static void duzinaStringova(String text1, String text2) {

        if(text1.length() > text2.length()) {
            System.out.println("Prvi string je duzi od drugog");
        } else if(text2.length() > text1.length()) {
            System.out.println("Drugi string je duzi od prvog!");
        } else {
            System.out.println("Oba stringa su jednaka!");
        }
    }
}
