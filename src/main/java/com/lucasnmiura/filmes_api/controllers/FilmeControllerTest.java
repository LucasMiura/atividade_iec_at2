package com.seunome.filmesapi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class FilmeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testFilmeFavorito() throws Exception {
        mockMvc.perform(get("/filme/favorito"))
                .andExpect(status().isOk())
                .andExpect(content().string("Meu filme favorito é Interestelar"));
    }

    @Test
    void testListaFilmes() throws Exception {
        mockMvc.perform(get("/filme/lista"))
                .andExpect(status().isOk())
                .andExpect(content().string("Filmes: Matrix, O Senhor dos Anéis, Avatar"));
    }

    @Test
    void testFilmeAno() throws Exception {
        mockMvc.perform(get("/filme/ano"))
                .andExpect(status().isOk())
                .andExpect(content().string("O melhor filme de 2024 foi Duna 2"));
    }
}
