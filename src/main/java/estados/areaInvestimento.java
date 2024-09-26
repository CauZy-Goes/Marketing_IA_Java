package estados;

public abstract class areaInvestimento {
    private static Integer idSerial = 0;

    protected Integer id;
    protected Integer retornoInvestimento;
    protected Float custoInvestimento;
    protected String nome;
    protected Integer qtdInvestimento;

    public areaInvestimento(Integer id, Integer retornoInvestimento, Float custoInvestimento, Integer qtdInvestimento) {
        idSerial ++;
        this.id = idSerial;
        this.retornoInvestimento = retornoInvestimento;
        this.custoInvestimento = custoInvestimento;
        this.qtdInvestimento = qtdInvestimento;
    }

    public Integer getId() {
        return id;
    }

    public Float getCustoInvestimento() {
        return custoInvestimento;
    }

    public void setCustoInvestimento(Float custoInvestimento) {
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
