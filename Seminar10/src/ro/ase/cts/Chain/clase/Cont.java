package ro.ase.cts.Chain.clase;

public abstract class Cont {
    private float sold ;
    private Cont succesorCont ;

    public Cont(float sold) {
        this.sold = sold;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public Cont getSuccesorCont() {
        return succesorCont;
    }

    public void setSuccesorCont(Cont succesorCont) {
        this.succesorCont = succesorCont;
    }
    public abstract  void realizeazaPlate(float suma ) ;
}
