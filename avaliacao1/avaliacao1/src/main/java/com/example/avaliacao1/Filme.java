package com.example.avaliacao1;

public class Filme {

    private String nome;
    private String genero;
    private Integer classificacao;
    private Double valor;
    private Integer sala;

    public Filme(String nome, String genero, Integer classificacao, Double valor, Integer sala) {
        this.nome = nome;
        this.genero = genero;
        this.classificacao = classificacao;
        this.valor = valor;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getSala() {
        return sala;
    }

    @Override
    public String toString() {
        return "Filme: " +
                " | Nome: " + nome +
                " | Gênero: " + genero +
                " | Classificacao: " + classificacao + " anos"+
                " | Valor Ingresso: R$" + valor +
                " | Sala: n°" + sala + ";";
    }
}
