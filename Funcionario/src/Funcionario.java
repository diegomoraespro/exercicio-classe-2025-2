public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        super(nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentarSalario(double percentual){
        double aumento = this.salario * (percentual / 100);
        this.salario += aumento;
        return this.salario;
    }
}
