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
public class Representation {
    
    private static int n;
    private int nbrepresentation;
    private Date datedebut;
    private Date datefin;
    private Spectacle represente;
    private Salle possede;
    
    public Representation(Date datede, Date datefi, Spectacle repr, Salle poss)
    {
        n++;
        nbrepresentation=n;
        datedebut = datede;
        datefin = datefi;
        represente = repr;
        possede = poss;
    }

    public int getNbrepresentation()
    {
        return nbrepresentation;
    }
    public static int getN()
    {
        return n;
    }
    
    public Date getDatedebut() {
        return datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public Spectacle getRepresente() {
        return represente;
    }

    public Salle getPossede() {
        return possede;
    }
    
    
    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public void setRepresente(Spectacle represente) {
        this.represente = represente;
    }

    public void setPossede(Salle possede) {
        this.possede = possede;
    }
     
}
