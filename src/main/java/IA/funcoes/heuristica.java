package IA.funcoes;

public class heuristica {

    public static double funcaoHeuristicaDeRRI(double investimento, double retorno){

        //calculo do do valor Heuristico
        double valorHeuristica = investimento/retorno;

        return valorHeuristica;
    }
}
