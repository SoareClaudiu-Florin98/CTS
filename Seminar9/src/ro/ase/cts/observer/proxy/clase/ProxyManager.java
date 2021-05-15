package ro.ase.cts.observer.proxy.clase;

public class ProxyManager implements Rezervabil{
    private ManagerRezervari managerRezervari;
    private int nrMnimDePersoane;
    public ProxyManager(ManagerRezervari managerRezervari, int nrMnimDePersoane) {

        this.managerRezervari = managerRezervari;
        this.nrMnimDePersoane= nrMnimDePersoane;
    }

    @Override
    public void rezerva(int nrPersoane) {
        if(nrPersoane >= this.nrMnimDePersoane){
            managerRezervari.rezerva(nrPersoane);
        }else{
            System.out.println("Rezervarea nu se poate realiza. Puteti veni fara rezervare!");
        }

    }
}
