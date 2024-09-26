package estados;

public class Site extends AreaInvestimento {
    public Site( Double retornoInvestimento, double custoInvestimento, Integer qtdInvestimento, Double orcamento) {
        super( retornoInvestimento, custoInvestimento, qtdInvestimento, orcamento);
        nome = "Site";
    }
}
