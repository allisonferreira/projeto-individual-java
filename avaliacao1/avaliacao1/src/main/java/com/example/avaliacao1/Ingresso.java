package com.example.avaliacao1;

public abstract  class Ingresso {

    private String nomefilme;
    private Double valor;
    private Integer sala;

    public Ingresso(String nomefilme, Double valor, Integer sala) {
        this.nomefilme = nomefilme;
        this.valor = valor;
        this.sala = sala;
    }

    public abstract Double calcularValor();

    public String getNomefilme() {
        return nomefilme;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getSala() {
        return sala;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "nomefilme='" + nomefilme + '\'' +
                ", valor=" + valor +
                ", sala=" + sala +
                '}';
    }
}
