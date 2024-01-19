package ApstraktneKlase;

public class Pas extends Zivotinje {

    public Pas(int godine, boolean daLiJeSisar) {
        super(godine, daLiJeSisar);
    }

    @Override
    public void zvuk() {
        System.out.println("Avav!");
    }
}
