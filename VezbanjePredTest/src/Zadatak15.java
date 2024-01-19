public class Zadatak15 {
    public static void main(String[] args) {
        //1. Napraviti metodu koja prima neki String i vraca broj samoglasnika u tom String-u (a,e,i,o,u).

        String stringText = "danas je dan za test";
        System.out.println(vracaBrojSamoglasnika(stringText));;
    }
    public static int vracaBrojSamoglasnika(String stringText) {
        int brojac = 0;
        for(int i = 0; i < stringText.length(); i++) {
            if(stringText.charAt(i) == 'a' || stringText.charAt(i) == 'e' || stringText.charAt(i) == 'i') {
                brojac++;
            }
        }
        return brojac;
    }
}
