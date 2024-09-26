package estados;

public abstract class areaInvestimento {
    private static Integer idSerial = 0;
    private static Double orcamento;

    protected Integer id;
    protected Integer retornoInvestimento;
    protected Double custoInvestimento;
    protected Integer qtdInvestimento;
    protected String nome;
    protected double orcamentoFinal;

    public areaInvestimento(Double orcamentoFinal) {
        this.orcamentoFinal = orcamentoFinal;
    }

    public areaInvestimento(Integer id, Integer retornoInvestimento, Double custoInvestimento, Integer qtdInvestimento, Double orcamento) {
        idSerial ++;
        this.id = idSerial;
        this.retornoInvestimento = retornoInvestimento;
        this.custoInvestimento = custoInvestimento;
        this.qtdInvestimento = qtdInvestimento;
        areaInvestimento.orcamento = orcamento;
        orcamentoFinal = 0;
    }

    public Boolean equals(areaInvestimento obj) {
        if(this.orcamentoFinal == obj.orcamentoFinal) {
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
        areaInvestimento.orcamento = orcamento;
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

    public Integer getRetornoInvestimento() {
        return retornoInvestimento;
    }

    public void setRetornoInvestimento(Integer retornoInvestimento) {
        this.retornoInvestimento = retornoInvestimento;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "areaInvestimento{" +
                "id=" + id +
                ", retornoInvestimento=" + retornoInvestimento +
                ", custoInvestimento=" + custoInvestimento +
                ", nome='" + nome + '\'' +
                '}';
    }
}
