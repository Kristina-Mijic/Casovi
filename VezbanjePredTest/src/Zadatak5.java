public class Zadatak5 {
    public static void main(String[] args) {
        //Zadatak 5:
        //Napraviti metodu koja prima niz Stringova
        //i jedan String, kao rezultat vraca da li se on nalazi tu ili ne (true ili false).

        String[] nizStringova = {"d", "a", "k"};
        String string = "f";

//        boolean locirajString = sadrziString(nizStringova, string);
//        System.out.println(locirajString);

        boolean lociraj = pronadjiString(nizStringova, string);
        System.out.println(lociraj);

        if(lociraj) {
            System.out.println("String se nalazi u nizu!");
        } else {
            System.out.println("String se NE nalazi u nizu!");
        }

    }
    public static boolean sadrziString(String[] nizStringova, String jedanString) {

        for(String stringUNizu:nizStringova) {
            if(stringUNizu.equalsIgnoreCase(jedanString)) {
                return true;
            }
        }
        return false;
    }


    public static boolean pronadjiString(String[] nizStringova, String str) {
        boolean nalazi = false;

        for(String niz: nizStringova) {
            if(niz.equalsIgnoreCase(str)) {
               nalazi = true;
            }
        }
        return nalazi;
    }


}

