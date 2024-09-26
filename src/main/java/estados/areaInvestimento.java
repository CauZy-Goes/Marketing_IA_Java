package estados;

public abstract class areaInvestimento {
    private static Integer idSerial = 0;
    private static Double orcamento;

    protected Integer id;
    protected Integer retornoInvestimento;
    protected Double custoInvestimento;
    protected Integer qtdInvestimento;
    protected String nome;

    public areaInvestimento(Integer id, Integer retornoInvestimento, Double custoInvestimento, Integer qtdInvestimento, Double orcamento) {
        idSerial ++;
        this.id = idSerial;
        this.retornoInvestimento = retornoInvestimento;
        this.custoInvestimento = custoInvestimento;
        this.qtdInvestimento = qtdInvestimento;
        areaInvestimento.orcamento = orcamento;
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
