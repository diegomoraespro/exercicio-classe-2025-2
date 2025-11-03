public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Helena Ferreira", "Analista de TI", 4000.00);

        System.out.println("Nome: " + func1.getNome());
        System.out.println("Cargo: " + func1.getCargo());
        System.out.printf("Salário Inicial: R$ %.2f%n", func1.getSalario());

        double percentual = 10.0;
        double novoSalario = func1.aumentarSalario(percentual);
        System.out.println("Percentual de Aumento: " + percentual + "%");
        System.out.printf("Novo Salário: R$ %.2f%n", novoSalario);

        func1.setCargo("Coordenadora de TI");
        System.out.println("Novo Cargo: " + func1.getCargo());
    }
}