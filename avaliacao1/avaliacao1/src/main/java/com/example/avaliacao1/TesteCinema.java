package com.example.avaliacao1;

public class TesteCinema {

    public static void main(String[] args) {


        Cinema cinema = new Cinema();
        Ingresso i1 = new Inteira("Viva, a vida é uma festa", 30.0, 10);
        Ingresso i2 = new MeiaEntrada("La la land", 28.0, 5);

        cinema.adicionarIngresso(i1);
        cinema.adicionarIngresso(i2);

        cinema.exibeIngressos();

    }
}
