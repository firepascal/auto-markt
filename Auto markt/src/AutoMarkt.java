import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class AutoMarkt {
    public ArrayList<Persoon> personen;
    public HashMap<Verkoper, Advertentie> advertenties;

    public AutoMarkt() {
        personen = new ArrayList<>();
    }

    public void voegPersoonToe(Persoon persoon){
        if(personen != null)
            personen.add(persoon);
        else
            System.out.println("ArrayList not found!");
    }

    public void biedAutoAan(int prijs, String merk, String type, int kilometerstand, EnumBrandstof brandstof, LocalDate bouwdatum, Verkoper verkoper) {
        Advertentie advertentie = new Advertentie(prijs, merk, type, kilometerstand, bouwdatum, verkoper, brandstof);
        verkoper.getAdvertenties().add(advertentie);
        advertenties.put(verkoper, advertentie);
    }

    public void voegBodToe(Bod bod, Koper koper){
        if(bod.getAdvertentie().getHoogsteBod().getPrijs() > bod.getPrijs()) {
            koper.zetBodOpAuto(bod);
            //TODO stuur een bericht naar alle andere kopers met een lager bod dat een hogere prijs geboden is
        }
    }

    public void veranderAdvertentiePrijs(Advertentie advertentie, int prijs)    {
        advertentie.setVraagprijs(prijs);
    }
}
