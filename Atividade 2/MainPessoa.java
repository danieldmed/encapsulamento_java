public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(-5);  // Tentando atribuir idade negativa
        pessoa.setIdade(25);  // Idade válida

        System.out.println("Idade: " + pessoa.getIdade());
    }
}