package ro.ase.cts.Flyweight.clase;


import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,FlyweightAbstract> clienti ;

    public FlyweightFactory() {
        this.clienti = new HashMap<>();
    }

    public FlyweightAbstract getClienti(String nrTelefon){
        FlyweightAbstract client=  this.clienti.get(nrTelefon) ;
        if(client == null){
            client= new Client("Gigel","3232323232","fdsfsd@yahoo.com");
            this.clienti.put(nrTelefon,client) ;
        }
        return client ;
    }
}
