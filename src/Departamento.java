import models.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public String getNome() {
        return this.nome;
    }

    public Departamento(String nome) {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do departamento é obrigatório.");
        }

        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if(funcionario == null) {
            throw new IllegalArgumentException("Funcionário não pode ser nulo");
        }

        this.funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        for(Funcionario f : this.funcionarios) {
            System.out.printf("Nome: %s (%s)%n", f.getNome(), f.getClass().getSimpleName());
        }
    }

    public double mostrarFolha() {
        double total = 0.0;

        for(Funcionario f : this.funcionarios) {
            f.mostrarRelatorio();
            total += f.calcularSalarioFinal();
        }

        System.out.println("Total departamento: " + total);
        return total;
    }

    public void getTotalSalarios() {
        double totalSalarios = 0.0;

        for(Funcionario f : this.funcionarios) {
            totalSalarios += f.calcularSalarioFinal();
        }

        System.out.printf("Total gasto: R$ %.2f%n", totalSalarios);
    }

}
