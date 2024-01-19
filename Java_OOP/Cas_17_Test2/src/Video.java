public class Video {

    private String naziv;
    private int brojPregleda;
    private int brojLajkova;

    public Video(String naziv, int brojPregleda, int brojLajkova) {
        this.naziv = naziv;
        this.brojPregleda = brojPregleda;
        this.brojLajkova = brojLajkova;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojPregleda() {
        return brojPregleda;
    }

    public void setBrojPregleda(int brojPregleda) {
        this.brojPregleda = brojPregleda;
    }

    public int getBrojLajkova() {
        return brojLajkova;
    }

    public void setBrojLajkova(int brojLajkova) {
        this.brojLajkova = brojLajkova;
    }

    @Override
    public String toString() {
        return "Video{" +
                "naziv='" + naziv + '\'' +
                ", brojPregleda=" + brojPregleda +
                ", brojLajkova=" + brojLajkova +
                '}';
    }

}
