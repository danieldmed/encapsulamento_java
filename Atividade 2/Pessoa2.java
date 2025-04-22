public class Pessoa extends MainPessoa {
    private String nome;
    private int idade;
    private String cpf;

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade não pode ser negativa.");
        }
    }
}