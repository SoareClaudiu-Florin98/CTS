package ro.ase.cts.Facade.builder.program;

import ro.ase.cts.Facade.builder.clase.BuilderRezervare;
import ro.ase.cts.Facade.builder.clase.BuilderRezervareV2;
import ro.ase.cts.Facade.builder.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        BuilderRezervare builderRezervare = new BuilderRezervare().setCodRezervare(201)
        .setAreMancareInclusa(true).setAreMuzicaAmbientala(true).setGenMuzical("Rock");
        Rezervare rezervare1= builderRezervare.build() ;
        System.out.println(rezervare1.toString());

        Rezervare rezervare2 = new BuilderRezervare().setCodRezervare(202)
                .setAreScaunErgonomic(true).build() ;
        System.out.println(rezervare2.toString());

        BuilderRezervareV2 builderV2= new BuilderRezervareV2().setAreMancareInclusa(true)
                .setAreScaunErgonomic(true).setAreBauturiRacoritoareIncluse(true);
        Rezervare rez1 = builderV2.setCodRezervare(10).build() ;
        Rezervare rez2 = builderV2.setCodRezervare(11).build() ;
        System.out.println(rez1.toString());
        System.out.println(rez2.toString());

    }
}
