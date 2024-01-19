public class Zadatak5 {
    public static void main(String[] args) {

        //5.Napisati metodu koja prima niz stringova i ispisuje sve stringove
        // koje sadrze bar jedno malo i bar jedno veliko slovo.

        String[] nizStringova = {"test", "TEST", "Test", "TeSt"};
        velicinaStringovaUSlovima(nizStringova);

    }

    public static void velicinaStringovaUSlovima(String[] stringovi) {

        for(String s:stringovi) {
            if(!s.equals(s.toUpperCase()) && !s.equals(s.toLowerCase())) {
                System.out.println(s);
            }
        }

//        for(int i = 0; i < stringovi.length; i++) {
//            if(!stringovi[i].equals(stringovi[i].toUpperCase()) && !stringovi[i].equals(stringovi[i].toLowerCase())) {
                    //test != TEST && test != test
//                System.out.println(stringovi[i]);
//            }
//        }
    }





}
