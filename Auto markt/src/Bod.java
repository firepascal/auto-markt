import java.time.LocalDateTime;



public class Bod {
    private Advertentie advertentie;
    private Koper koper;
    private int prijs;
    private LocalDateTime aanbodTijd;
    private boolean geaccepteerd = false;

    public Bod(Advertentie advertentie, Koper koper, int prijs, LocalDateTime aanbodTijd) {
        this.advertentie = advertentie;
        this.koper = koper;
        this.prijs = prijs;
        this.aanbodTijd = aanbodTijd;
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
}
