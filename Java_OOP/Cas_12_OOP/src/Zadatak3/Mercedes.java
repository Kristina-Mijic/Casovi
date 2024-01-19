package Zadatak3;
//Klasa Mercedes nasledjuje klasu Auto i:
//- menja Tocak tek kada je koriscen vise od 150 dana
public class Mercedes extends Automobil{
    public Mercedes(Tocak rezervniTocak, double cena, int godinaProzivodnje, String boja) {
        super(rezervniTocak, cena, godinaProzivodnje, boja);
    }

    @Override
    public void novTocak() {
        if(getRezervniTocak().getBrojDanaKoriscenja() > 150) {
            Tocak nov = new Tocak();
            setRezervniTocak(nov);
        }
    }
}
