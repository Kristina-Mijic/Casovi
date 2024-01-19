package Radnik;

public class Radnik {
    private int id;
    private int godinaZaposlenja;
    private double plataRadnika;

    public Radnik(int id, int godinaZaposlenja, double plataRadnika) {
        this.id = id;
        this.godinaZaposlenja = godinaZaposlenja;
        this.plataRadnika = plataRadnika;
    }

    public int getId() {
        return id;
    }
    public void setId(int noviId) {
        this.id = noviId;
    }


    public int getGodinaZaposlenja(){
        return godinaZaposlenja;
    }
    public void setGodinaZaposlenja(int novaGodZaposlenja) {
        this.godinaZaposlenja = novaGodZaposlenja;
    }


    public double getPlataRadnika(){
        return plataRadnika;
    }
    public void setPlataRadnika(double novaPlata) {
        this.plataRadnika = novaPlata;
    }


    public int godinaStaza() {
        int trenutnaGodina = 2023;
        return trenutnaGodina - godinaZaposlenja;
    }
    public double povisica() {
        int staz = godinaStaza();
        double novaPlata = 0;

        if(staz > 5 && staz < 10) {
            novaPlata = plataRadnika * 1.2;
        } else if(staz >= 10) {
            novaPlata = plataRadnika * 1.4;
        }

        return novaPlata;
    }

    public String toString() {
        return "ID radnika: " + id + " se zaposlio: " + godinaZaposlenja + ", moja plata je: " + plataRadnika + " dinara.";
    }



}
