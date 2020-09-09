package com.example.avaliacao1;

public abstract  class Ingresso {

    private String nomeFilme;
    private Double valor;
    private Integer sala;

    public Ingresso(String nomeFilme, Double valor, Integer sala) {
        this.nomeFilme = nomeFilme;
        this.valor = valor;
        this.sala = sala;
    }

    public abstract Double calcularValor();

    public String getNomefilme() {
        return nomeFilme;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getSala() {
        return sala;
    }

    @Override
    public String toString() {
        return "Nome do filme: " + nomeFilme +
                " | Valor ingresso: R$" + valor +
                " | Sala: n°" + sala;
    }
}
