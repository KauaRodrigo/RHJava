public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.1;
    }

    @Override
    public double calcularDesconto() {
        return getSalarioBase() * 0.08;
    }
}
