package IA.acoes;

import IA.funcoes.custoDoCaminho;
import IA.funcoes.heuristica;
import estados.AreaInvestimento;

import java.util.List;

public class buscaDeCustoUniforme {

    public static AreaInvestimento buscaDeCustoUniforme(List<AreaInvestimento> listaDeAreas) {
        AreaInvestimento areaInvestimentoComMaiorRRI = null;
        double melhorHeuristica = 1000000000.00;
        double heuristicAtual  = 0;
        double atualEstimativaDeRetorno = 0;

        for (AreaInvestimento areaInvestimentoAtual : listaDeAreas) {
            System.out.println();
            if(areaInvestimentoAtual.getCustoInvestimento() <= AreaInvestimento.getOrcamento()){
                atualEstimativaDeRetorno = custoDoCaminho.novaEstimativaDeRetorno(areaInvestimentoAtual.getQtdInvestimento(), areaInvestimentoAtual.getRetornoInvestimento());
                heuristicAtual = heuristica.funcaoHeuristicaDeRRI(areaInvestimentoAtual.getCustoInvestimento(), atualEstimativaDeRetorno);
                System.out.println("Melhor heuristica : " + String.format("%.2f", melhorHeuristica)) ;
                System.out.println("Heuristica Atual : " + String.format("%.2f", heuristicAtual)) ;
                System.out.println("Atual Estimativa De Retorno : " + String.format("%.2f", atualEstimativaDeRetorno)) ;
                if (melhorHeuristica > heuristicAtual){
                    melhorHeuristica = heuristicAtual;
                    areaInvestimentoComMaiorRRI = areaInvestimentoAtual;
                    System.out.println("A maior heuristica passa a ser : "+String.format("%.2f",melhorHeuristica));
                }
            }
        }
        System.out.println();
        return areaInvestimentoComMaiorRRI;
    }
}
