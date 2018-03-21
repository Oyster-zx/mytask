/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Programmer;

/**
 *
 * @author george
 */
@RestController
public class DummyController {

    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping("/dummy")
    @Transactional
    public String dummy(@RequestParam("text") String text){
        
        Programmer programmer = new Programmer();
        programmer.getPerson().setName("Igor");
        programmer.getPerson().setSurname("Kuzevanov");
        entityManager.persist(programmer.getPerson());
        entityManager.persist(programmer);
        entityManager.flush();
        return text;
    }
}
