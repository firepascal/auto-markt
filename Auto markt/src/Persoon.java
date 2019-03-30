public class Persoon {
    protected String naam;
    protected String email;

    public Persoon(String naam, String email)
    {
        this.naam = naam;
        this.email = email;
    }

    public String getEmail() {
        return email;
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
}
