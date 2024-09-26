package estados;

public class tv  extends areaInvestimento{

    public tv(Integer id, Integer retornoInvestimento, Float custoInvestimento, Integer qtdInvestimento) {
        super(id, retornoInvestimento, custoInvestimento, qtdInvestimento);
        nome = "Tv";
    }
}
