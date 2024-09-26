package IA.acoes;

import estados.AreaInvestimento;

public class Investir {

    public static AreaInvestimento investir(AreaInvestimento areaInvestimento) {
        areaInvestimento.setQtdInvestimento(areaInvestimento.getQtdInvestimento() + 1);
        AreaInvestimento.setOrcamento(AreaInvestimento.getOrcamento() - areaInvestimento.getCustoInvestimento());
        return areaInvestimento;
    }
}
