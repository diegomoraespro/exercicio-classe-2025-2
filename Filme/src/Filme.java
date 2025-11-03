public class Filme {
    private String titulo;
    private String genero;
    private double duracao; // em minutos

    public Filme(String titulo, String genero, double duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void reproduzir(){
        System.out.println("Reproduzindo o filme: " + this.titulo);
    }
}
