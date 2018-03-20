package com.example.demo.entities;
// Generated Mar 18, 2018 9:17:03 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Programmer generated by hbm2java
 */
@Entity
@Table(name = "programmer",
         schema = "test"
)
public class Programmer implements java.io.Serializable {

    private int personId;
    private Person person;

    public Programmer() {
    }

    public Programmer(Person person) {
        this.person = person;
    }

    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "person"))
    @Id
    @GeneratedValue(generator = "generator")

    @Column(name = "person_id", unique = true, nullable = false)
    public int getPersonId() {
        return this.personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}