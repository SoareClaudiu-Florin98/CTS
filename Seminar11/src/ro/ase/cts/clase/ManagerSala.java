package ro.ase.cts.clase;

public class ManagerSala extends  Subiect{
    private String numeSala ;

    public ManagerSala(String numeSala) {
        this.numeSala = numeSala;
    }
    public void anuntaMeci(String tipMeci){
        super.trimiteNotificare(this.numeSala+" va gazdui un meci de "+tipMeci);
    }
}
