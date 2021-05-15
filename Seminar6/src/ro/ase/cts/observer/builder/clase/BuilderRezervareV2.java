package ro.ase.cts.observer.builder.clase;

public class BuilderRezervareV2 implements  AbstractBuilder{
    private int codRezervare ;
    private boolean areMancareInclusa ;
    private boolean areScaunErgonomic ;
    private boolean areBauturiRacoritoareIncluse ;
    private boolean areMuzicaAmbientala ;
    private String genMuzical ;


    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare,areMancareInclusa,areScaunErgonomic
        ,areBauturiRacoritoareIncluse,areMuzicaAmbientala,genMuzical);
    }
    public BuilderRezervareV2(){
        codRezervare = 1000 ;
        genMuzical = "Rocke" ;
    }

    public BuilderRezervareV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this ;
    }

    public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this ;
    }

    public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this ;
    }

    public BuilderRezervareV2 setAreBauturiRacoritoareIncluse(boolean areBauturiRacoritoareIncluse) {
        this.areBauturiRacoritoareIncluse = areBauturiRacoritoareIncluse;
        return this ;
    }

    public BuilderRezervareV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this ;
    }

    public BuilderRezervareV2 setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this ;
    }
}
