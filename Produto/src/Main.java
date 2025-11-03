public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Smart TV 50 polegadas", 2500.00, 2);

        System.out.println("Nome: " + produto1.getNome());
        System.out.printf("Preço Unitário: R$ %.2f%n", produto1.getPreco());
        System.out.println("Quantidade em Estoque: " + produto1.getQuantidade());

        double totalInicial = produto1.calcularTotal();
        System.out.printf("Valor Total (R$ 2500.00 x 2): R$ %.2f%n", totalInicial); // Esperado: 5000.00

    }
}