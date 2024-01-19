package Zadatak3;

public class Planina {
    private String naziv;
    private int visina;


    //Konstruktor:
    public Planina(String naziv, int visina) {
        this.naziv = naziv;
        this.visina = visina;
    }


    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }



    public int getVisina() {
        return visina;
    }
    public void setVisina(int visina) {
        this.visina = visina;
    }

    @Override
    public String toString() {
        return "Planina{" +
                "naziv='" + naziv + '\'' +
                ", visina=" + visina +
                '}';
    }
}
