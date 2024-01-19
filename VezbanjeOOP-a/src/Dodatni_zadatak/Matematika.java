package Dodatni_zadatak;

import java.util.ArrayList;

public class Matematika extends Departman{
    public Matematika(ArrayList<Student> listaStudenata) {
        super(listaStudenata);
    }

    @Override
    public void izbacivanje() {
        ArrayList<Student> novaListaStudenataMatematika = new ArrayList<>();

        for(Student student: getListaStudenata()) {
            if(student.prosek() < 8.0) {
                novaListaStudenataMatematika.add(student);
            }
        }
        for(Student losi: novaListaStudenataMatematika) {
            getListaStudenata().remove(losi);
        }
    }
}
