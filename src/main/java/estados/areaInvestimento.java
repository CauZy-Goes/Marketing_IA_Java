package estados;

public abstract class areaInvestimento {

    protected Integer id;
    protected Integer retornoInvestimento;
    protected Float custoInvestimento;
    protected String nome;

    public areaInvestimento(Integer id, Integer retornoInvestimento, Float custoInvestimento) {
        this.id = id;
        this.retornoInvestimento = retornoInvestimento;
        this.custoInvestimento = custoInvestimento;
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
