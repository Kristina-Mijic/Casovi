package ApstraktneKlase;

public class Macka extends Zivotinje{


    public Macka(int godine, boolean daLiJeSisar) {
        super(godine, daLiJeSisar);
    }

    @Override
    public void zvuk() {
        System.out.println("Mjauu!");
    }
}
