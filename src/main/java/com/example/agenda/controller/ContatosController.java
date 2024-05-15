package com.example.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.agenda.entity.Contato;
import com.example.agenda.repository.ContatosRep;

@RestController
@RequestMapping("/")
public class ContatosController {
    
    @Autowired
    private ContatosRep acoes;

    @GetMapping("/Contatos")
    public List<Contato> listarContatos(){
        return acoes.findAll();
    }
}
