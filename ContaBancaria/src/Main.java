public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("4567-X", "Pedro Rocha", 500.00);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Conta: " + conta.getNumeroConta());

        double valorDeposito = 150.50;
        System.out.println("Tentando depositar: R$ " + valorDeposito);
        conta.depositar(valorDeposito);

        System.out.println("Tentando depositar valor negativo:");
        conta.depositar(-20.00);

        double valorSaque1 = 100.00;
        System.out.println("Tentando sacar: R$ " + valorSaque1);
        conta.sacar(valorSaque1);

        double valorSaque2 = 600.00; // Maior que o saldo atual (550.50)
        System.out.println("Tentando sacar: R$ " + valorSaque2);
        conta.sacar(valorSaque2);

        System.out.println("Tentando sacar valor negativo:");
        conta.sacar(-50.00);

        double saldoEsperado = 550.50;
        System.out.println("Tentando sacar o saldo restante (R$ " + saldoEsperado + "):");
        conta.sacar(saldoEsperado);

        System.out.println("Verificação se o saldo está zerado:");
        conta.sacar(0.01);
    }
}