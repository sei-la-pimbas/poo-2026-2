public class Personagem implements Atacante {
    private final String nome;
    private int energia;

    public Personagem(String nome, int energia) {
        if(nome == null || nome.isBlank()){
            throw new IllegalStateException("nome obrigatório");
        }
        if(energia < 0){
            throw new IllegalStateException("energia não pode ser negativo");
        }

        this.nome = nome;
        this.energia = energia;
    }
}