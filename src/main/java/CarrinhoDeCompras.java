import java.util.ArrayList;

public class CarrinhoDeCompras {

    // Criar um Array de produtos, ou seja, uma vaiável, a ser instânciada pelo método construtor. //
    private ArrayList<Produto> produtos;

    // Assim que o carrinho de compras for criado, a lista de produtos é criada e é vazia. //
    public CarrinhoDeCompras() {
        produtos = new ArrayList<Produto>();
    }

    // Métodos para criar e apagar os produtos. //
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

}
