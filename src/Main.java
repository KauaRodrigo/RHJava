public class Main {

    public static void main(String[] args) {
        Empresa ipm = new Empresa("IPM");

        Desenvolvedor kaua    = new Desenvolvedor("Kauã", 3570);
        Desenvolvedor evandro = new Desenvolvedor("Evandro", 5700);

        Gerente diego   = new Gerente("Diego", 6000);
        Gerente kananda = new Gerente("Kananda", 12000);

        Estagiario ruan    = new Estagiario("Ruan", 2000);
        Estagiario matheus = new Estagiario("Matheus", 2000);

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
