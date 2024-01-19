package Zadatak3;
//Klasa BMW nasledjuje klasu Auto i:
//- BMW daje popust od 50% na sve modele koji su beli
public class Bmw extends Automobil {
    public Bmw(Tocak rezervniTocak, double cena, int godinaProzivodnje, String boja) {
        super(rezervniTocak, cena, godinaProzivodnje, boja);
    }
    @Override
    public void popust() {
        if(getBoja().equalsIgnoreCase("bela")) {
            double novaCena = getCena()/2;
            setCena(novaCena);
        }
    }




}
