package Student;

import java.util.ArrayList;

public class Student {
    //Zadatak 4:
    //Napraviti klasu Student koja ima ime i listu ocena.Poseduje metode prosek() koji vraca prosek ucenikovih ocena i najvecaOcena() koji vraca najvecu zabelezenu ucenikovu ocenu.
    //Zadatak 4 (druga varijanta):
    //Napraviti klasu Student koja ima ime i prosek. Ima metode uspeh() koji ispisuje da li je ucenik odlican(prosek 4.5 i veci) vrlo dobar(prosek 3.5 i manje) ili dobar(prosek 2.5 i manje).

    private String imeStudenta;
    private ArrayList<Integer> listaOcena;

    public Student(String imeStudenta, ArrayList<Integer> listaOcena) {
        this.imeStudenta = imeStudenta;
        this.listaOcena = listaOcena;
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public String toString() {
        return "Ime studenta " + imeStudenta + " ocena: " +  listaOcena;
    }

    public double prosek() {
        double zbirOcena = 0;

        for(int i = 0; i < listaOcena.size(); i++) {
            zbirOcena += listaOcena.get(i);
        }
        return zbirOcena / listaOcena.size();
    }

    public int najvecaOcena() {
        int maxOcena = Integer.MIN_VALUE;
        //int max = listaOcena.get(0) ;// max = niz[o]

        for(int i = 0; i < listaOcena.size(); i++) {
            if(listaOcena.get(i) > maxOcena) {
                maxOcena = listaOcena.get(i);
            }
        }
        return maxOcena;
    }

    public void uspeh() {
        double prosek = prosek();

        if(prosek > 4.5) {
            System.out.println("Student je odlican");
        } else if(prosek > 3.5) {
            System.out.println("Student je vrlodobar");
        } else if(prosek > 2.5) {
            System.out.println("Student je dobar");
        } else {
            System.out.println("Ucenik je nedovoljan!");
        }

    }


}
