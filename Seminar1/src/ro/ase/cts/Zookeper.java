package ro.ase.cts;

public class Zookeper {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zookeper(String name) {
        this.name = name;
    }
    public void feed(Animal animal){
        System.out.print(this.name+" feeds "+animal.getName()+"\n");
    }

}
