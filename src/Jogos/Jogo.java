/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogos;

/**
 *
 * @author Edutec
 */
public class Jogo {
    String nome;
    Double preco;
    String genero;
    String produtora;
    
    public Jogo(String nome, Double preco, String genero, String produtora) {
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
        this.produtora = produtora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
    

      public String retornaDados() {
      return this.getNome() + this.getPreco() + this.getGenero() + this.getProdutora();
    }
      
    public void AlteraNome(String nome) {
        this.setNome(nome);
    }
      
    
}
