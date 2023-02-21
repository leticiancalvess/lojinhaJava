package br.com.lojinha.pojo;

public class ItensAdicionais {
    private int quantidadeItensAdicionais;
    private String nomeItensAdicionais;

    public int getQuantidadeItensAdicionais() {
        return this.quantidadeItensAdicionais;
    }
    public void setQuantidadeItensAdicionais(int novaQuantidade) {
        this.quantidadeItensAdicionais = novaQuantidade;
    }
    public String getnomeItensAdicionais() {
        return this.nomeItensAdicionais;
    }
    public void setnomeItensAdicionais(String novoNome) {
        this.nomeItensAdicionais = novoNome;
    }
}
