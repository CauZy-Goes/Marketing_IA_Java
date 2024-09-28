import IA.funcoes.heuristica;
import IA.operacao;
import estados.AreaInvestimento;
import estados.RedesSociais;
import estados.Site;
import estados.Tv;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {

public static void main(String[] args) {

    Random random = new Random();

    double randomDoubleInvestimento;
    double randomDoubleRetorno;

    double min = 300.0;
    double max = 400.0;

    List<Integer> listaDeQtdInvestimentoArea1 = new ArrayList<Integer>();
    List<Integer> listaDeQtdInvestimentoArea2 = new ArrayList<Integer>();
    List<Integer> listaDeQtdInvestimentoArea3 = new ArrayList<Integer>();

    List<String> heuristicaArea1 = new ArrayList();
    List<String> heuristicaArea2 = new ArrayList();
    List<String> heuristicaArea3 = new ArrayList();

    System.out.println("QtdInvestimento| heuristica       |               retorno/custo       ");
    for (int i = 0; i < 100; i++) {
        System.out.println("A1   A2  A3  |  A1   A2    A3   |       A1               A2             A3");
        List<AreaInvestimento> listaDeAreasInvestimentos = new ArrayList<AreaInvestimento>();

        // Gera um número double entre 300 e 1000
        randomDoubleInvestimento = min + (max - min) * random.nextDouble();
        randomDoubleRetorno = min + (max - min) * random.nextDouble();

        AreaInvestimento redesSociais = new RedesSociais(randomDoubleRetorno,randomDoubleInvestimento);
        listaDeAreasInvestimentos.add(redesSociais);
        randomDoubleInvestimento = min + (max - min) * random.nextDouble();
        randomDoubleRetorno = min + (max - min) * random.nextDouble();

        AreaInvestimento tv = new Tv(randomDoubleRetorno,randomDoubleInvestimento);
        listaDeAreasInvestimentos.add(tv);
        randomDoubleInvestimento = min + (max - min) * random.nextDouble();
        randomDoubleRetorno = min + (max - min) * random.nextDouble();

        AreaInvestimento site = new Site(randomDoubleRetorno,randomDoubleInvestimento);
        listaDeAreasInvestimentos.add(site);

        AreaInvestimento.setOrcamento(3000.00);

        AreaInvestimento estadoFinal = new AreaInvestimento(0.00);

        StringBuilder sbRetornoECusto = new StringBuilder();
        for (AreaInvestimento areaInvestimento : listaDeAreasInvestimentos) {
            sbRetornoECusto.append(String.format("%.2f",areaInvestimento.getRetornoInvestimento()) + "/"+String.format("%.2f",areaInvestimento.getCustoInvestimento()) + "  ");

            if (areaInvestimento.getId() == 1){

            } else if (areaInvestimento.getId() == 2){

            } else if (areaInvestimento.getId() == 3){
            }
        }

        StringBuilder sbHeuristica = new StringBuilder();
        double heuristicaAreaAtual;
        for (AreaInvestimento areaInvestimento : listaDeAreasInvestimentos) {
            heuristicaAreaAtual = heuristica.funcaoHeuristicaDeRRI(areaInvestimento.getCustoInvestimento(), areaInvestimento.getRetornoInvestimento());
            sbHeuristica.append( String.format("%.2f",heuristicaAreaAtual) + "  ");
            if (areaInvestimento.getId() == 1){
                heuristicaArea1.add(String.format("%.2f",  heuristicaAreaAtual));
            } else if (areaInvestimento.getId() == 2){
                heuristicaArea2.add(String.format("%.2f",  heuristicaAreaAtual));
            } else if (areaInvestimento.getId() == 3){
                heuristicaArea3.add(String.format("%.2f",  heuristicaAreaAtual));
            }
        }

        operacao.iniciarDistribuicao(listaDeAreasInvestimentos, estadoFinal);

        StringBuilder sbQtdInvestimentos = new StringBuilder();
        for (AreaInvestimento areaInvestimento : listaDeAreasInvestimentos) {
            sbQtdInvestimentos.append(areaInvestimento.toString() + " ");
            if (areaInvestimento.getId() == 1){
                listaDeQtdInvestimentoArea1.add( areaInvestimento.getQtdInvestimento());
            } else if (areaInvestimento.getId() == 2){
                listaDeQtdInvestimentoArea2.add( areaInvestimento.getQtdInvestimento());
            } else if (areaInvestimento.getId() == 3){
                listaDeQtdInvestimentoArea3.add( areaInvestimento.getQtdInvestimento());
            }
        }

        System.out.println(sbQtdInvestimentos.toString() +" | " + sbHeuristica + " | " + sbRetornoECusto );
        System.out.println("");
        AreaInvestimento.setIdSerial(0);
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Area 1 quantidade de investimentos");
    System.out.println("");
    for ( int i = 0; i < listaDeQtdInvestimentoArea1.size(); i++){
        System.out.print(listaDeQtdInvestimentoArea1.get(i));
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Area 1 heuristicas");
    System.out.println("");
    for ( int i = 0; i < heuristicaArea1.size(); i++){
        System.out.print(heuristicaArea1.get(i) + " ");
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Area 2 quantidade de investimentos");
    System.out.println("");
    for ( int i = 0; i < listaDeQtdInvestimentoArea2.size(); i++){
        System.out.print(listaDeQtdInvestimentoArea2.get(i));
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Area 2 heuristicas");
    System.out.println("");
    for ( int i = 0; i < heuristicaArea2.size(); i++){
        System.out.print(heuristicaArea2.get(i) + " ");
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Area 3 quantidade de investimentos");
    System.out.println("");
    for ( int i = 0; i < listaDeQtdInvestimentoArea3.size(); i++){
        System.out.print(listaDeQtdInvestimentoArea3.get(i));
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Area 3 heuristicas");
    System.out.println("");
    for ( int i = 0; i < heuristicaArea3.size(); i++){
        System.out.print(heuristicaArea3.get(i) + " ");
    }
}
}
