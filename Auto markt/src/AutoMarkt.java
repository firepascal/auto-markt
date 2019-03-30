import java.time.LocalDate;
import java.util.ArrayList;

public class AutoMarkt {
    public ArrayList<Persoon> personen;
    public ArrayList<Advertentie> advertenties;


    public AutoMarkt() {
        personen = new ArrayList<>();
    }

    public void zetBodOpAuto(Advertentie advertentie, int prijs, Koper koper){

    }

    public void biedAutoAan(int prijs, String merk, String type, int kilometerstand, EnumBrandstof brandstof, LocalDate bouwdatum, LocalDate aanbodTijd, Verkoper verkoper) {

    }

    public void voegPersoonToe(Persoon persoon){
        if(personen != null)
            personen.add(persoon);
        else
            System.out.println("ArrayList not found!");
    }
}
