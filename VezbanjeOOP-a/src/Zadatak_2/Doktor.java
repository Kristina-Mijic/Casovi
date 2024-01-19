package Zadatak_2;

import java.util.ArrayList;

public class Doktor {

    private int id;
    private ArrayList<Pacijent> listaPacijenata;

    public Doktor(int id, ArrayList<Pacijent> listaPacijenata) {
        this.id = id;
        this.listaPacijenata = listaPacijenata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Pacijent> getListaPacijenata() {
        return listaPacijenata;
    }

    public void setListaPacijenata(ArrayList<Pacijent> listaPacijenata) {
        this.listaPacijenata = listaPacijenata;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "id=" + id +
                ", listaPacijenata=" + listaPacijenata +
                '}';
    }


    //METODE:

    public int brojDijagnoza(String dijagnoza) {
        int brojPojavljivanja = 0;

        for(Pacijent pacijenti :listaPacijenata) {
            if(pacijenti.getDijagnoza().equalsIgnoreCase(dijagnoza)) {
                brojPojavljivanja++;
            }
        }
        return brojPojavljivanja;
    }

    public double zarada() {
        return 100 * listaPacijenata.size();
    }

    public void dodajPacijenta(Pacijent noviPacijent) {

        if(listaPacijenata.size() < 30) {
            listaPacijenata.add(noviPacijent);
            System.out.println("Novi pacijent je dodat na spisku!");
        } else {
            System.out.println("Nije moguce dodati pacijenta!");
        }
    }



}
