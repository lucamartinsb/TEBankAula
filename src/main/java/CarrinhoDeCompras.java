import java.util.ArrayList;

public class CarrinhoDeCompras {

    // Criar uam variável, do tipo Array de produtos, a ser instânciada pelo método construtor. //
    private ArrayList<Produto> produtos;

    // Assim que o carrinho de compras for criado, a lista de produtos é criada e é vazia. //
    public CarrinhoDeCompras() {
        produtos = new ArrayList<Produto>();
    }

    // Métodos para criar, consultar o total e apagar os produtos. //
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }
    public double calcularValorTotalASerPago() {
        double total = 0;
        for (Produto produto: produtos) { // Para cada produto que está na lista produtos: //
            double valor = produto.getValor();
            total += valor;
        }
        return total;
    }
}
