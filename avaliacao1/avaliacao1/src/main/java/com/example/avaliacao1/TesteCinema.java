package com.example.avaliacao1;

import java.util.Scanner;

public class TesteCinema {

    public static void main(String[] args) {

        String nomeFilme;
        Integer sala, desconto;
        Integer codigo;
        Integer qtdPessoas;
        Double valor =0.0;
        Boolean fim = false;

        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);

        Cinema cinema = new Cinema("GranFlix");
        Filme filme1 = new Filme("Harry Potter e a Pedra Filosofal", "Ficção, Fantasia e Aventura", 0, 12.5, 1);
        Filme filme2 = new Filme("Harry Potter e a Câmara Secreta", "Ficção, Fantasia e Aventura", 0, 12.5, 2);
        Filme filme3 = new Filme("Harry Potter e o Prisioneiro de Azkaban", "Ficção, Fantasia e Aventura", 0, 15.0, 3);
        Filme filme4 = new Filme("Harry Potter e o Cálice de Fogo", "Ficção, Fantasia e Aventura", 0, 15.0, 4);
        Filme filme5 = new Filme("Harry Potter e a Ordem da Fênix", "Ficção, Fantasia e Aventura", 0, 17.5,5);
        Filme filme6 = new Filme("Harry Potter e o Enigma do Príncipe", "Ficção, Fantasia e Aventura", 0, 17.5, 6);
        Filme filme7 = new Filme("Harry Potter e as Relíquias da Morte parte 1", "Ficção, Fantasia e Aventura", 12, 20.0, 7);
        Filme filme8 = new Filme("Harry Potter e as Relíquias da Morte parte 2", "Ficção, Fantasia e Aventura", 12, 20.0, 8);

        cinema.adicionaFilme(filme1);
        cinema.adicionaFilme(filme2);
        cinema.adicionaFilme(filme3);
        cinema.adicionaFilme(filme4);
        cinema.adicionaFilme(filme5);
        cinema.adicionaFilme(filme6);
        cinema.adicionaFilme(filme7);
        cinema.adicionaFilme(filme8);

        System.out.println("\n----------"+cinema.getNome()+"----------");

        while(!fim){

            System.out.println("\nEsses são os filmes em cartaz:\n");
            cinema.exibeFilmes();

            System.out.println("\nO que deseja?(Digite o código)" +
                    "\n\t1-Comprar ingresso inteiro" +
                    "\n\t2-Comprar meia entrada" +
                    "\n\t3-Comprar ingresso família" +
                    "\n\t4-Visualizar carrinho" +
                    "\n\t5-Finalizar");
            codigo = leitor.nextInt();

            switch (codigo){
                case 1:
                    System.out.println("Digite o nome do filme em cartaz.");
                    nomeFilme = leitor2.nextLine();
                    System.out.println("Digite o valor do ingresso.");
                    valor += leitor.nextDouble();
                    System.out.println("Digite a sala do filme.");
                    sala = leitor.nextInt();

                    Ingresso ticket = new Inteira(nomeFilme, valor, sala);
                    cinema.adicionarIngresso(ticket);
                    break;

                case 2:
                    System.out.println("Digite o nome do filme em cartaz.");
                    nomeFilme = leitor2.nextLine();
                    System.out.println("Digite o valor inteiro do ingresso.");
                    valor = leitor.nextDouble();
                    System.out.println("Digite a sala do filme.");
                    sala = leitor.nextInt();

                    Ingresso ticket2 = new MeiaEntrada(nomeFilme, valor, sala);
                    cinema.adicionarIngresso(ticket2);
                    break;

                case 3:
                    System.out.println("Digite o nome do filme em cartaz.");
                    nomeFilme = leitor2.nextLine();
                    System.out.println("Digite o valor inteiro do ingresso.");
                    valor = leitor.nextDouble();
                    System.out.println("Digite a sala do filme.");
                    sala = leitor.nextInt();
                    System.out.println("Digite o número de pessoas");
                    qtdPessoas = leitor.nextInt();

                    if(qtdPessoas > 2) {
                        if(qtdPessoas <=4){
                            desconto = 15;
                        } else if( qtdPessoas >4 && qtdPessoas <= 8){
                            desconto = 22;
                        }else{
                            desconto = 30;
                        }

                        Ingresso ticket3 = new Familia(nomeFilme, valor, sala, qtdPessoas, desconto);
                        cinema.adicionarIngresso(ticket3);

                    }else{
                        System.out.println("Não foi possível adicionar ingresso Família. Válido somente acima de 3 pessoas");
                    }
                    break;

                case 4:
                    cinema.exibeIngressos();
                    System.out.println("\nValor Total: R$"+String.format("%.2f", cinema.verCarrinho()));
                    break;

                case 5:
                    System.out.println("Encerrado");
                    fim = true;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }




    }
}
