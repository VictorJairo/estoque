class Produto {
    String nome;
    double preco;
    int quantidade;

    void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Estoque: " + quantidade + " unidades");
    }

    void realizarVenda(int quantidadeVendida) {
        if (quantidadeVendida > quantidade) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            quantidade -= quantidadeVendida;
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
        }
    }
}