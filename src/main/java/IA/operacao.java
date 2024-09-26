package IA;

import IA.acoes.buscaDeCustoUniforme;
import IA.acoes.Investir;
import estados.AreaInvestimento;

import java.util.List;

public class operacao {

    public static String iniciarDistribuicao(List<AreaInvestimento> listaDeAreaInvestimento, AreaInvestimento estadoFinal){

        Boolean sair = false;


        while(!sair){
            AreaInvestimento melhorArea = buscaDeCustoUniforme.buscaDeCustoUniforme(listaDeAreaInvestimento);
            Investir.investir(melhorArea);
            System.out.println(melhorArea);
            System.out.println();
            System.out.println("Orcamento Restante : " + AreaInvestimento.getOrcamento());
            System.out.println();
            sair = estadoFinal.equals(melhorArea);
        }

        return "Distribuicao finalizada";
    }
}
