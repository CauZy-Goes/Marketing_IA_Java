package estados;

public class site  extends areaInvestimento{
    public site(Integer id, Integer retornoInvestimento, Float custoInvestimento, Integer qtdInvestimento) {
        super(id, retornoInvestimento, custoInvestimento, qtdInvestimento);
        nome = "Site";
    }
}
