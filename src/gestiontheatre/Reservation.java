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
public class Reservation {
    
    private static int nbreservation;
    private String nom;
    private String adresse;
    private Place liee;
    // Il manque sûrement plusieurs classes à intégrer ici tel que Client et/ou Prix mais vue qu'il y a place ça devrait être bon 
    //pour le prix je sais pas je comprend pas//

    public Reservation(String nm, String ad, Place liee)
    {
        nbreservation++;
        nom = nm;
        adresse = ad;
    }

    public static int getNbreservation() {
        return nbreservation;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public Place getLiee() {
        return liee;
    }

    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setLiee(Place liee) {
        this.liee = liee;
    }
    
     
}
