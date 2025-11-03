public class Professor {
    private String nome;
    private String disciplina;
    private int cargaHoraria;

    public Professor(String nome, String disciplina, int cargaHoraria) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void darAula(){
        System.out.println("O professor " + this.nome + " está dando aula de " + this.disciplina);
    }
}
