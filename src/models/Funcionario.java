package models;

import interfaces.Relatorio;

public abstract class Funcionario implements Relatorio {

    private String nome;
    private double  salarioBase;

    public Funcionario(String nome, double salarioBase) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do funcionário não pode ser vazio.");
        }

        if (salarioBase < 0) {
            throw new IllegalArgumentException("Salário base não pode ser negativo.");
        }

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

    @Override
    public void mostrarRelatorio() {
        System.out.printf("""
                Cargo: %s
                Nome: %s
                Salário base: R$ %.2f
                Bônus: R$ %.2f
                Desconto: R$ %.2f
                Salário final: R$ %.2f
                ------------------------------------------------
                %n""", getClass().getSimpleName(), getNome(), getSalarioBase(), calcularBonus(), calcularDesconto(), calcularSalarioFinal());
    }

}
