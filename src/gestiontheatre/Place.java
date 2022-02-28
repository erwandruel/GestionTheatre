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
    private String categorie;
    private String emplacement;
    private Salle compose;
    private int nombre; //Rajout de nb pour la méthode modifierreservation pour rajouter un nouveau nombre de place, mais ça ne fonctionne pas
    // Peut-être intégrer la classe Reservation ??? //
    
    public Place(float p, String cat, String emp, Salle comp, int nb)
    {
        prix = p;
        categorie = cat;
        emplacement = emp;
        compose = comp;
        nombre = nb;
    }

    public float getPrix() {
        return prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getEmplacement() {
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

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public void setCompose(Salle compose) {
        this.compose = compose;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
     
}
