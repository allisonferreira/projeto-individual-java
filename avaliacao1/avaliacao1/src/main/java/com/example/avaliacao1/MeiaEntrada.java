package com.example.avaliacao1;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(String nomefilme, Double valor, Integer sala) {
        super(nomefilme, valor, sala);
    }

    @Override
    public Double calcularValor() {
        return getValor()/2;
    }

    @Override
    public String toString() {
        return "MeiaEntrada{} " + super.toString() +
                "Valor total: "+ calcularValor();
    }
}
