/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Commit;
import java.util.List;

/**
 *
 * @author george
 */
public interface CommitDAO {
    public Commit getCommit(int id);
    public List<Commit> getAllCommits();
    public void saveCommit(Commit commit);
    public boolean exists(int id);
    public int countCommits();
    public void deleteCommit(int id);
    public void deleteAllCommits();
}
