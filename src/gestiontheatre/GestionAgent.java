/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontheatre;
import java.util.*;

/**
 *
 * @author ilonaremy
 */

public class GestionAgent {
    
private ArrayList<Personne> listepersonne;
    private ArrayList<Spectacle> listespectacle;
    private ArrayList<Representation> listerepresentation;
    private ArrayList<Salle> listesalle;
    private ArrayList<Place> listeplace;
    private ArrayList<Reservation> listereservation;

    public GestionAgent()
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
        
        System.out.println("1- Créer une salle");
        System.out.println("2- Créer un spectacle");
        System.out.println("3- Modifier les dates d'un spectacle");
        System.out.println("4- Créer une représentation");
        System.out.println("5- Créer les catégories");
        System.out.println("6- Annuler une représentation");
        System.out.println("7- Afficher le montant des réservations pour un spectacle");
        System.out.println("8- Afficher le montant des réservations pour une réprésentation");
        n= Clavier.lireInt();
        
        switch(n)
        {
            case 1 : creerSalle();
            menu();
            break;
            
            case 2 : creerSpectacle();
            menu();
            break;
            
            case 3 : modifierdatespectacle();
            menu();
            break;
            
           /* case 4 : creerRepresentation();
            menu();
            break;
            
            case 5 : creerCategorie();
            menu();
            break;*/
            
            case 6 : annulerRepresentation();
            menu();
            break;
            
            case 7 : calculermontantspect();
            menu();
            break;

            case 8 : calculermontantrepre();
            menu();
            break;
           
            default : System.out.println("Erreur, veuillez réessayer");
        }
    }       
     
    public void creerSalle()
    {
        String nms, ads,v;
        int cap;
        Salle poss;
        
     System.out.println("Saisir le nom de la salle");
     nms=Clavier.lireString();
     
     System.out.println("Saisir l'adresse de la salle");
     ads=Clavier.lireString();
     
     System.out.println("Saisir la ville");
     v=Clavier.lireString();
     
     System.out.println("Saisir la capacité");
     cap=Clavier.lireInt();
     
     poss=new Salle(nms,ads,v,cap);
     listesalle.add(poss);
    }
    
    public void creerSpectacle()
    {
    String nmsp;
    Date dated, datef;
    int ad,md,jd;
    int af,mf,jf;
    Spectacle repr;
    
    System.out.println("Saisir le nom du spectable");
    nmsp=Clavier.lireString();
    System.out.println("Saisir l'année de début du spectable");
    ad=Clavier.lireInt();
    System.out.println("Saisir le mois de début du spectable");
    md=Clavier.lireInt();
    System.out.println("Saisir le jour de début du spectable");
    jd=Clavier.lireInt();
    System.out.println("Saisir l'année de fin du spectable");
    af=Clavier.lireInt();
    System.out.println("Saisir le mois de fin du spectable");
    mf=Clavier.lireInt();
    System.out.println("Saisir le jour de fin du spectable");
    jf=Clavier.lireInt();
    dated=new Date(ad-1900,md-1,jd);
    datef=new Date(af-1900,mf-1,jf);
    
    repr=new Spectacle(nmsp,dated,datef);
    listespectacle.add(repr);
    }
    
    public Spectacle rechercherSpectacle()
    {
        Spectacle repr, trouve = null;
        String nmsp;
        
        System.out.println("saisir le nom du spectacle");
        nmsp=Clavier.lireString();
        
        if(!listespectacle.isEmpty())  
    { int i;
    for (i=0; i<listespectacle.size();i++)
    { repr=listespectacle.get(i);
    if (repr.getNoms().trim().equalsIgnoreCase(nmsp))     
        return repr;
    }
    }
        return trouve;
    } 
    
    
    public void modifierdatespectacle()
    {
    String nmsp;
    int ad,md,jd,rep;
    Date dated;
    int i=0;
    Spectacle repr;
    System.out.println("Saisir le nom du spectacle");
    nmsp=Clavier.lireString();
    System.out.println("Saisir l'année de début du spectable");
    ad=Clavier.lireInt();
    System.out.println("Saisir le mois de début du spectable");
    md=Clavier.lireInt();
    System.out.println("Saisir le jour de début du spectable");
    jd=Clavier.lireInt();
    dated=new Date(ad-1900,md-1,jd);
    
    repr=rechercherSpectacle();
    System.out.println("Voulez vous modifier : 1- La date de début ou 2-La date de fin");
    rep=Clavier.lireInt();
    if (rep==1)
    {
    // à continuer    
    }
    }
    
    public void annulerRepresentation() // peut être besoin de créer un atrribut 'annule' dans la classe representation
    {
     Representation r;
     int ade,mde,jde;
     int nbrepresentation;
     Date datede;
     System.out.println("Saisir le numéro de représentation");
     nbrepresentation=Clavier.lireInt();
     System.out.println("Saisir l'année de début de la représentation");
     ade=Clavier.lireInt();
     System.out.println("Saisir le mois de début de la représentation");
     mde=Clavier.lireInt();
     System.out.println("Saisir le jour de début de la représentation");
     jde=Clavier.lireInt();
     datede=new Date(ade-1900,mde-1,jde);
    
     r=rechercherRepresentation(); //créer la méthode rechercherReprésentation (théo)
     int j=0;
     int i =0;
     String reponse;
     
     System.out.println("Voulez-vous annuler la représentation");
     reponse=Clavier.lireString();
     if (reponse.equals("o")|| (reponse.equals("O")))
     {
         ga.annulerepresentation(r); // à voir selon les différentes classes gestion que l'on va créer
         System.out.println("Donnez le numéro de représentation");
         nbrepresentation=Clavier.lireInt();
         r=rechercherRepresentation;
         System.out.println("La représentation est annulée");
     }
     else 
     {
         System.out.println("La représentation n'a pas été annulée");
     }
    }    
    
    
    public double calculermontantspect() //Ilo
    {
        
    }
           
    
    public double calculermontantrepre() //Théo
    {
        
    }
    
    
    
     public static void main(String[] args) {
        // TODO code application logic here
        GestionAgent a = new GestionAgent();
        a.menu();
    }
     
}
