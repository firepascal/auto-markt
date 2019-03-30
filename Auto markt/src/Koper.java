import java.util.ArrayList;

public class Koper extends Persoon{
    private ArrayList<Advertentie> advertenties;

    public Koper(String naam, String email) {
        super(naam, email);
        advertenties = new ArrayList();
    }

    public void zetBodOpAuto(Bod bod){
        bod.getAdvertentie().voegBodToe(bod);
    }

    public void voegFavorietToe(Advertentie advertentie){
        advertenties.add(advertentie);
    }

    public void verwijderFavoriet(Advertentie advertentie){
        advertenties.remove(advertentie);
    }
}
