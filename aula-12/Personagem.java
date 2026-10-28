
public abstract class Personagem implements Atacante {
    private final String nome;
    private int energia;
    
    public Personagem(String nome, int energiaInicial) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("nome é obrigatório")
        } 
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    protected final void consumirEnergia(int custo) throws SemEnergiaException {
        if (custo <= 0) {
            throw new IllegalArgumentException("custo do ataque tem que ser positivo");
        }
        if ()
    }

    public abstract void atacar();
}
