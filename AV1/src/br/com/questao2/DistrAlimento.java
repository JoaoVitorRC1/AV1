package br.com.questao2;

public class DistrAlimento extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistrAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio,
                         String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto() {
        return getDataFim() == null;
    }

    @Override
    public String imprimeProjeto() {
        return "******************************" +
                "\nNome do Projeto: " + getNomeProjeto() +
                "\nDescricao do projeto: " + getDescricao() +
                "\nData início: " + getDataInicio() +
                "\nData fim: " + getDataFim() +
                "\nDescricao alimento: " + descAlimento +
                "\nQuantidade: " + qtde +
                "\n******************************";
    }
}
