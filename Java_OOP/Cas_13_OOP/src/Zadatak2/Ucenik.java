package Zadatak2;

import java.util.ArrayList;

public class Ucenik {

    private int id;
    private int godine;
    private ArrayList<Integer> ocene;

    public Ucenik(int id, int godine, ArrayList<Integer> ocene) {
        this.id = id;
        this.godine = godine;
        this.ocene = ocene;
    }


    public double izracunajProsek() {

        double rezultat = 0;
        for(int i = 0; i < ocene.size(); i++) {
            rezultat += ocene.get(i);
        }
        return rezultat / ocene.size();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }


    @Override
    public String toString() {
        return "Ucenik{" +
                "id=" + id +
                ", godine=" + godine +
                ", ocene=" + ocene +
                '}';
    }
}
