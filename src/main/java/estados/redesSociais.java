package estados;

public class redesSociais extends areaInvestimento{
    public redesSociais(Integer id, Integer retornoInvestimento, Double custoInvestimento, Integer qtdInvestimento, Double orcamento) {
        super(id, retornoInvestimento, custoInvestimento, qtdInvestimento, orcamento);
        nome = "RedesSociais";
    }
}
