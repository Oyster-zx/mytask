/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Programmer;
import java.util.List;

/**
 *
 * @author george
 */
public interface ProgrammerDAO {
    public Programmer getProgrammer(int id);
    public List<Programmer> getAllProgrammers();
    public void saveProgrammer(Programmer programmer);
    public boolean exists(int id);
    public int countProgrammers();
    public void deleteProgrammer(int id);
    public void deleteAllProgrammers();
}
