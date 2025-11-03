public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1001, "25/10/2025", 250);
        System.out.println("Número do Pedido: " + pedido1.getNumero());
        System.out.println("Data: " + pedido1.getData());
        System.out.printf("Valor Total Inicial: R$ %d%n", pedido1.getValorTotal());


        double percentualDesconto = 10.0;
        double valorAposDesconto = pedido1.aplicarDesconto(percentualDesconto);
        System.out.println("Desconto Aplicado: " + percentualDesconto + "%");
        System.out.printf("Novo Valor Total: R$ %.2f%n", valorAposDesconto);

    }
}