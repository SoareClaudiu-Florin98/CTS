package ro.ase.cts.memento.clase;

public class Memento {
    private String echipaGazda ;
    private String echipaoaspete ;
    private int nrSpectatori ;

    public Memento(String echipaGazda, String echipaoaspete, int nrSpectatori) {
        this.echipaGazda = echipaGazda;
        this.echipaoaspete = echipaoaspete;
        this.nrSpectatori = nrSpectatori;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public String getEchipaoaspete() {
        return echipaoaspete;
    }

    public void setEchipaoaspete(String echipaoaspete) {
        this.echipaoaspete = echipaoaspete;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }
}
