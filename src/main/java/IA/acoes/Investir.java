package IA.acoes;

import estados.AreaInvestimento;

public class Investir {

    public static AreaInvestimento investir(AreaInvestimento areaInvestimento) {
        try {
            areaInvestimento.setQtdInvestimento(areaInvestimento.getQtdInvestimento() + 1);
            AreaInvestimento.setOrcamento(AreaInvestimento.getOrcamento() - areaInvestimento.getCustoInvestimento());
            return areaInvestimento;
        } catch (NullPointerException e){
            System.out.println("Não é possivel mais invertir");
            return null;
        }
    }
}
