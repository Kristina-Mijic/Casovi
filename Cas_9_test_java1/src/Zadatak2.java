public class Zadatak2 {
    public static void main(String[] args) {

        //Zadatak 2:
        //Napraviti metodu koja prima niz String-ova i jos jedan String, vraca
        //broj pojavljivanja tog String-a u nizu.

        String[] nizStrinogva = {"a", "a", "b", "c", "d", "a", "c"};
        String jedanStr = "a";

        int brojPonavljanja = brojPojavljivanjaStringaUNiz(nizStrinogva, jedanStr);
        System.out.println("Broj pojavljivanja " + jedanStr + " je: " + brojPonavljanja + " puta.");

        System.out.println("Vezbamo!");
        System.out.println(kolikoSePutaPojavljujeString(nizStrinogva, jedanStr));
    }
    public static int brojPojavljivanjaStringaUNiz(String[] nizStringova, String jedanString) {
        int brojac = 0;

        for(int i = 0; i < nizStringova.length; i++) {
            if(nizStringova[i].equals(jedanString)) {
                brojac++;
            }
        }
        return brojac;
    }


    public static int kolikoSePutaPojavljujeString(String[] nizStringova, String jedanStr) {
        int brojac = 0;

        for(int i = 0; i < nizStringova.length; i++) {
            if(nizStringova[i].equals(jedanStr)) {
                brojac++;
            }
        }
        return brojac;
    }
}
