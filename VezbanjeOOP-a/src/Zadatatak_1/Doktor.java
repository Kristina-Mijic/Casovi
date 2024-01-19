package Zadatatak_1;

import java.util.ArrayList;

public class Doktor {
    private int idDoktora;
    private ArrayList<Pacijent> listaPacijenata;


    public Doktor(int idDoktora) {
        this.idDoktora = idDoktora;
        this.listaPacijenata = new ArrayList<>();
    }

    //SET i GET

    public int getIdDoktora() {
        return idDoktora;
    }

    public void setIdDoktora(int idDoktora) {
        this.idDoktora = idDoktora;
    }

    public ArrayList<Pacijent> getListaPacijenata() {
        return listaPacijenata;
    }

    public void setListaPacijenata(ArrayList<Pacijent> listaPacijenata) {
        this.listaPacijenata = listaPacijenata;
    }




//METODE:
    public int brojDijagnoza(String dijagnoza) {

        int brojPonavljanja = 0;

        for(Pacijent pacijenti: listaPacijenata) {
            if(pacijenti.getDijagnoza().equalsIgnoreCase(dijagnoza)) {
                brojPonavljanja++;
            }
        }
        return brojPonavljanja;
    }


    public double  zarada() {
        return 100 * listaPacijenata.size();
    }

    public void dodajPacijenta(Pacijent noviPacijent) {
        if(listaPacijenata.size() < 30) {
            listaPacijenata.add(noviPacijent);
            System.out.println("Novi pacijent je dodat");
        } else {
            System.out.println("Nije moguce dodati novog pacijenta");
        }
    }


}
