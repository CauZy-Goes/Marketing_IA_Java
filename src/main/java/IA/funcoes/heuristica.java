package IA.funcoes;

public class heuristica {

    public static double funcaoHeuristicaDeRRI(double investimento, int retorno){
        // calculo do RRI
        double RRI =  retorno/investimento;

        //calculo do do valor Heuristico
        double valorHeuristica = investimento/RRI;

        return valorHeuristica;
    }
}
