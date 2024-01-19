package Mini_projekat_1;

import java.util.ArrayList;

public class Agencija {
    private ArrayList<StambeniObjekat> listaStambenihObj;

    public Agencija() {
        this.listaStambenihObj = new ArrayList<>();
    }

    public void dodajStambeniObjekat(StambeniObjekat objekat) {
        listaStambenihObj.add(objekat);
    }

    public Agencija(ArrayList<StambeniObjekat> listaStambenihObj) {
        this.listaStambenihObj = new ArrayList<>();;
    }

    public ArrayList<StambeniObjekat> getListaStambenihObj() {
        return listaStambenihObj;
    }

    public void setListaStambenihObj(ArrayList<StambeniObjekat> listaStambenihObj) {
        this.listaStambenihObj = listaStambenihObj;
    }

    @Override
    public String toString() {
        return "Agencija{" +
                "listaStambenihObj=" + listaStambenihObj +
                '}';
    }

    //METODE:

    public Object najboljaPonuda() {
        if (listaStambenihObj.isEmpty()) {
            return null;
        }
        StambeniObjekat najboljaPonuda = listaStambenihObj.get(0);

        for (StambeniObjekat objekat : listaStambenihObj) {
            if (objekat.cenaPoKvadratu() < najboljaPonuda.cenaPoKvadratu()) {
                najboljaPonuda = objekat;
            }
        }
        return najboljaPonuda;
    }


    public Object najjeftiniji() {
        if (listaStambenihObj.isEmpty()) {
            return null;
        }

        StambeniObjekat najjeftinijiObjekat = listaStambenihObj.get(0);
        for (StambeniObjekat objekat : listaStambenihObj) {
            if (objekat.getCena() < najjeftinijiObjekat.getCena()) {
                najjeftinijiObjekat = objekat;
            }
        }
        return najjeftinijiObjekat;
    }


    public ArrayList<StambeniObjekat> uPonudi(String lokacija) {
        ArrayList<StambeniObjekat> objektiNaLokaciji = new ArrayList<>();

        for (StambeniObjekat objekat : listaStambenihObj) {
            if (objekat.getLokacija().equalsIgnoreCase(lokacija)) {
                objektiNaLokaciji.add(objekat);
            }
        }

        return objektiNaLokaciji;
    }


    public ArrayList<StambeniObjekat> uBudzetu(double budzet) {
        ArrayList<StambeniObjekat> objektiUOkviruBudzeta = new ArrayList<>();

        for (StambeniObjekat objekat : listaStambenihObj) {
            if (objekat.getCena() <= budzet) {
                objektiUOkviruBudzeta.add(objekat);
            }
        }
        return objektiUOkviruBudzeta;
    }


    //izbacuje iz liste sve stanove koji nemaju terasu
    public void izbaciBezTerase() {
        ArrayList<StambeniObjekat> objektiSaTerasom = new ArrayList<>();

        for (StambeniObjekat objekat : listaStambenihObj) {
            if (!(objekat instanceof Stan) || ((Stan) objekat).isTerasa()) {
                objektiSaTerasom.add(objekat);
            }
        }

        listaStambenihObj = objektiSaTerasom;
    }
}
