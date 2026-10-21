
public class Torre implements Atacante {
    
    private final String local;

    @Override 
    public void atacar() {
        System.out.println("Torre" + local + "disparou");
    }
}
