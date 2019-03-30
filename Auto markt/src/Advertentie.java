import java.time.LocalDate;
import java.util.ArrayList;

public class Advertentie {

private double vraagprijs;
private String merk;
private String type;
private int kilometerstand;
private LocalDate bouwdatum;
private LocalDate aangeboden;
private ArrayList biedingen;
private String verkoper;
private EnumBrandstof brandstof;
private ArrayList<Bod> boden;


    public Advertentie(double vraagprijs, String merk, String type, int kilometerstand, LocalDate bouwdatum, LocalDate aangeboden, ArrayList biedingen, String verkoper, EnumBrandstof brandstof) {
        this.vraagprijs = vraagprijs;
        this.merk = merk;
        this.type = type;
        this.bouwdatum = bouwdatum;
        this.aangeboden = aangeboden;
        this.biedingen = biedingen;
        this.verkoper = verkoper;
        this.brandstof = brandstof;
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

    public String getVerkoper() {
        return verkoper;
    }

    public void setVerkoper(String verkoper) {
        this.verkoper = verkoper;
    }

    public EnumBrandstof getBrandstof() {
        return brandstof;
    }

    public void setBrandstof(EnumBrandstof brandstof) {
        this.brandstof = brandstof;
    }

    public ArrayList<Bod> getBoden() {
        return boden;
    }

    public void setBoden(ArrayList<Bod> boden) {
        this.boden = boden;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }
}
