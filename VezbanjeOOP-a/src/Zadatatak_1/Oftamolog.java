package Zadatatak_1;

public class Oftamolog extends Doktor{
    public Oftamolog(int idDoktora) {
        super(idDoktora);
    }

    @Override
    public double zarada() {
        return getListaPacijenata().size() * 120;
    }
}
