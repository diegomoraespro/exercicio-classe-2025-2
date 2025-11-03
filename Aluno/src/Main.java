public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João Silva", 12345, 80);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Nota 1: " + aluno1.getNota());

        int nota2 = 90;
        double media = aluno1.calcularMedia(nota2);

        System.out.println("Nota 2: " + nota2);
        System.out.println("Média calculada: " + media);

        aluno1.setNome("Maria Oliveira");
        aluno1.setMatricula(54321);
        aluno1.setNota(95);

        System.out.println("Novo Nome: " + aluno1.getNome());
        System.out.println("Nova Matrícula: " + aluno1.getMatricula());
        System.out.println("Nova Nota 1: " + aluno1.getNota());

    }
}