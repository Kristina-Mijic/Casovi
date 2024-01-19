package Dodatni_zadatak;

import java.util.ArrayList;
import java.util.Iterator;

public class Departman {

    private ArrayList<Student> listaStudenata;

    public Departman(ArrayList<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

    public ArrayList<Student> getListaStudenata() {
        return listaStudenata;
    }

    public void setListaStudenata(ArrayList<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

    @Override
    public String toString() {
        return
                "listaStudenata = " + listaStudenata +
                '}';
    }

    //METODE:

    public Student najuspesnijiUcenik() {

        Student najuspesniji = listaStudenata.get(0);

        for (Student student : listaStudenata) {
            if (student.prosek() > najuspesniji.prosek()) {
                najuspesniji = student;
            }
        }

        return najuspesniji;
    }

    public ArrayList<Student> vratiUcenike(int godinaStudiranja) {

        ArrayList<Student> novaListaStudenata = new ArrayList<>();

        for(Student studenti: listaStudenata) {
            if(studenti.getGodinaStudiranja() == godinaStudiranja) {
                novaListaStudenata.add(studenti);
            }
        }
        return novaListaStudenata;
    }


    public void izbacivanje() {

        ArrayList<Student> listaLosihStudenata = new ArrayList<>();

        for(Student student: listaStudenata) {
            if(student.prosek() < 7.0) {
                listaLosihStudenata.add(student);
            }
        }
        for(Student losi: listaLosihStudenata) {
            listaStudenata.remove(losi);
        }
    }


}
