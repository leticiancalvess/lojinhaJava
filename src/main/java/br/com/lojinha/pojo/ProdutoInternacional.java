package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {
    private double impostoInternacional;
    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getimpostoInternacional() {
        return this.impostoInternacional;
    }
    public void setImpostoInternacional(double impostoInternacional) {
        this.impostoInternacional = impostoInternacional;

    }

    public void setValor(double novoValor) {
        if(novoValor > -100){
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100."); //argumento inválido.
        }

    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
