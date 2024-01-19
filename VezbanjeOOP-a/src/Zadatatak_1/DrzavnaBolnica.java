package Zadatatak_1;

public class DrzavnaBolnica extends Bolnica{

    @Override
    public double zarada() {
        return getListaLekara().size() * 200.0;
    }
}
