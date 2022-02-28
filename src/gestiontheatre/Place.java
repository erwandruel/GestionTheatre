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
public class Place {
    
    private float prix;
    private Categorie emplacement;
    private Salle compose;
    private int nombre; 
    //Rajout de nb pour la méthode modifierreservation pour rajouter un nouveau nombre de place, mais ça ne fonctionne pas
    // Peut-être intégrer la classe Reservation ??? //
    
    public Place(float p, Categorie cat, Salle comp, int nb)
    {
        prix = p;
        emplacement = cat;
        compose = comp;
        nombre = nb;
    }

    public float getPrix() {
        return prix;
    }

    public Categorie getEmplacement() {
        return emplacement;
    }


    public Salle getCompose() {
        return compose;
    }

    public int getNombre() {
        return nombre;
    }

    
    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setEmplacement(Categorie emplacement) {
        this.emplacement = emplacement;
    }


    public void setCompose(Salle compose) {
        this.compose = compose;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
     
}
