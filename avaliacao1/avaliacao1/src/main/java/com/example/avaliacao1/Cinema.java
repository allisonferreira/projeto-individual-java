package com.example.avaliacao1;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Ingresso> lista;
    private List<Filme> filmes;

    public Cinema() {
        lista = new ArrayList<>();
        filmes = new ArrayList<>();
    }

    public void adicionarIngresso(Ingresso i){
        lista.add(i);
    }

    public void exibeIngressos(){
        for(Ingresso i: lista){
            System.out.println(i);
        }
    }

    public void excluiIngresso(Integer id){
        for(Ingresso i: lista){
            if(i.getNomefilme().equals(id)){
                lista.remove(id-1);
            }
        }
    }

}
