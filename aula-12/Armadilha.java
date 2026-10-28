
public class Armadilha implements Atacante {
    private final String tipo;

    public Armadilha(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("tipo é obrigatório");
        }
        this.tipo = tipo;
    }

    @Override
    public void atacar() {
        System.out.println("Armadilha " + tipo + "disparou");
    }
}
