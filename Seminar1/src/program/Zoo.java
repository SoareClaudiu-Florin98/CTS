package program;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Zookeper zookeper ;
    private List<Animal> animale ;

    public Zoo()
    {
        this.animale = new ArrayList<>() ;
        this.zookeper = new Zookeper("Gigel") ;

    }

    public Zoo(Zookeper zookeper, List<Animal> animale) {
        this.zookeper = zookeper;
        this.animale = animale;
    }

    public void Add(Animal animal){

        this.animale.add(animal) ;
    }
    public void FeedAllAnimals(){
        for(Animal a: animale){
            zookeper.feed(a);
        }
    }

}
