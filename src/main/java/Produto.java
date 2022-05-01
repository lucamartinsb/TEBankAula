public class Produto {

    // Atributos //
    private String nome;
    private double valor;

    // Método construtor (Assim que o objeto é criado, ele define o nome e valor) //
    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    // Gets e Sets //
    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }

}
