public class Zadatak6 {
    public static void main(String[] args) {
        //Zadatak 5:
        //Napraviti metodu koja prima niz Stringova
        // i jedan String, kao rezultat vraca da li se on nalazi tu ili ne (true ili false).

        String[] niz = {"a", "b", "c", "d", "e"};
        String str = "b";

        boolean rezultat = nizStringova(niz, str);
        System.out.println(rezultat);

    }

    public static boolean nizStringova(String[] stringovi, String str) {

        for(String n:stringovi) {
            if(n.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
