import java.util.ArrayList;

public class Empresa {

    final String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        for(Funcionario f : this.funcionarios) {
            System.out.printf("""
                    Nome: %s
                    ----------------------------------
                    %n""", f.getNome());
        }
    }

    public void mostrarFolhaPagamento() {
        double totalSalarios = 0f;

        for(Funcionario f : this.funcionarios) {
            f.mostrarRelatorio();
            totalSalarios += f.calcularSalarioFinal();
        }

        System.out.println("Total gasto: " + totalSalarios);
    }

}
