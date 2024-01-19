package Zadatak2;

import java.util.ArrayList;

public abstract class Fakultet {

    private ArrayList<Ucenik> ucenici;

    public Fakultet(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }


    public ArrayList<Ucenik> getUcenici() {
        return ucenici;
    }

    public void setListaUcenika(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    @Override
    public String toString() {
        return "Fakultet{" +
                "listaUcenika=" + ucenici +
                '}';
    }


    //METODE:
    public int uspesni() {
        int brojac = 0;

        for(Ucenik pivot: ucenici) {
            if(pivot.izracunajProsek() >= 8.5) {
                brojac++;
            }
        }
        return brojac;
    }

    public abstract double zarada();



    //Drugi nacin:
//    public int uspesni2() {
//        int brojac = 0;
//
//        for(int i = 0; i < ucenici.size(); i++) {
//            if(ucenici.get(i).izracunajProsek() > 8.5) {
//                brojac++;
//            }
//        }
//        return brojac;
//    }


}
