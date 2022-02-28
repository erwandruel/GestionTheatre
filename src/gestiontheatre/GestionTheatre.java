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
        Personne p; Client c;
        
        System.out.println("Quel est l'ancien mot de passe ?");
        ancienmdp=Clavier.lireString();
        
        System.out.println("Quel est le nouveau mot de passe ?");
        nouveaumdp=Clavier.lireString();
        
        if(!nouveaumdp.equals(ancienmdp))
        {
            c.setMotdepasse(nouveaumdp);
            // Etant donné que le nouveau mot de passe n'est pas égal à l'ancien, alors on modifie le mot de passe. 
        }
        else
        {
            System.out.println("Votre mot de passe est identique à l'ancien, veuillez réessayer");
            menu();
        }
    }
    
    public void creerreservation()
    {
        String nom, adresse; Place liee;
        Reservation r; 
        String prm;
        int numero;
        
        System.out.println("Quel est le nom de la réservation ?");
        nom=Clavier.lireString();
        System.out.println("Quelle est l'adresse du client ?");
        adresse=Clavier.lireString();
        System.out.println("Quelle est le prénom du client ?");
        prm=Clavier.lireString();
        
        System.out.println(liee.getPrix());
        
        System.out.println("Saisir le numéro de la place à réserver");
        numero=Clavier.lireInt();
        
        listereservation.add(r);
        // Je ne sais pas comment intégrer le prix et la place 
    }  
    
    public void modifierreservation()
    {
        Reservation r; Place p; Personne P; Client c; 
        String ancienneresa, nouvelleresa;
        String nom;
        int rep; 
        int nb;
        
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
            rep=Clavier.lireInt();
            
            if(rep != nb) // Si le nouveau nombre de réservation est différent alors on modifie la réservation pour avoir le nouveau nombre de places
            {
                r.setLiee().setNombre(rep); //Modification du nombre de placé reservé dans la réservation
            }
        else
        {
            menu();
        }   
        
    }
    
    Reservation rechercherreservation(String adresse)
    {
        int i = 0; Reservation r, trouve = null;
        
        if(!listereservation.isEmpty())
        {
            while(i<listereservation.size() && trouve == null)
            {
                r=listereservation.get(i);
                if(r.getNom().equalsIgnoreCase(adresse))
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
   
              
public Representation rechercherrepresentation(String nom)
    { 
        Spectacle represente;
    
        Representation repre, trouve = null;
        int i=0;

        System.out.println("Saisissez le nom du spectacle à rechercher");
        nom=Clavier.lireString();

        if (!listerepresentation.isEmpty())
    {
        while (i<listerepresentation.size() && trouve == null)
        
    {
        repre=listerepresentation.get(i);
        if(repre.getRepresente().getNom().equalsIgnoreCase(nom))
    
        {
        trouve = repre;
        } 
    i++;
    }
}
return trouve;

}

public Representation afficherrepresentationspec() //Java Français :
        /*
        
        */
{
    
        Representation repre;
        Spectacle represente = null;
        int i=;
        String Spectacle;
        
    repre=rechercherrepresentation(String nom);
    
    if(repre!=null)
{
    System.out.println("Ce spectacle n'existe pas");
}
    else
    {
        if (!listerepresentation.isEmpty())
        {
            for (i=0;i<listerepresentation.size();i++)
        {
        repre=listerepresentation.get(i);

    if (represente.getRepresente().equalsIgnoreCase(repre))
    {
        System.out.println("Afficher la salle du spectacle".represente.getSalle());
        System.out.println("Afficher la ville du spectacle".represente.getVille());
        System.out.println("Afficher la categorie du spectacle".represente.getCategorie());
        System.out.println("Afficher le prix".represente.getLiee());
    }
}
i++;
}
}
return repre;
}

public Representation rechercherrepresentationville()
{ 
    Salle poss; Representation repre = null;
    String ville;
    int i=0;

System.out.println("Saisissez la ville");
ville=Clavier.lireString();

if (!listerepresentation.isEmpty())
{
    while ((i<=listerepresentation.size())&&(repre==null))
        
{
if (listerepresentation.get(i).getPossede().getVille().equalsIgnoreCase(ville))
    
{
    repre=listerepresentation.get(i);
}
i++;
}
}
return repre;
}



public Representation afficherrepresentationville() //Java Français : 
        /*
        
        */

{
Representation repre;
String adresse;
int i;
if(repre==null)
{
    System.out.println("Cette adresse n'existe pas");
}
else
{
if (!listerepresentation.isEmpty())
{
    for (i=0;i<listerepresentation.size();i++)
{
    repre=listerepresentation.get(i);

if (adresse.getAdresse()==repre)
{
    System.out.println("Afficher la salle du spectacle".represente.getSalle());
    System.out.println("Afficher la ville du spectacle".represente.getSpectacle());
    System.out.println("Afficher la categorie du spectacle".represente.getCategorie());
    System.out.println("Afficher le prix".represente.getLiee());
}
}
i++;
}
}
    
}
}
