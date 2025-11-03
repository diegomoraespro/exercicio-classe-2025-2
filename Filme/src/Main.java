public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Interestelar", "Ficção Científica", 169.0);

        filme1.reproduzir();

        System.out.println("Título: " + filme1.getTitulo());
        System.out.println("Gênero: " + filme1.getGenero());
        System.out.println("Duração (minutos): " + filme1.getDuracao());

        filme1.setDuracao(150.0);
        System.out.println("Duração atualizada para: " + filme1.getDuracao() + " minutos.");

    }
}