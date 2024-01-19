package Dodatni_zadatak;

import java.util.ArrayList;

public class Geografija extends Departman{
    public Geografija(ArrayList<Student> listaStudenata) {
        super(listaStudenata);
    }

    @Override
    public void izbacivanje() {
        ArrayList<Student> listaStudenataGeografija = new ArrayList<>();

        for(Student student: getListaStudenata()) {
            if(student.prosek() < 6.5) {
                listaStudenataGeografija.add(student);
            }
        }
        for(Student losi: listaStudenataGeografija) {
            getListaStudenata().remove(losi);
        }
    }
}
