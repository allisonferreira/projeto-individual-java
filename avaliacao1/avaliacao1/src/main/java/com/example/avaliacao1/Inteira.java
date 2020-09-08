package com.example.avaliacao1;

public class Inteira extends Ingresso{

    public Inteira(String nomefilme, Double valor, Integer sala) {
        super(nomefilme, valor, sala);
    }

    @Override
    public Double calcularValor() {
        return getValor();
    }



    @Override
    public String toString() {
        return "Inteira{} " + super.toString();
    }
}
