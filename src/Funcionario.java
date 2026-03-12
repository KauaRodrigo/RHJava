public abstract class Funcionario implements Relatorio {

    private String nome;
    private double  salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public double calcularSalarioFinal() {
        return salarioBase + calcularBonus() - calcularDesconto();
    }

    public abstract double calcularBonus();

    public abstract double calcularDesconto();

    public void mostrarRelatorio() {
        System.out.printf("""
                Nome: %s
                Salário base: R$ %.2f
                Bônus: R$ %.2f
                Desconto: R$ %.2f
                Salário final: R$ %.2f
                ------------------------------------------------
                %n""", getNome(), getSalarioBase(), calcularBonus(), calcularDesconto(), calcularSalarioFinal());
    }

}
