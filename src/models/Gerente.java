package models;

import interfaces.Bonificavel;

public class Gerente extends Funcionario implements Bonificavel {

    @Override
    public double getBonusExtra() {
        return 500;
    }

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.2;
    }

    @Override
    public double calcularDesconto() {
        return getSalarioBase() * 0.1;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() - calcularDesconto() + calcularBonus() + getBonusExtra();
    }

    @Override
    public void mostrarRelatorio() {
        System.out.printf("""
                Cargo: %s
                Nome: %s
                Salário base: R$ %.2f
                Bônus: R$ %.2f
                Bônus Extra: R$ %.2f
                Desconto: R$ %.2f
                Salário final: R$ %.2f
                ------------------------------------------------
                %n""", getClass().getSimpleName(), getNome(), getSalarioBase(), calcularBonus(), getBonusExtra(), calcularDesconto(), calcularSalarioFinal());
    }

}
