package com.example.avaliacao1;

public class Filme {

    private String nome;
    private String genero;
    private Integer classificacao;

    public Filme(String nome, String genero, Integer classificacao) {
        this.nome = nome;
        this.genero = genero;
        this.classificacao = classificacao;
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
}
