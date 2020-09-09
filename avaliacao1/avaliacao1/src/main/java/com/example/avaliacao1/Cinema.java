package com.example.avaliacao1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private String nome;

    public Cinema(String nome) {
        this.nome = nome;
    }

    private List<Ingresso> lista = new ArrayList<>();
    private List<Filme> filmes = new ArrayList<>();

    public Cinema() {
        //lista = new ArrayList<>();
       // filmes = new ArrayList<>();
    }

    public void adicionarIngresso(Ingresso i){
        lista.add(i);
    }

    public void exibeIngressos(){
        System.out.println("\nSeus ingressos:");
        for(Ingresso i: lista){
            System.out.println(i);
        }
    }

    public Double verCarrinho(){
        Double total=0.0;
        for (Ingresso i: lista){
            total += i.calcularValor();
        }
        return total;
    }

    public void adicionaFilme(Filme f){
        filmes.add(f);
    }

    public void exibeFilmes(){
        for(Filme f: filmes){
            System.out.println(f);
        }
    }

    public String getNome() {
        return nome;
    }

}
