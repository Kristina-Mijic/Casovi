public class Staza {
    private String imeStaze;
    private double duzinaUKm;

    public Staza(String imeStaze, double duzinaUKm) {
        this.imeStaze = imeStaze;
        this.duzinaUKm = duzinaUKm;
    }

    public String getImeStaze() {
        return imeStaze;
    }

    public void setImeStaze(String imeStaze) {
        this.imeStaze = imeStaze;
    }

    public double getDuzinaUKm() {
        return duzinaUKm;
    }

    public void setDuzinaUKm(double duzinaUKm) {
        this.duzinaUKm = duzinaUKm;
    }

    @Override
    public String toString() {
        return "Staza{" +
                "imeStaze='" + imeStaze + '\'' +
                ", duzinaUKm=" + duzinaUKm +
                '}';
    }
}
