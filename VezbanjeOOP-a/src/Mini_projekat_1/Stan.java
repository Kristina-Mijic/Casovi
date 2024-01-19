package Mini_projekat_1;

public class Stan extends StambeniObjekat{

    private boolean terasa;
    public Stan(String lokacija, double cena, double kvadratura, boolean terasa) {
        super(lokacija, cena, kvadratura);
        this.terasa = terasa;
    }

    public boolean isTerasa() {
        return terasa;
    }

    public void setTerasa(boolean terasa) {
        this.terasa = terasa;
    }
}
