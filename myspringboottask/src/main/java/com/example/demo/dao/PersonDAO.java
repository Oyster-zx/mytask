/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Person;
import java.util.List;

/**
 *
 * @author george
 */
public interface PersonDAO {
    public Person getPerson(int id);
    public List<Person> getAllPersons();
    public void savePerson(Person person);
    public boolean exists(int id);
    public int countPersons();
    public void deletePerson(int id);
    public void deleteAllPersons();
}
