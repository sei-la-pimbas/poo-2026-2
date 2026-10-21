
public class Armadilha implements Personagem{
    private final String identificacao;

    public Armadilha(String identificacao) {
        this.identificacao = identificacao;
    }

    @Override 
    public void atacar() {
        System.out.println(identificacao + " ativou");
    }
}
