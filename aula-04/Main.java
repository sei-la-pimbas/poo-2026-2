
public class Main {

    public static void main(String[] args) {

        Personagem pistoleiro = new Personagem();

        pistoleiro.nome = "Arthur Morgan";
        pistoleiro.vida = 1;
        pistoleiro.forca = 8000;
        pistoleiro.nivel = 932563978;

        Personagem goblin = new Personagem();

        goblin.nome = "Gulozinho davi";
        goblin.vida = 9;
        goblin.forca = 0;
        goblin.nivel = 1;

        pistoleiro.exibirstatus();
    }
}