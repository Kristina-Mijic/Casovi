package Dodatni_zadatak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> student1Ocene = new ArrayList<>();
        student1Ocene.add(6);
        student1Ocene.add(6);
        student1Ocene.add(6);
        student1Ocene.add(7);

        ArrayList<Integer> student2Ocene = new ArrayList<>();
        student2Ocene.add(6);
        student2Ocene.add(6);
        student2Ocene.add(8);
        student2Ocene.add(9);

        ArrayList<Integer> student3Ocene = new ArrayList<>();
        student3Ocene.add(10);
        student3Ocene.add(10);
        student3Ocene.add(10);
        student3Ocene.add(9);

        Student student1 = new Student(1, student1Ocene, 1);
        Student student2 = new Student(2, student2Ocene, 1);
        Student student3 = new Student(3, student3Ocene, 2);

        ArrayList<Student> listaStud = new ArrayList<>();
        listaStud.add(student1);
        listaStud.add(student2);
        listaStud.add(student3);

        Departman lista = new Departman(listaStud);
        System.out.println("Najuspesniji: " + lista.najuspesnijiUcenik());
        System.out.println("Ucenici druge godine: " + lista.vratiUcenike(2));

        lista.izbacivanje();
        System.out.println("Studenti sa prosekom iznad 7.0: " + lista);

        Matematika matematika = new Matematika(listaStud);
        matematika.izbacivanje();
        System.out.println("Studenti sa prosekom iznad 8.0: " + matematika);

        Geografija geografija = new Geografija(listaStud);
        geografija.izbacivanje();
        System.out.println("Studenti sa prosekom iznad 6.5: " + geografija);



        //Fakultet djaciGenerac = new Fakultet();
        //djaciGenerac.djaciGeneracije();
        //System.out.println("Djaci generacije su: " + djaciGenerac);


    }
}
