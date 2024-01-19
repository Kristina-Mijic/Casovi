public class Zadatak5 {
    public static void main(String[] args) {

        //Zadatak 5:
        //Napraviti metodu koja prima dva niza Stringova, racuna duzinu
        //drugog najduzeg String-a iz prvog niza i duzinu drugog najduzeg
        //String-a iz drugog niza, kao rezultat vraca njihov zbir.

        String[] nizStringova1 = {"automobil", "testiranje", "voz"};
        String[] nizStringova2 = {"petak", "vikend", "test"};

        System.out.println(kojiStringJeVeci(nizStringova1, nizStringova2));
    }
    public static int drugiNajduzi(String[] string) {
        int najduzi = string[0].length();
        int drugiNajduzi = 0;

        for(int i = 0; i < string.length; i++) {
            if(string[i].length() > najduzi) {
                drugiNajduzi = najduzi;
                najduzi = string[i].length();
            }
        }
        return drugiNajduzi;
    }
    public static int kojiStringJeVeci(String[] string1, String[] string2) {
        int prvi = drugiNajduzi(string1);
        int drugi = drugiNajduzi(string2);

        int rezultat = prvi + drugi;
        return rezultat;
    }
}
