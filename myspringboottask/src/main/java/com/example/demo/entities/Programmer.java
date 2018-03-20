package com.example.demo.entities;
// Generated Mar 18, 2018 9:17:03 PM by Hibernate Tools 4.3.1

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Programmer generated by hbm2java
 */
@Entity
@Table(name = "programmer")
public class Programmer implements Serializable{

    private Set<Task> tasks;
    private Set<Commit> commits;
    private Person person;

    public Programmer() {

    }

    @Id
    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "person_id", foreignKey = @ForeignKey(name = "fk_programmer_person_id"))
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @OneToMany(mappedBy="programmer")
    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    @OneToMany(mappedBy = "programmer")
    public Set<Commit> getCommits() {
        return commits;
    }

    public void setCommits(Set<Commit> commits) {
        this.commits = commits;
    }
}
