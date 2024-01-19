public class Zadatak1 {
    public static void main(String[] args) {

        //1. Napraviti metodu koja prima neki String i vraca broj samoglasnika u tom String-u (a,e,i,o,u).

        String str = "Danas je suncan i hladan dan";
        System.out.println(brojSamoglasnika(str));
    }
    public static int brojSamoglasnika(String str) {
        int brojSamogl = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                brojSamogl++;
            }
        }
        return brojSamogl;
    }

}
