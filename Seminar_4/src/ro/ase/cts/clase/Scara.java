package ro.ase.cts.clase;

public class Scara {
    private String culoare ;
    private int nrTrepte ;
    private float cmLungime ;

    private static Scara scara = null ;

    public static synchronized Scara getInstance(){
        if(scara == null){
            synchronized (Scara.class){
                scara = new Scara() ;
            }
        }
        return scara ;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scara{");
        sb.append("culoare='").append(culoare).append('\'');
        sb.append(", nrTrepte=").append(nrTrepte);
        sb.append(", cmLungime=").append(cmLungime);
        sb.append('}');
        return sb.toString();
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNrTrepte() {
        return nrTrepte;
    }

    public void setNrTrepte(int nrTrepte) {
        this.nrTrepte = nrTrepte;
    }

    public float getCmLungime() {
        return cmLungime;
    }

    public void setCmLungime(float cmLungime) {
        this.cmLungime = cmLungime;
    }

    private Scara(String culoare, int nrTrepte, float cmLungime) {
        this.culoare = culoare;
        this.nrTrepte = nrTrepte;
        this.cmLungime = cmLungime;
    }

    private Scara() {
        culoare = "" ;
        nrTrepte = 0 ;
        cmLungime= 0.0f;
    }
}
