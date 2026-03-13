public class Main {

    public static void main(String[] args) {
        Empresa ipm = new Empresa("IPM");

        Desenvolvedor kaua    = new Desenvolvedor("Kauã", 4000);
        Desenvolvedor evandro = new Desenvolvedor("Evandro", 4500);

        Gerente diego   = new Gerente("Diego", 5000);
        Gerente kananda = new Gerente("Kananda", 6000);

        Estagiario ruan    = new Estagiario("Ruan", 1500);
        Estagiario matheus = new Estagiario("Matheus", 1800);

        ipm.adicionarFuncionario(kaua);
        ipm.adicionarFuncionario(evandro);
        ipm.adicionarFuncionario(diego);
        ipm.adicionarFuncionario(kananda);
        ipm.adicionarFuncionario(ruan);
        ipm.adicionarFuncionario(matheus);

        ipm.listarFuncionarios();
        ipm.mostrarFolhaPagamento();
    }

}
