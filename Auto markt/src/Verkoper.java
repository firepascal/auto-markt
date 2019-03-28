public class Verkoper {
    private String Naam;
    private String email;
    private int nummer;
    private boolean zichtbaar;
    private String iban;

    public Verkoper(String naam, String email, int nummer, boolean zichtbaar, String iban) {
        Naam = naam;
        this.email = email;
        this.nummer = nummer;
        this.zichtbaar = zichtbaar;
        this.iban = iban;
    }


    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public String getEmail() {
        return email;
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
