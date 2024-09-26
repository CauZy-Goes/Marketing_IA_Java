package estados;

public class Tv extends AreaInvestimento {

    public Tv( Double retornoInvestimento, Double custoInvestimento, Integer qtdInvestimento, Double orcamento) {
        super( retornoInvestimento, custoInvestimento, qtdInvestimento,orcamento);
        nome = "Tv";
    }
}
