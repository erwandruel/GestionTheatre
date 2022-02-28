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
public class Salle {
    
    private String nom;
    private String adresse;
    private String ville;
    private int capacite;
    
    public Salle(String nm, String ad, String v, int cap)
    {
        nom = nm;
        adresse = ad;
        ville = v;
        capacite = cap;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public String getVille() {
        return ville;
    }
    
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse (String adresse) {
        this.adresse = adresse;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
    
}
