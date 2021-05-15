package ro.ase.cts.observer.builder.clase;

public class Rezervare {
    private int codRezervare ;
    private boolean areMancareInclusa ;
    private boolean areScaunErgonomic ;
    private boolean areBauturiRacoritoareIncluse ;
    private boolean areMuzicaAmbientala ;
    private String genMuzical ;

    public Rezervare(int codRezervare, boolean areMancareInclusa,
                     boolean areScaunErgonomic, boolean areBauturiRacoritoareIncluse,
                     boolean areMuzicaAmbientala, String genMuzical) {
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturiRacoritoareIncluse = areBauturiRacoritoareIncluse;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzical = genMuzical;
    }

    public int getCodRezervare() {
        return codRezervare;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public boolean isAreMancareInclusa() {
        return areMancareInclusa;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public boolean isAreBauturiRacoritoareIncluse() {
        return areBauturiRacoritoareIncluse;
    }

    public void setAreBauturiRacoritoareIncluse(boolean areBauturiRacoritoareIncluse) {
        this.areBauturiRacoritoareIncluse = areBauturiRacoritoareIncluse;
    }

    public boolean isAreMuzicaAmbientala() {
        return areMuzicaAmbientala;
    }

    public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancareInclusa=").append(areMancareInclusa);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBauturiRacoritoareIncluse=").append(areBauturiRacoritoareIncluse);
        sb.append(", areMuzicaAmbientala=").append(areMuzicaAmbientala);
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
