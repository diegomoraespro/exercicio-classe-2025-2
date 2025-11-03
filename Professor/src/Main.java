public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Ricardo Almeida", "Estrutura de Dados", 40);

        System.out.println("Nome: " + prof1.getNome());
        System.out.println("Disciplina: " + prof1.getDisciplina());
        System.out.println("Carga Horária (horas): " + prof1.getCargaHoraria());

        prof1.darAula();
    }
}