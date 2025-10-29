package br.com.atv.projeto_ci_inicial_lucasgf.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Atividade1 {

    @GetMapping("/hello")
    public String hello() {
        return "Olá! Eu sou o Lucas Gomes, aluno do DSM 4.";
    }
}
