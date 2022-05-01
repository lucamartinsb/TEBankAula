import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarrinhoDeComprasTeste {
    @Test
    public void DeveCalcularTotalComDoisProdutos() {
        // Cenários de teste do carrinho de compras //
        Produto produto1 = new Produto("presunto", 10.0);
        Produto produto2 = new Produto("queijo", 30.0);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        // Ação //
        double resultado = carrinho.calcularValorTotalASerPago();
        // Verificação //
        Assertions.assertEquals(40, resultado);
    }
    @Test
    public void DeveCalcularValorTotalASerPagoQuandoOCarrinhoEstaVazio() {
        // Cenário //
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        // Ação //
        double resultado = carrinho.calcularValorTotalASerPago();
        // Verificação //
        Assertions.assertEquals(0, resultado);
    }
    @Test
    public void DeveCalcularValorTotalQuandoUmItemForCancelado() {
        // Cenários de teste do carrinho de compras //
        Produto produto1 = new Produto("presunto", 10.0);
        Produto produto2 = new Produto("queijo", 30.0);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        // Ação //
        double resultado = carrinho.calcularValorTotalASerPago();
        // Verificação //
        Assertions.assertEquals(40, resultado);
        // Ação //
        carrinho.removerProduto(produto1);
        double resultadoAposRemover = carrinho.calcularValorTotalASerPago();
        // Verificação //
        Assertions.assertEquals(30, resultadoAposRemover);
    }
}
