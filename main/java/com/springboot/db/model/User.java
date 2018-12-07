package com.springboot.db.model;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User  {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private  Integer id;
    @Column(name = "name")
    private  String name;
    @Column(name = "teamName")
    private  String teamName;
    @Column(name = "salary")
    private  Integer salary;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
