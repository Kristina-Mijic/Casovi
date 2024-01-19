public class Zadatak13 {
    public static void main(String[] args) {

        //3.Napraviti metodu koja prima String i vraca broj pojavljivanje tacke(.) i uzvicnika (!).

        //String text = "Danas, vezbamo i ucimo! treba poloziti.";
        //System.out.println(brojPojavljivanja(text));

        String text2 = "danas ucimo. jer. danas je, test! ";
       // System.out.println(kolikoSePutaPojavljuje(text2));

        //Koliko puta se pojavljuje slovo a?
        System.out.println("Broj pojavljivanja slova A u textu:");
        System.out.println(brojPojavljivanjaSlovaA(text2));

        if(daLiSePojavljujeSlovoA(text2)){
            System.out.println("Slovo A se pojavljuje!");
        } else {
            System.out.println("Slovo A se NE pojavljuje u textu!");
        }

        System.out.println(daLiSePojavljujeSlovoA(text2));

    }
    public static int brojPojavljivanja(String text) {
        int brojac = 0;

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '.' || text.charAt(i) == '!') {
                brojac++;
            }
        }
        return brojac;
    }

    public static int kolikoSePutaPojavljuje(String text) {
        int brojac = 0;

        for(int i = 0; i < text.length(); i++) {
            if((text.charAt(i) == '.') || (text.charAt(i) == '!')) {
                brojac++;
            }
        }
        return brojac;
    }

    //
    public static int brojPojavljivanjaSlovaA(String strintText) {
        int brojac = 0;

        for(int i = 0; i < strintText.length(); i++) {
            if(strintText.charAt(i) == 'a') {
                brojac++;
            }
        }
        return brojac;
    }

    public static boolean daLiSePojavljujeSlovoA(String stringText) {

        for(int i = 0; i < stringText.length(); i++) {
            if(stringText.charAt(i) == 'a') {
                return true;
            }
        }
        return false;
    }
}
