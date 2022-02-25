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
public class Agent extends Personne {
    
    private static int nbagent;
    
    public Agent(String nm, String prm)
    {
        super(nm, prm);
        nbagent++;
      
    }

    public static int getNbagent() {
        return nbagent;
    }  
    
}
