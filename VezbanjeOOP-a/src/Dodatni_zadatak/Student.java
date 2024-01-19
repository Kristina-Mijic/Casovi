package Dodatni_zadatak;

import java.util.ArrayList;

public class Student {

    private int id;
    private ArrayList<Integer> listaOcena;
    private int godinaStudiranja;

    public Student(int id, ArrayList<Integer> listaOcena, int godinaStudiranja) {
        this.id = id;
        this.listaOcena = listaOcena;
        this.godinaStudiranja = godinaStudiranja;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public int getGodinaStudiranja() {
        return godinaStudiranja;
    }

    public void setGodinaStudiranja(int godinaStudiranja) {
        this.godinaStudiranja = godinaStudiranja;
    }

    @Override
    public String toString() {
        return "Student:" +
                "ID = " + id +
                ", lista Ocena = " + listaOcena +
                ", godina Studiranja = " + godinaStudiranja;
    }

    public double prosek() {

        if (listaOcena.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (double ocena : listaOcena) {
            sum += ocena;
        }

        return sum / listaOcena.size();
    }



}
