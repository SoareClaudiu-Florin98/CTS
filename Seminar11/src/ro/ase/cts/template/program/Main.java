package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.SpectatorNormal;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        SpectatorNormal spectator = new SpectatorNormal("Gigel") ;
        SpectatorVIP spectatorVIP = new SpectatorVIP("Becali",1) ;
        spectator.intraPeStadion();
        System.out.println("------------------");
        spectatorVIP.intraPeStadion();

    }
}
