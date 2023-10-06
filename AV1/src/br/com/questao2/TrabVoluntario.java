package br.com.questao2;

public class TrabVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio,
                          String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto() {
        return duracaoTrabalho >= 2;
    }

    @Override
    public String imprimeProjeto() {
        return "\n******************************" +
                "\nNome do projeto: " + getNomeProjeto() +
                "\nDescricao: " + getDescricao() +
                "\nData inicio: " + getDataInicio() +
                "\nData fim: " + getDataFim() +
                "\nTipo trabalho: " + tipoTrabalho +
                "\nDuracao trabalho: " + duracaoTrabalho +
                "\n******************************";
    }
}
