package com.example.avaliacao1;

public class Familia extends Ingresso{

    private Integer qtdPessoas, desconto;

    public Familia(String nomeFilme, Double valor, Integer sala, Integer qtdPessoas, Integer desconto) {
        super(nomeFilme, valor, sala);
        this.qtdPessoas = qtdPessoas;
        this.desconto = desconto;
    }

    @Override
    public Double calcularValor() {
        return getValor() * qtdPessoas * ((100-desconto)*0.01);
    }

    public Integer getQtdPessoas() {
        return qtdPessoas;
    }


    public Integer getDesconto() {
        return desconto;
    }

    @Override
    public String toString() {
        return "*Familia*" + super.toString() +
                " | Número de pessoas: " + qtdPessoas +
                " | Desconto: "+desconto+"%"+
                " | Valor final: R$" + calcularValor() + ";";
    }
}
