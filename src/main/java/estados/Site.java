package estados;

public class Site extends AreaInvestimento {
    public Site( Double retornoInvestimento, double custoInvestimento) {
        super( retornoInvestimento, custoInvestimento);
        nome = "Site";
    }
}
