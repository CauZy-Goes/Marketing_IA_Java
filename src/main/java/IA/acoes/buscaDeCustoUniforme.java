package IA.acoes;

import IA.funcoes.custoDoCaminho;
import IA.funcoes.heuristica;
import estados.areaInvestimento;

import java.util.List;

public class buscaDeCustoUniforme {

    public static areaInvestimento buscaDeCustoUniforme(List<areaInvestimento> listaDeAreas) {
        areaInvestimento areaInvestimentoComMaiorRRI = null;
        int maiorEstimativaDeRetorno = 0;
        int atualEstimativaDeRetorno = 0;

        for (areaInvestimento areaInvestimentoAtual : listaDeAreas) {
            if(areaInvestimentoAtual.getCustoInvestimento() <= areaInvestimento.getOrcamento()){
                atualEstimativaDeRetorno = custoDoCaminho.novaEstimativaDeRetorno(areaInvestimentoAtual.getQtdInvestimento(), areaInvestimentoAtual.getRetornoInvestimento());

                if (maiorEstimativaDeRetorno > heuristica.funcaoHeuristicaDeRRI(areaInvestimentoAtual.getCustoInvestimento(), atualEstimativaDeRetorno)){
                    maiorEstimativaDeRetorno = atualEstimativaDeRetorno;
                    areaInvestimentoComMaiorRRI = areaInvestimentoAtual;
                }
            }
        }
        return areaInvestimentoComMaiorRRI;
    }
}
