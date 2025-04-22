public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Produto A");
        produto.setPreco(99.99);
        produto.setQuantidade(10);

        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}
