import models.Desenvolvedor;
import models.Diretor;
import models.Estagiario;
import models.Gerente;

public class Main {

    public static void main(String[] args) {
        Empresa ipm = new Empresa("IPM");
        Departamento fabrica = new Departamento("Fábrica");
        Departamento diretoria = new Departamento("Diretoria");

        ipm.adicionarDepartamento(diretoria);
        ipm.adicionarDepartamento(fabrica);

        Diretor aldo = new Diretor("Aldo", 20000);

        Desenvolvedor kaua    = new Desenvolvedor("Kauã", 4000);
        Desenvolvedor evandro = new Desenvolvedor("Evandro", 4500);

        Gerente diego   = new Gerente("Diego", 5000);
        Gerente kananda = new Gerente("Kananda", 6000);

        Estagiario ruan    = new Estagiario("Ruan", 1500);
        Estagiario matheus = new Estagiario("Matheus", 1800);

        diretoria.adicionarFuncionario(aldo);
        fabrica.adicionarFuncionario(kaua);
        fabrica.adicionarFuncionario(evandro);
        fabrica.adicionarFuncionario(diego);
        fabrica.adicionarFuncionario(kananda);
        fabrica.adicionarFuncionario(ruan);
        fabrica.adicionarFuncionario(matheus);

        fabrica.listarFuncionarios();
        fabrica.mostrarFolha();

        ipm.mostrarEmpresa();
        ipm.mostrarFolhaGeral();
    }

}
