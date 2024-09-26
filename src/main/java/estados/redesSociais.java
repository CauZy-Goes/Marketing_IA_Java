package estados;

public class redesSociais extends areaInvestimento{
    public redesSociais(Integer id, Integer retornoInvestimento, Float custoInvestimento, Integer qtdInvestimento) {
        super(id, retornoInvestimento, custoInvestimento, qtdInvestimento);
        nome = "RedesSociais";
    }
}
