package com.example.polls.model;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;

    public Role() {

    }

    public Role(RoleName name) {
        this.name = name;
    }

    

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return RoleName return the name
     */
    public RoleName getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(RoleName name) {
        this.name = name;
    }

}