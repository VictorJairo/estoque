import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        // Entrada de dados
        System.out.print("Nome do produto: ");
        p.nome = sc.nextLine();

        System.out.print("Preço: ");
        p.preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        p.quantidade = sc.nextInt();

        // Mostrar antes da venda
        System.out.println("\n--- Antes da venda ---");
        p.exibirDados();

        // Venda
        System.out.print("\nQuantidade vendida: ");
        int vendida = sc.nextInt();

        p.realizarVenda(vendida);

        // Mostrar depois
        System.out.println("\n--- Depois da venda ---");
        p.exibirDados();

        sc.close();
    }
}