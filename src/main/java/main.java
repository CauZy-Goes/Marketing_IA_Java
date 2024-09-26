import IA.operacao;
import estados.AreaInvestimento;
import estados.RedesSociais;
import estados.Site;
import estados.Tv;

import java.util.ArrayList;
import java.util.List;

public class main {

public static void main(String[] args) {

    List<AreaInvestimento> listaDeAreasInvestimentos = new ArrayList<AreaInvestimento>();

    AreaInvestimento redesSociais = new RedesSociais(1400.00,1000.00,0, 3000.00);
    listaDeAreasInvestimentos.add(redesSociais);
    AreaInvestimento tv = new Tv(600.00,500.00,0, 3000.00);
    listaDeAreasInvestimentos.add(tv);
    AreaInvestimento site = new Site(500.00,20.00,0, 3000.00);
    listaDeAreasInvestimentos.add(site);

    AreaInvestimento estadoFinal = new AreaInvestimento(0.00);

    operacao.iniciarDistribuicao(listaDeAreasInvestimentos, estadoFinal);

    System.out.println("Relatório Final");
    System.out.println();
    for (AreaInvestimento areaInvestimento : listaDeAreasInvestimentos) {
        System.out.println(areaInvestimento);
    }

}
}
