public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Souza", "ana.souza@email.com", "123.456.789-00");

        cliente1.exibirDados();
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Nome: " + cliente1.getNome());

        cliente1.setEmail("ana.souza.nova@outlook.com");
        System.out.println("E-mail atualizado.");

        cliente1.setNome("Ana Carolina Souza");
        System.out.println("Nome atualizado.");

        cliente1.setCpf("00.987.654-32");
        System.out.println("CPF atualizado.");

        cliente1.exibirDados();
    }
}