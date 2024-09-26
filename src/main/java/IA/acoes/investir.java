package IA.acoes;

import estados.areaInvestimento;

public class investir {

    public static areaInvestimento investir(areaInvestimento areaInvestimento) {
        areaInvestimento.setQtdInvestimento(areaInvestimento.getQtdInvestimento() + 1);
        estados.areaInvestimento.setOrcamento(estados.areaInvestimento.getOrcamento() - areaInvestimento.getCustoInvestimento());

        return areaInvestimento;
    }
}
