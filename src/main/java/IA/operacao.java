package IA;

import IA.acoes.buscaDeCustoUniforme;
import IA.acoes.investir;
import estados.areaInvestimento;

import java.util.List;

public class operacao {

    public static String iniciarDistribuicao(List<areaInvestimento> listaDeAreaInvestimento, areaInvestimento estadoFinal){

        Boolean sair = false;


        while(sair){
            areaInvestimento melhorArea = buscaDeCustoUniforme.buscaDeCustoUniforme(listaDeAreaInvestimento);
            investir.investir(melhorArea);
            sair = estadoFinal.equals(melhorArea);
        }

        return "Distribuicao finalizada";
    }
}
