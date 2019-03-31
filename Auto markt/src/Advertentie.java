import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Advertentie {

private double vraagprijs;
private String merk;
private String type;
private int kilometerstand;
private LocalDate bouwdatum;
private LocalDate aangeboden;
private ArrayList<Bod> biedingen;
private Verkoper verkoper;
private EnumBrandstof brandstof;
private boolean verkocht = false;

    public Advertentie(double vraagprijs, String merk, String type, int kilometerstand, LocalDate bouwdatum, Verkoper verkoper, EnumBrandstof brandstof) {
        this.vraagprijs = vraagprijs;
        this.merk = merk;
        this.type = type;
        this.kilometerstand = kilometerstand;
        this.bouwdatum = bouwdatum;
        this.aangeboden = LocalDate.now();
        this.verkoper = verkoper;
        this.brandstof = brandstof;

        biedingen = new ArrayList<>();
    }

    public Advertentie(){
    }

    public double getVraagprijs() {
        return vraagprijs;
    }

    public void setVraagprijs(double vraagprijs) {
        this.vraagprijs = vraagprijs;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getBouwdatum() {
        return bouwdatum;
    }

    public void setBouwdatum(LocalDate bouwdatum) {
        this.bouwdatum = bouwdatum;
    }

    public LocalDate getAangeboden() {
        return aangeboden;
    }

    public void setAangeboden(LocalDate aangeboden) {
        this.aangeboden = aangeboden;
    }

    public ArrayList getBiedingen() {
        return biedingen;
    }

    public void setBiedingen(ArrayList biedingen) {
        this.biedingen = biedingen;
    }

    public Verkoper getVerkoper() {
        return verkoper;
    }

    public void setVerkoper(Verkoper verkoper) {
        this.verkoper = verkoper;
    }

    public EnumBrandstof getBrandstof() {
        return brandstof;
    }

    public void setBrandstof(EnumBrandstof brandstof) {
        this.brandstof = brandstof;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public void setVerkocht()   {
        verkocht = true;
    }

    public void voegBodToe(Bod bod){
        biedingen.add(bod);
    }

    public Bod getHoogsteBod(){
        Bod hoogsteBod = new Bod();
        for (Bod bod : biedingen) {
            if(bod.getPrijs() > hoogsteBod.getPrijs()) {
                hoogsteBod = bod;
            }
        }
        return hoogsteBod;
    }
}
