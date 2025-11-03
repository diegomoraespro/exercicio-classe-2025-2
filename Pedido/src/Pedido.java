public class Pedido {
    private int numero;
    private String data;
    private int valorTotal;

    public Pedido(int numero, String data, int valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double aplicarDesconto(double percentual){
        double desconto = this.valorTotal * (percentual / 100);
        this.valorTotal -= desconto;
        return this.valorTotal;
    }
}
