public class Zadatak4 {
    public static void main(String[] args) {

        //Zadatak 4 (XO):
        //Napraviti metodu koja prima niz karaktera od x i o, zatim prolazi kroz
        //taj niz i trazi tri uzastopna karaktera (x ili o). Cim naidje tri puta za
        //redom na jedan karakter, izlazi iz metode i stampa poruku koji
        //karakter je pobedio (koji se pronasao tri puta uzastopno).

        char[] nizKarakteraXiO = {'x', 'o', 'x', 'o', 'x', 'x', 'x',  'o'};

        System.out.println(izracunajPobednika(nizKarakteraXiO));
    }
    public static String izracunajPobednika(char[] niz) {

        int numX = 0;
        int numO = 0;

        for(int i = 0; i < niz.length; i++) {
            if(niz[i] == 'x') {
                numX++;
            } else {
                numX = 0;
            }

            if(niz[i] == 'o') {
                numO++;
            } else {
                numO = 0;
            }

            if(numX >= 3) {
                return "X je pobedio!";
            } else if(numO >= 3) {
                return "O je pobedio!";
            }
        }
        return "Nema pobednika!";
    }
}
