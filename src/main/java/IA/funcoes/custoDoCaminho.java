package IA.funcoes;

public class custoDoCaminho {

    public static double novaEstimativaDeRetorno(int qtsInvestimento, double retornoInicial ) {
        double estimativaDeReducao = 0.05 * qtsInvestimento;

        double novoRetorno =  (retornoInicial * (1 - estimativaDeReducao));

        return novoRetorno;
    }
}
