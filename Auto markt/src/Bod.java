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
}
