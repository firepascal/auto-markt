import java.time.LocalDate;
import java.util.ArrayList;

public class Auto {

private double vraagprijs;
private String merk;
private String type;
private LocalDate bouwdatum;
private LocalDate aangeboden;
private ArrayList biedingen;
private String verkoper;


    public Auto(double vraagprijs, String merk, String type, LocalDate bouwdatum, LocalDate aangeboden, ArrayList biedingen, String verkoper) {
        this.vraagprijs = vraagprijs;
        this.merk = merk;
        this.type = type;
        this.bouwdatum = bouwdatum;
        this.aangeboden = aangeboden;
        this.biedingen = biedingen;
        this.verkoper = verkoper;
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
}
