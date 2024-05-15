package com.example.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.agenda.entity.Contato;

public interface ContatosRep extends JpaRepository <Contato, Long>{
    
}
