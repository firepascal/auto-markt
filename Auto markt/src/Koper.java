public class Koper extends Persoon{

    public Koper(String naam, String email) {
        super(naam, email);
    }

    public void zetBodOpAuto(Bod bod){
        bod.getAdvertentie().voegBodToe(bod);
    }
}
