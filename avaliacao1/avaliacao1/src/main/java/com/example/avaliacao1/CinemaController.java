package com.example.avaliacao1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cinema")
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
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/meia")
    public ResponseEntity getMeia(){
        return ResponseEntity.ok(lista2);
    }

    @GetMapping("/familia")
    public ResponseEntity getFamilia(){
        return ResponseEntity.ok(lista3);
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


}
