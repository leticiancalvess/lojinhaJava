package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;
public class Produto {
   private String nome;
   private String marca;
   protected double valor;
   private List<ItensAdicionais> itensInclusos;
   private Tamanho tamanho;

    public Produto(String marcaInicial, Tamanho tamanhoInicial) {
       this.marca = marcaInicial;
       this.tamanho = tamanhoInicial;
    }

   public double getValor() {
      return this.valor;
   }
   public String getNome() {
      return this.nome;
   }
   public String getMarca() {
      return this.marca;
   }
   public  List<ItensAdicionais> getItensInclusos() {
      return this.itensInclusos;
   }
   public Tamanho getTamanho() {
      return this.tamanho;
   }

   public void setValor(double novoValor) {
      if(novoValor > 0){
         this.valor = novoValor;
      } else {
         throw new IllegalArgumentException("Valores devem ser maiores que 0."); //argumento inválido.
      }

      }
      public void setNome(String novoNome) {
         this.nome = novoNome;
      }
   public void setMarca(String novaMarca) {
      this.marca = novaMarca;

   }
   public void setItensInclusos( List<ItensAdicionais> novosItensInclusos) {
      this.itensInclusos = novosItensInclusos;
   }
   public void setTamanho(Tamanho novoTamannho) {
      this.tamanho = novoTamannho;
   }
}
