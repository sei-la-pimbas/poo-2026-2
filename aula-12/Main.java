public class Main{
    public static void main(String nome, int energia) {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("nome é obrigatório");
        }
        if (energia < 0) {
            throw new IllegalArgumentException("energia não pode ser menor que 0");
        }
        System.out.println("cadastro aceito: " + nome + ", energia: " + energia);

    }

    

    private static void tentar(int energia) {
        try {
            if (energia == 0) {
                throw new IllegalArgumentException();
            }
        } catch 

    
    }
}