import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;


public class Bod implements Comparable<Bod> {
    private Advertentie advertentie;
    private Koper koper;
    private int prijs;
    private LocalDateTime aanbodTijd;
    private boolean geaccepteerd = false;

    public Bod(Advertentie advertentie, Koper koper, int prijs) {
        this.advertentie = advertentie;
        this.koper = koper;
        this.prijs = prijs;
        this.aanbodTijd = LocalDateTime.now();
    }

    public Bod(){
    }

    public Advertentie getAdvertentie() {
        return advertentie;
    }

    public void setAdvertentie(Advertentie advertentie) {
        this.advertentie = advertentie;
    }

    public Koper getKoper() {
        return koper;
    }

    public void setKoper(Koper koper) {
        this.koper = koper;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public LocalDateTime getAanbodTijd() {
        return aanbodTijd;
    }

    public void setAanbodTijd(LocalDateTime aanbodTijd) {
        this.aanbodTijd = aanbodTijd;
    }

    public boolean isGeaccepteerd() {
        return geaccepteerd;
    }

    public void setGeaccepteerd(boolean geaccepteerd) {
        this.geaccepteerd = geaccepteerd;
    }

    @Override
    public int compareTo(Bod o) {
        if(o.prijs > prijs)
            return 1;
        if(o.prijs < prijs)
            return -1;
        else
            return 0;
    }
}
