package ro.ase.cts.template.clase;

public class SpectatorVIP extends  Template{
    private String nume ;
    private int nrLoja;

    public SpectatorVIP(String nume, int nrLoje) {
        this.nume = nume;
        this.nrLoja = nrLoje;
    }

    @Override
    public void seAseazaLaCoada() {

    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume+" preaziinta biletul vip pt loja "+ nrLoja);
    }

    @Override
    public void seFaceControlulCorporal() {
        System.out.println(this.nume+" se face controlul corporal ");

    }

    @Override
    public void seOcupaLoc() {
        System.out.println(this.nume+" ocupa loc in loja"+this.nrLoja);

    }
}
