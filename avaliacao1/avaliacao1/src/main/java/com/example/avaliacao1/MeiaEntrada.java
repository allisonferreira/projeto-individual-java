package com.example.avaliacao1;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(String nomeFilme, Double valor, Integer sala) {
        super(nomeFilme, valor, sala);
    }

    @Override
    public Double calcularValor() {
        return getValor()/2;
    }


    @Override
    public String toString() {
        return "*MeiaEntrada* " + super.toString() +
                "Valor final: R$"+ calcularValor()+";";
    }
}
