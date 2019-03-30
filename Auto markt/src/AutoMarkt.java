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
        koper.zetBodOpAuto(bod);
    }
}
