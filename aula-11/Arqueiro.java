
public class Arqueiro extends Personagem {
     public Arqueiro(String nome) {
        super(nome);
     }

     @Override 
     public void atacar() {
        System.out.println(nome + " disparou uma flecha")
     }
}
