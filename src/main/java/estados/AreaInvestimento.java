package estados;

public class AreaInvestimento {
    private static Integer idSerial = 0;
    private static Double orcamento;

    protected Integer id;
    protected Double retornoInvestimento;
    protected Double custoInvestimento;
    protected Integer qtdInvestimento;
    protected String nome;
    protected double orcamentoFinal;

    public AreaInvestimento(Double orcamentoFinal) {
        this.orcamentoFinal = orcamentoFinal;
    }

    public AreaInvestimento(Double retornoInvestimento, Double custoInvestimento) {
        idSerial ++;
        this.id = idSerial;
        this.retornoInvestimento = retornoInvestimento;
        this.custoInvestimento = custoInvestimento;
        setQtdInvestimento(0);
        orcamentoFinal = 0;
    }

    public Boolean equals(AreaInvestimento obj) {
        if(this.orcamentoFinal == obj. getOrcamento()) {
            return true;
        }
        return false;
    }

    public Integer getQtdInvestimento() {
        return qtdInvestimento;
    }

    public void setQtdInvestimento(Integer qtdInvestimento) {
        this.qtdInvestimento = qtdInvestimento;
    }

    public static Double getOrcamento() {
        return orcamento;
    }

    public static void setOrcamento(Double orcamento) {
        AreaInvestimento.orcamento = orcamento;
    }

    public Integer getId() {
        return id;
    }

    public Double getCustoInvestimento() {
        return custoInvestimento;
    }

    public void setCustoInvestimento(Double custoInvestimento) {
        this.custoInvestimento = custoInvestimento;
    }

    public Double getRetornoInvestimento() {
        return retornoInvestimento;
    }

    public void setRetornoInvestimento(Double retornoInvestimento) {
        this.retornoInvestimento = retornoInvestimento;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Área : " + nome + ", Id = " + id + ", Retorno Do Investimento = " + retornoInvestimento +
                ", Quantidade De Investimentos = " + qtdInvestimento;
    }
}
