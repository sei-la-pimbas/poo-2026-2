public class main {

    public static void main(String[] args) {

        Personagem mago = new Personagem();

        mago.nome = "Arthur Morgan";
        mago.vida = 1;
        mago.forca = 8000;
        mago.nivel = 932563978;

        Personagem monstro = new Personagem();

        monstro.nome = "gulozinho davi";
        monstro.vida = 9;
        monstro.forca = 0;
        monstro.nivel = 1;

        mago.exibirstatus();
    }
}