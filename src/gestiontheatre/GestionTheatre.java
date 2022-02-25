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
public class GestionTheatre {

    private ArrayList<Personne> listepersonne;
    private ArrayList<Spectacle> listespectacle;
    private ArrayList<Representation> listerepresentation;
    private ArrayList<Salle> listesalle;
    private ArrayList<Place> listeplace;
    private ArrayList<Reservation> listereservation;

    public GestionTheatre()
    {
       listepersonne = new ArrayList(); 
       listespectacle = new ArrayList(); 
       listerepresentation = new ArrayList(); 
       listesalle = new ArrayList(); 
       listeplace = new ArrayList(); 
       listereservation = new ArrayList();
    }
    
    public void menu()
    {
        int n;
        
        System.out.println("1- Créer client");
        System.out.println("2- Modifier mot de passe");
        System.out.println("3- Faire une réservation");
        System.out.println("4-Modifier une réservation");
        System.out.println("5- Afficher une réservation");
        System.out.println("6- Supprimer une réservation");
        n= Clavier.lireInt();
        
        switch(n)
        {
            case 1 : creerclient();
            menu();
            break;
            
            case 2 : modifiermdp();
            menu();
            break;
            
            case 3 : creerreservation();
            menu();
            break;
            
            case 4 : modifierreservation();
            menu();
            break;
            
            case 5 : afficherreservation();
            menu();
            break;
            
            case 6 : supprimerreservation();
            menu();
            break;
            
            default : System.out.println("Erreur, veuillez réessayer");
        }
                
    }
    
    public void creerclient()
    {
        String nom, prenom, login, mdp, adresse;
        Personne p; Client c;
        
        System.out.println("Quel est le nom du client ?");
        nom=Clavier.lireString();
        System.out.println("Quelle est le prénom du client ?");
        prenom=Clavier.lireString();
        System.out.println("Quel est le login du client ?");
        login=Clavier.lireString();
        System.out.println("Quel est le mot de passe ?");
        mdp=Clavier.lireString();
        System.out.println("Quelle est l'adresse du client ?");
        adresse=Clavier.lireString();
        c= new Client(nom, prenom, login, mdp, adresse);
        listepersonne.add(c);        
    }
    
    
    public void modifiermdp()
    {
        String ancienmdp, nouveaumdp;
        boolean b; Personne p; Client c;
        System.out.println("Quel est l'ancien mot de passe ?");
        ancienmdp=Clavier.lireString();
        
        System.out.println("Quel est le nouveau mot de passe ?");
        nouveaumdp=Clavier.lireString();
        
        if(!nouveaumdp.equals(ancienmdp))
        {
            c.setMotdepasse(nouveaumdp);
        }
        else
        {
            menu();
        }
    }
    
    public void creerreservation()
    {
        String nom, adresse;
        Reservation r; Place p;
        
        System.out.println("Quel est le nom de la réservation ?");
        nom=Clavier.lireString();
        System.out.println("Quelle est l'adresse du client ?");
        adresse=Clavier.lireString();
        System.out.println("Quelle est le prénom du client ?");
        System.out.println(p.getPrix());
        r=new Reservation(nom,adresse,liee);
        listereservation.add(r);
        //Il manque des choses dans Reservation donc méthode incomplète 
        //+ Je ne sais pas comment intégrer le prix et la place 
    }  
    
    public void modifierreservation()
    {
        String ancienneresa, nouvelleresa;
        String nom, rep;
        Personne P; Client c; 
        Reservation r; Place ;
        
        System.out.println("Quel est le nom de la réservation à modifier ?");
        nom=Clavier.lireString();
        r=rechercherreservation(nom);
        
        if(r!=null)
        {
            System.out.println(r.getNom());
        }
        else
        {
            creerreservation();
            r=listereservation.get(listereservation.size()-1);
        }
            System.out.println("Combien de places voulez-vous dans votre nouvelle réservation ?");
            rep=Clavier.lireString();
            
            if(!rep.equals(p))
        {
            r.setLiee(rep);
        }
        else
        {
            menu();
        }   
        
    }
    
    Reservation rechercherreservation(String nm)
    {
        int i = 0; Reservation r, trouve = null;
        
        if(!listereservation.isEmpty())
        {
            while(i<listereservation.size() && trouve == null)
            {
                r=listereservation.get(i);
                if(r.getNom().equalsIgnoreCase(nm))
                {
                    trouve= r;
                }
                i++;
            }
        }
        return trouve;
    }
    
    public void afficherreservation()
    {
        int i = 0;
        Reservation r;
        String nm;
        
        System.out.println("Nom de la réservation à afficher");
        nm=Clavier.lireString();
        
        if(!listereservation.isEmpty())
            while(i<listereservation.size())
            {
                r=listereservation.get(i);
            
            if(r.getLiee().getEmplacement().equalsIgnoreCase(nm))
            {
                System.out.println("Nom de la réservation");
                System.out.println(r.getNom());
                System.out.println("Adresse de la réservation");
                System.out.println(r.getAdresse());
            }
            i++;
        }
        
    }
    
    public void supprimerreservation()
    {
        String nm;
        Reservation r;
        
        System.out.println("Nom de la réservation à rechercher");
        nm=Clavier.lireString();
        r=rechercherreservation(nm);
        if (r != null)
        {
            listereservation.remove(r);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestionTheatre th = new GestionTheatre();
        th.menu();
    }
   
}
