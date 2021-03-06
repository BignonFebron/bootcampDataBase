package com.bootcamp.jpa.entities;

import com.bootcamp.enums.EtatProjet;
import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;

@Entity
//@Table(name = "rest_projet")
public class Projet implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int idIndicateur;
    
    @NotNull(message="l'attribut nom doit etre renseigne")
    @Column(length = 30)
    private String nom;
    
    @NotNull(message="l'attribut reference doit etre renseigne")
    @Column(length = 50)
    private String reference;
    
    @NotNull(message="l'attribut Description doit etre renseigne")
    @Column(length = 255)
    private String description;
    
    @NotNull(message="l'attribut phaseActuelle doit etre renseigne")
    @Column(length = 50)
    private String phaseActuelle;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @NotNull(message="l'attribut dateDebutReelle doit etre renseigne")
    private Date dateDeDebutReelle;
    
    @NotNull(message="l'attribut dateFinReelle doit etre renseigne")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDeFinReelle;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @NotNull(message="l'attribut dateDebutPrevisionnelle doit etre renseigne")
    private Date dateDeDebutPrevisionnelle;
    
    @NotNull(message="l'attribut dateFinPrevisionnelle doit etre renseigne")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDeFinPrevisionnelle;
    
    @NotNull(message="l'attribut budgetPrevisionnel doit etre renseigne")
    @Column(scale =2 )
    private double budgetPrevisionnel;
    
    @NotNull(message="l'attribut coutReel doit etre renseigne")
    @Column(scale = 2)
    private double coutReel;
    
    private EtatProjet etat=EtatProjet.pre_etude ;
    
    private List<Integer> commentaires = new ArrayList<Integer>();
    
    private List<Integer> geographies = new ArrayList<Integer>();

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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhaseActuelle() {
        return phaseActuelle;
    }

    public void setPhaseActuelle(String phaseActuelle) {
        this.phaseActuelle = phaseActuelle;
    }

    public Date getDateDeDebutReelle() {
        return dateDeDebutReelle;
    }

    public void setDateDeDebutReelle(Date dateDeDebutReelle) {
        this.dateDeDebutReelle = dateDeDebutReelle;
    }

    public Date getDateDeFinReelle() {
        return dateDeFinReelle;
    }

    public void setDateDeFinReelle(Date dateDeFinReelle) {
        this.dateDeFinReelle = dateDeFinReelle;
    }

    public Date getDateDeDebutPrevisionnelle() {
        return dateDeDebutPrevisionnelle;
    }

    public void setDateDeDebutPrevisionnelle(Date dateDeDebutPrevisionnelle) {
        this.dateDeDebutPrevisionnelle = dateDeDebutPrevisionnelle;
    }

    public Date getDateDeFinPrevisionnelle() {
        return dateDeFinPrevisionnelle;
    }

    public void setDateDeFinPrevisionnelle(Date dateDeFinPrevisionnelle) {
        this.dateDeFinPrevisionnelle = dateDeFinPrevisionnelle;
    }

    public double getBudgetPrevisionnel() {
        return budgetPrevisionnel;
    }

    public void setBudgetPrevisionnel(double budgetPrevisionnel) {
        this.budgetPrevisionnel = budgetPrevisionnel;
    }

    public double getCoutReel() {
        return coutReel;
    }

    public void setCoutReel(double coutReel) {
        this.coutReel = coutReel;
    }

    public EtatProjet getEtat() {
        return etat;
    }

    public void setEtat(EtatProjet etat) {
        this.etat = etat;
    }

    public int getIdIndicateur() {
        return idIndicateur;
    }

    public void setIdIndicateur(int idIndicateur) {
        this.idIndicateur = idIndicateur;
    }

    /**
     * @return the commentaires
     */
    public List<Integer> getCommentaires() {
        return commentaires;
    }

    /**
     * @param commentaires the commentaires to set
     */
    public void setCommentaires(List<Integer> commentaires) {
        this.commentaires = commentaires;
    }

    /**
     * @return the geographies
     */
    public List<Integer> getGeographies() {
        return geographies;
    }

    /**
     * @param geographies the geographies to set
     */
    public void setGeographies(List<Integer> geographies) {
        this.geographies = geographies;
    }
}
