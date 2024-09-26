package IA.funcoes;

public class custoDoCaminho {

    public static int novaEstimativaDeRetorno(int qtsInvestimento, int retornoInicial ) {
        double estimativaDeReducao = 0.05 * qtsInvestimento;

        int novoRetorno = (int) (retornoInicial * (1 - estimativaDeReducao));

        return novoRetorno;
    }
}
