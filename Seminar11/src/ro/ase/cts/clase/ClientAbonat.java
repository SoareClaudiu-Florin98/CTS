package ro.ase.cts.clase;

public class ClientAbonat implements Observer{
    String numeClient ;
    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Clientul a receptionat mesajul "+mesaj);

    }

    public ClientAbonat(String numeClient) {
        this.numeClient = numeClient;
    }
}
