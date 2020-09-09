package com.example.avaliacao1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {

    List<Ingresso> lista = new ArrayList<>();
    List<Ingresso> lista2 = new ArrayList<>();
    List<Ingresso> lista3 = new ArrayList<>();


    @PostMapping("/inteira")
    public ResponseEntity adicionarIngresso(@RequestBody Inteira newIngresso){

        lista.add(newIngresso);
        return  ResponseEntity.status(201).build();
    }

    @PostMapping("/meia")
    public ResponseEntity adicionarIngresso(@RequestBody MeiaEntrada newIngressso){

        lista2.add(newIngressso);
        return  ResponseEntity.status(201).build();
    }

    @PostMapping("/familia")
    public ResponseEntity adicionarIngresso(@RequestBody Familia newIngressso){

        lista3.add(newIngressso);
        return  ResponseEntity.status(201).build();
    }

    @GetMapping("/inteira")
    public ResponseEntity getInteira(){
        if(lista.isEmpty()){
            return ResponseEntity.noContent().build();
            //return ResponseEntity.status(204).build();
        }else{
            return ResponseEntity.ok(lista);
            //return ResponseEntity.status(200).body(carros);
        }
    }

    @GetMapping("/meia")
    public ResponseEntity getMeia(){
        if(lista2.isEmpty()){
            return ResponseEntity.noContent().build();
            //return ResponseEntity.status(204).build();
        }else{
            return ResponseEntity.ok(lista2);
            //return ResponseEntity.status(200).body(carros);
        }

    }

    @GetMapping("/familia")
    public ResponseEntity getFamilia(){
        if(lista3.isEmpty()){
            return ResponseEntity.noContent().build();
            //return ResponseEntity.status(204).build();
        }else{
            return ResponseEntity.ok(lista3);
            //return ResponseEntity.status(200).body(carros);
        }

    }

    @DeleteMapping("/inteira/{id}")
    public ResponseEntity excluirInteira(@PathVariable int id) {
        if (lista.size() >= id) {
            return ResponseEntity.ok(lista.remove(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/meia/{id}")
    public ResponseEntity excluirMeia(@PathVariable int id) {
        if (lista2.size() >= id) {
            return ResponseEntity.ok(lista2.remove(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/familia/{id}")
    public ResponseEntity excluirFamilia(@PathVariable int id) {
        if (lista3.size() >= id) {
            return ResponseEntity.ok(lista3.remove(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    /*
    @GetMapping("/total")
    public String carrinho(){

        return "\nIngressos" +
                "\n\nInteira: "+ inteira+" ingresso(s)" +
                "\nMeia Entrada: "+ meia+" ingresso(s)"+
                "\nFamília: "+ familia+" ingresso(s)" +
                "\n\nO total é de: R$"+total;

    }
    */

}
