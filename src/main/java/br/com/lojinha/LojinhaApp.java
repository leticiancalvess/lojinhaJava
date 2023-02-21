package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ItensAdicionais;
import br.com.lojinha.pojo.ProdutoNacional;
import br.com.lojinha.pojo.ProdutoInternacional;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class LojinhaApp  {
    public static void main(String[] args) {
       Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);

        meuProduto.setNome("Videogame");



        List<ItensAdicionais> itensInclusos = new ArrayList<>();
        ItensAdicionais meuitensAdicionais = new ItensAdicionais();
        meuitensAdicionais.setnomeItensAdicionais("Controle");
        meuitensAdicionais.setQuantidadeItensAdicionais(2);
        itensInclusos.add(meuitensAdicionais);
        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.PEQUENO);
        meuProdutoNacional.setImpostoNacional(5.2);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.GRANDE);
        meuProdutoInternacional.setImpostoInternacional(8.9);
        System.out.println(meuProdutoInternacional.getimpostoInternacional());



        meuProduto.setItensInclusos(itensInclusos);
       meuProduto.setValor(50);
       System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos().get(0).getnomeItensAdicionais());
        meuProdutoInternacional.setValor(-88);
        System.out.println(meuProdutoInternacional.getValor());
    for (ItensAdicionais itemAtual : meuProduto.getItensInclusos()) {
        System.out.println(itemAtual.getnomeItensAdicionais());
        System.out.println(itemAtual.getQuantidadeItensAdicionais());


    }
    }
}
