

public class Main {
    public static void main(String[] args) {

       // Ovo je jednolinijski komentar

        /*
        Ovo je viselinijski
        komentar
         */


        //psvm - skracenica za public static void main
        //sout - skracenica za - System.out.print


        int number; // ovo je deklaracija
        number = 5; //ovo je inicijalizacija, proces dodevljivanja vrednosti memor.prostoru
        int drugiBtoj = 3;
        double decimala = 3.14;
        boolean logicki = 5 < 2; //ova promenljiva registruje kao false
        char karakter = '4';


        String text = "Ovo je neki string i pise se unutar duplih navodnika.";

        System.out.println("Hello World!");

        String name = "Kristina";
        System.out.println("Zdravo " + name);


        System.out.println("Integer: " + drugiBtoj);
        System.out.println("Double: " + decimala);
        System.out.println("Boolean: " + logicki);
        System.out.println("Char: " + karakter);


        //Zadatak 1:
        //Deklarisati promenljive za ime, prezime i mesto rodjenja. Istampati u konzoli uz odgovarajucu poruku sve informacije.

        String ime = "Kristina ";
        String prezime = " Mijic ";
        String zanimanje = " - QA ";
        String grad = " Nis ";

        System.out.println("Zdravo, moje ime je: " + ime + ",a prezime: " + prezime +  " - " + zanimanje + " - " + grad);


        int jedanBroj = 12;
        int drugiBroj = 10;

        int sabiranje = jedanBroj + drugiBroj;
        System.out.println("Sabiranje: " + sabiranje);

        int oduzimanje = jedanBroj - drugiBroj;
        System.out.println("Oduzimanje: " + oduzimanje);

        int mnozenje = jedanBroj + drugiBroj;
        System.out.println("Mnozenje: "+ mnozenje);

        double deljenje = jedanBroj / drugiBroj;
        System.out.println("Deljenje: " + deljenje);


        double a = 2.778;
        double b = 3.0;
        double deljenje2 = a / b;
        System.out.println("Deljenje2 sa double: " + deljenje2);

        jedanBroj = 2;
        System.out.println("Ikrement: " + jedanBroj);
        jedanBroj++;
        System.out.println("Dekrement: " + jedanBroj);
        jedanBroj = jedanBroj + 2;
        jedanBroj += 2;
        System.out.println(jedanBroj);


        //String operatori:
        String text1 = "Ovo je prvi string, - ";
        String text2 = "Ovo je drugi string";
        String rezultatText = text1 + text2;
        System.out.println(rezultatText);

        //Zadatak 2:
       // a) Deklarisati promenljive za ime, prezime i mesto rodjenja. Istampati u konzoli uz odgovarajucu poruku sve informacije.
       // b) Pomocu konkatenacije spojiti ove tri promenljive u jednu i istampati je sve u velikim slovima.

        String spojenText = ime + prezime + grad + zanimanje;
        System.out.println("Ovo je zadatak 2: " + spojenText);
        System.out.println("Primer sa toUpperCase: " + spojenText.toUpperCase());
        System.out.println("Primer sa toLowerCase: " + spojenText.toLowerCase());


        //3) Deklarisati i inicijalizovati dve int promenljive. Napraviti ispis sa porukom za sledece operacije:
        //a) a na kvadrat
        //b) a na kubni
        //c) ostatak pri deljenju a sa b, ostatak pri deljenju b sa a i njihov zbir
        //d) izracunati razliku a i b i inkrementovati rezultat za 1.


        int x = 5;
        int y = 3;

        int rezKvadrat = x * x;
        int rezKubni = rezKvadrat * x;
        int ostatak1 = x % y;
        int ostatak2 = y % x;
        //a) a na kvadrat
        System.out.println("Primer a: na kvadrat: " + rezKvadrat);

        //b) a na kubni
        System.out.println("Primer b: na kubni: " + rezKubni);

        //c) ostatak pri deljenju a sa b, ostatak pri deljenju b sa a i njihov zbir
        System.out.println("Primer ostatak pri deljenju: " + ostatak1 + ostatak2);

        //d) izracunati razliku a i b i inkrementovati rezultat za 1.
        int rezRazlika = x - y;
        rezRazlika++;
        System.out.println("Primer razlika i inkrementovati: " + rezRazlika);



    }
}

