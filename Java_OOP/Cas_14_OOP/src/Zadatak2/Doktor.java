package Zadatak2;

import java.util.ArrayList;

public class Doktor {
    private int id;
    private ArrayList<Pacijent> listaPacijenata;


    //Konstruktor:
    public Doktor(int id, ArrayList<Pacijent> listaPacijenata) {
        this.id = id;
        this.listaPacijenata = listaPacijenata;
    }


    //METODE:
    public int brojDijagnoza(String dijagnoza) {
        int brojPonavljanja = 0;

        for(Pacijent pacijent: listaPacijenata) {
            if(pacijent.getDijagnoza().equalsIgnoreCase(dijagnoza)) {
                brojPonavljanja++;
            }
        }
        return brojPonavljanja;
    }

    public double zarada() {
        return 100 * listaPacijenata.size();
    }

    public void dodajPacijenta(Pacijent noviPacijent) {

        if(listaPacijenata.size() < 30) {
            listaPacijenata.add(noviPacijent);
            System.out.println("Novi pacijent je dodat.");
        } else {
            System.out.println("Lista ne moze da prihvati novog pacijenta.");
        }
    }



    //GET I SET

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




}
