import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private final String nome;
    private final List<Departamento> departamentos = new ArrayList<>();

    public Empresa(String nome) {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome da empresa é obrigatório");
        }

        this.nome = nome;
    }

    public void adicionarDepartamento(Departamento departamento) {
        if(departamento == null) {
            throw new IllegalArgumentException("Departamento não pode ser nulo");
        }

        this.departamentos.add(departamento);
    }

    public void mostrarEmpresa() {
        System.out.println("======= EMPRESA ========");
        for (Departamento d : departamentos) {
            System.out.printf("Departamento: %s%n", d.getNome());
            d.listarFuncionarios();
        }
    }

    public void mostrarFolhaGeral() {
        double totalGeral = 0.0;
        System.out.println("======= FOLHA GERAL ========");

        for (Departamento d : departamentos) {
            System.out.printf("Departamento: %s%n", d.getNome());
            totalGeral += d.mostrarFolha();
        }

        System.out.println("TOTAL EMPRESA: R$ " + totalGeral);
    }

}
