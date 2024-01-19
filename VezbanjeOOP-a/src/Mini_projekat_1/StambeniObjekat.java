package Mini_projekat_1;

public class StambeniObjekat {
    private String lokacija;
    private double cena;
    private double kvadratura;


    public StambeniObjekat(String lokacija, double cena, double kvadratura) {
        this.lokacija = lokacija;
        this.cena = cena;
        this.kvadratura = kvadratura;
    }


    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public int getCena() {
        return (int) cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }

    @Override
    public String toString() {
        return "StambeniObjekat{" +
                "lokacija='" + lokacija + '\'' +
                ", cena=" + cena +
                ", kvadratura=" + kvadratura +
                '}';
    }


    //METODE:

    public double cenaPoKvadratu() {
        return cena / kvadratura;
    }
}
