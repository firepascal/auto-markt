public class Verkoper extends Persoon{
    private int nummer;
    private boolean zichtbaar;
    private String iban;

    public Verkoper(String naam, String email, int nummer, boolean zichtbaar, String iban) {
        super(naam, email);
        this.nummer = nummer;
        this.zichtbaar = zichtbaar;
        this.iban = iban;
    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public boolean isZichtbaar() {
        return zichtbaar;
    }

    public void setZichtbaar(boolean zichtbaar) {
        this.zichtbaar = zichtbaar;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
