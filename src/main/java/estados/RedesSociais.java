package estados;

public class RedesSociais extends AreaInvestimento {
    public RedesSociais( Double retornoInvestimento, Double custoInvestimento, Integer qtdInvestimento, Double orcamento) {
        super( retornoInvestimento, custoInvestimento, qtdInvestimento, orcamento);
        nome = "RedesSociais";
    }
}
