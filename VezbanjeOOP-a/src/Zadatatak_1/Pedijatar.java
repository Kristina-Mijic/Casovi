package Zadatatak_1;

public class Pedijatar extends Doktor{
    public Pedijatar(int idDoktora) {
        super(idDoktora);
    }

    @Override
    public void dodajPacijenta(Pacijent noviPacijent) {
        if(getListaPacijenata().size() < 40 && getListaPacijenata().size() > 18) {
            getListaPacijenata().add(noviPacijent);
            System.out.println("Novi pacijent je dodat kod pedijatra");
        } else {
            System.out.println("Pedijatar ima maksimalan broj pacijenata");
        }
    }
}
