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
    private Place differenciee;
    
    public Categorie(String lib, double prx, Place diff)
    {
        libelle = lib;
        prix = prx;
        differenciee = diff;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getPrix() {
        return prix;
    }

    public Place getDifferenciee() {
        return differenciee;
    }


    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDifferenciee(Place differenciee) {
        this.differenciee = differenciee;
    }

    boolean equalsIgnoreCase(String nm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
