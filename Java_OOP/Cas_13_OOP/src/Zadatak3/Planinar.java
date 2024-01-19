package Zadatak3;

import java.util.ArrayList;

public abstract class Planinar {
    private String imePlaninara;
    private ArrayList<Planina> listaPlanina;

    public Planinar(String imePlaninara, ArrayList<Planina> listaPlanina) {
        this.imePlaninara = imePlaninara;
        this.listaPlanina = listaPlanina;
    }


    public abstract void izbacitiOpasnePlanine();

    public int izracunajUkupnuVisinuPlanina() {
        int ukupnaVisina = 0;

        for(Planina pivot: listaPlanina) {
            ukupnaVisina += pivot.getVisina();
        }
        return ukupnaVisina;
    }


    //GETERI I SETERI:
    public String getImePlaninara() {
        return imePlaninara;
    }

    public void setImePlaninara(String imePlaninara) {
        this.imePlaninara = imePlaninara;
    }

    public ArrayList<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(ArrayList<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }
}
