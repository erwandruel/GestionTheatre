/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontheatre;

/**
 *
 * @author Erwan
 */
public class Categorie {
    
    private String libelle;
    private double prix;
    private Salle possede;
    
    public Categorie(String lib, double prx, Salle poss)
    {
        libelle = lib;
        prix = prx;
        possede = poss;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getPrix() {
        return prix;
    }

    public Salle getPossede() {
        return possede;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setPossede(Salle possede) {
        this.possede = possede;
    }
    
}
