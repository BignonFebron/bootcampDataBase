/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rosius
 */
@Entity
public class Media implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @NotNull(message = "Le champs name ne peut etre nul")
    @Column(name="name", length=45, nullable=false)
    private String name;

    @NotNull(message = "Le champs type ne peut etre nul")
    @Column(name="type", length=45, nullable=false)
    private String type;

    @NotNull(message = "Le champs lien ne peut etre nul")
    @Column(name="lien", nullable=false)
    private String lien;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the lien
     */
    public String getLien() {
        return lien;
    }

    /**
     * @param lien the lien to set
     */
    public void setLien(String lien) {
        this.lien = lien;
    }
    
}
