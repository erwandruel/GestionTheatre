/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontheatre;
import java.util.*;

/**
 *
 * @author Erwan
 */
public class Spectacle {
    
    private static int nbspectacle;
    private String nom;
    private Date datedebut;
    private Date datefin;
    
    public Spectacle(String nm, Date dated, Date datef)
    {
        nbspectacle++;
        nom = nm;
        datedebut = dated;
        datefin = datef;
    }

    public static int getNbspectacle() {
        return nbspectacle;
    }

    public String getNom() {
        return nom;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }  
    
}
