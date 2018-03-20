/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Task;
import java.util.List;

/**
 *
 * @author george
 */
public interface TaskDAO {
    public Task getTask(int id);
    public List<Task> getAllTasks();
    public void saveTask(Task task);
    public boolean exists(int id);
    public int countTasks();
    public void deleteTask(int id);
    public void deleteAllTasks();
}
