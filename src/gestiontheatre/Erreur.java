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
public class Erreur extends Exception {

    /**
     * Creates a new instance of <code>Erreur</code> without detail message.
     */
    public Erreur() {
    }

    /**
     * Constructs an instance of <code>Erreur</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public Erreur(String msg) {
        super(msg);
    }
}
