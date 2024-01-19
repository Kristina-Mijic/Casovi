package Dodatni_zadatak;

import java.util.ArrayList;

public class Fakultet {

    private ArrayList<Departman> listaDepartman;

    public Fakultet(ArrayList<Departman> listaDepartman) {
        this.listaDepartman = listaDepartman;
    }

    public ArrayList<Departman> getListaDepartman() {
        return listaDepartman;
    }

    public void setListaDepartman(ArrayList<Departman> listaDepartman) {
        this.listaDepartman = listaDepartman;
    }

    @Override
    public String toString() {
        return "Fakultet{" +
                "listaDepartman=" + listaDepartman +
                '}';
    }

    public ArrayList<Student> djaciGeneracije() {

        ArrayList<Student> djaciGeneracije = new ArrayList<>();
        for(Departman dep: listaDepartman) {
            djaciGeneracije.add(dep.najuspesnijiUcenik());
        }
        return djaciGeneracije;
    }


//
//    public void upisiUcenika(Student ucenik, Departman d) {
//
//    }
//
//    public ArrayList<Departman> najviseDobrih() {
//
//    }
}
