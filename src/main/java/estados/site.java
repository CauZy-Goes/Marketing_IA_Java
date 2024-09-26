package estados;

public class site  extends areaInvestimento{
    public site(Integer id, Integer retornoInvestimento, double custoInvestimento, Integer qtdInvestimento, Double orcamento) {
        super(id, retornoInvestimento, custoInvestimento, qtdInvestimento, orcamento);
        nome = "Site";
    }
}
