
public class Main {
    public static void main(String[] args) {

        Atacante primeiro = new Guerreiro("seila");
        Atacante segundo = new Armadilha("espinho");

        primeiro.atacar();
        segundo.atacar();

        System.out.println("============");

        Atacante[]  atacantes = {
            new Guerreiro("seila"),
            new Mago("patolino"),
            new Armadilha("espinhos")
        };

        for (Atacante item : atacantes) {
            item.atacar();
        }
    }
}
