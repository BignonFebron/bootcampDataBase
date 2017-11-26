/**
 *
 * @Bignon
 */
package com.bootcamp.jpa.entities;

import com.bootcamp.jpa.entities.Projet;
import com.bootcamp.enums.TypeImpact;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "rest_impact")
public class Impact implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull(message="l'attribut nom doit etre renseigne")
    @Column(length = 30)
    private String nom;
    
    @NotNull(message="l'attribut type doit etre renseigne")
    private TypeImpact type;
    
    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinColumn(name = "projet_id", referencedColumnName = "id")
    private Projet projet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeImpact getType() {
        return type;
    }

    public void setType(TypeImpact type) {
        this.type = type;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }
}
