package ro.ase.cts.template.clase;

public abstract class Template {

    public final void intraPeStadion(){
        seAseazaLaCoada();
        prezintaBilet();
        seFaceControlulCorporal();
        seOcupaLoc();
    }
    public abstract  void  seAseazaLaCoada() ;
    public abstract  void  prezintaBilet() ;
    public abstract  void  seFaceControlulCorporal() ;
    public abstract  void  seOcupaLoc() ;

}
