package models;

public class Diretor extends Gerente {

    public Diretor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double getBonusExtra() {
        return 1000;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.3;
    }

    @Override
    public double calcularDesconto() {
        return getSalarioBase() * 0.15;
    }
}
