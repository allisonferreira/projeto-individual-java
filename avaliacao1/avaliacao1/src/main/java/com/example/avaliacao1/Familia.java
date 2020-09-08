package com.example.avaliacao1;

public class Familia extends Ingresso{

    private Integer qtdPessoas;

    public Familia(String nomefilme, Double valor, Integer sala, Integer qtdPessoas) {
        super(nomefilme, valor, sala);
        this.qtdPessoas = qtdPessoas;
    }

    @Override
    public Double calcularValor() {
        return getValor() * qtdPessoas * 0.8;
    }

    public Double getQtdPessoas() {
        return calcularValor();
    }



    @Override
    public String toString() {
        return "Familia{" + super.toString() +
                "qtdPessoas=" + qtdPessoas +
                "Valor total: " + calcularValor();
    }
}
