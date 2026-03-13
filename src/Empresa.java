import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private final String nome;
    private final List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome) {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome da empresa é obrigatório");
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
        System.out.println("Funcionários da Empresa: " + nome + ":");

        for(Funcionario f : this.funcionarios) {
            System.out.printf("""
                    Nome: %s
                    %n""", f.getNome());
        }
    }

    public void mostrarFolhaPagamento() {
        double totalSalarios = 0f;

        for(Funcionario f : this.funcionarios) {
            f.mostrarRelatorio();
            totalSalarios += f.calcularSalarioFinal();
        }

        System.out.printf("Total gasto: R$ %.2f%n", totalSalarios);
    }

}
