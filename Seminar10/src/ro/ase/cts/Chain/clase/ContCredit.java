package ro.ase.cts.Chain.clase;

public class ContCredit extends Cont{
    public ContCredit(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlate(float suma) {
        if(super.getSold() >= suma){
            System.out.println("Se realizeaza plata din contul de economii n val de "+suma);
            super.setSold(super.getSold()-suma);
        }else if( super.getSuccesorCont() != null){
            super.getSuccesorCont().realizeazaPlate(suma);
        }else{
            System.out.println("Nu se poate realiza plata ");
        }

    }
}
