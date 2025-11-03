public class Livro {
    private String titulo;
    private String autor;
    private double numeroPaginas;

    public Livro(String tutulo, String autor, double numeroPaginas) {
        this.titulo = tutulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tutulo) {
        this.titulo = tutulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(double numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void abrirLivro(){
        System.out.println("O livro " + this.titulo + " foi aberto.");
    }
}
