package ro.ase.cts.observer.Command.clase;

public class Executant {
    private float sold ;
    private String detinator ;

    public Executant(String detinator) {
        this.detinator = detinator;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public String getDetinator() {
        return detinator;
    }

    public void setDetinator(String detinator) {
        this.detinator = detinator;
    }
    void creeazaCont(float sold){
        this.sold = sold ;
        System.out.println("S a constituit contul cu suma de "+sold);
    }
    void retragere(float suma){
        if(suma <= sold){
            this.sold-= suma ;
            System.out.println("S a retras suma de "+suma);
        }else{
            System.out.println("Fonduri insuficiente");
        }

    }
    void depunere(float suma){
        this.sold += suma ;
        System.out.println(" S a depus suma de "+ suma);
    }
}
