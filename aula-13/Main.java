public class Main {
    public static void main(String[] args) {
       
        Inventario<Arma> arsenal = new Inventario<>();
        arsenal.guardar(new Arma("espada", 8));
        arsenal.guardar(new Arma("arco", 5));

        Inventario<Pocao> bolsa = Inventario<>();
        bolsa.guardar(new Pocao("cura", 10));


        Arma armaAtual = arsenal.pegar(0);
        Pocao pocaoAtual = bolsa.pegar(0);

        System.out.println("Arma: " + armaAtual.getNome());
        System.out.println("poção: " + pocaoAtual.getNome());
        System.out.println("Armas guardadas: " + arsenal.getNome());
    }
}
