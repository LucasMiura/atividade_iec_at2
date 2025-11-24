package com.seunome.filmesapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeController {

    @GetMapping("/filme/favorito")
    public String filmeFavorito() {
        return "Meu filme favorito é Interestelar";
    }

    @GetMapping("/filme/lista")
    public String listaFilmes() {
        return "Filmes: Matrix, O Senhor dos Anéis, Avatar";
    }

    @GetMapping("/filme/ano")
    public String filmeAno() {
        return "O melhor filme de 2024 foi Duna 2";
    }
}
