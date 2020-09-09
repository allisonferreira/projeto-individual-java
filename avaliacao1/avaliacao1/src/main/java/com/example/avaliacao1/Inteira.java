package com.example.avaliacao1;

public class Inteira extends Ingresso{

    public Inteira(String nomeFilme, Double valor, Integer sala) {
        super(nomeFilme, valor, sala);
    }

    @Override
    public Double calcularValor() {
        return getValor();
    }


    @Override
    public String toString() {
        return "*Inteira*\t" + super.toString() + " | Total: R$"+ calcularValor() + ";";
    }
}
