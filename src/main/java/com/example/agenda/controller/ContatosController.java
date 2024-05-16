package com.example.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.agenda.entity.Contato;
import com.example.agenda.repository.ContatosRep;

@RestController
@RequestMapping("/")
public class ContatosController {
    
    @Autowired
    private ContatosRep acoes;

    @PostMapping("/adicionar")
    public Contato novoContato(@RequestBody Contato contato){
        return acoes.save(contato);
    }

    @GetMapping("/contatos")
    public List<Contato> listarContatos(){
        return acoes.findAll();
    }

    @PutMapping("/atualizar")
    public Contato atualizarContato(@RequestBody Contato contato){
        return acoes.save(contato);
    }

    @DeleteMapping("/ecluir/{id}")
    public void excluirContato(@PathVariable Long id){
        acoes.deleteById(id);
    }
    
}
