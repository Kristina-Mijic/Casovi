package ApstraktneKlase;
//Zadatak 1:
//Napraviti apstraktnu klasu Zivotinja koja ima godinu i logicku vrednost za sisara, takodje ima apstraktan metod koji proizvodi zvuk zivotinje.
//Napraviti klasu Pas i Macka koje nasledjuju klasu Zivotinja, i definisati njihov zvuk.
//Napraviti klasu Zoo koji ima listu zivotinja i metodu koja broji koliko imamo pasa a koliko macaka.
public abstract class Zivotinje {

    private int godine;
    private boolean daLiJeSisar;


    public Zivotinje(int godine, boolean daLiJeSisar) {
        this.godine = godine;
        this.daLiJeSisar = daLiJeSisar;
    }


    public abstract void zvuk();

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public boolean isDaLiJeSisar() {
        return daLiJeSisar;
    }

    public void setDaLiJeSisar(boolean daLiJeSisar) {
        this.daLiJeSisar = daLiJeSisar;
    }








    @Override
    public String toString() {
        return "Zivotinje{" +
                "godine=" + godine +
                ", daLiJeSisar=" + daLiJeSisar +
                '}';
    }
}
