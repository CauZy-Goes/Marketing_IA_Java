package estados;

public class tv  extends areaInvestimento{

    public tv(Integer id, Integer retornoInvestimento, Double custoInvestimento, Integer qtdInvestimento, Double orcamento) {
        super(id, retornoInvestimento, custoInvestimento, qtdInvestimento,orcamento);
        nome = "Tv";
    }
}
