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
    private ArrayList<Categorie> listecategorie;

    public GestionAgent()
    {
       listepersonne = new ArrayList(); 
       listespectacle = new ArrayList(); 
       listerepresentation = new ArrayList(); 
       listesalle = new ArrayList(); 
       listeplace = new ArrayList(); 
       listereservation = new ArrayList();
       listecategorie = new ArrayList();
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
            
            case 4 : creerrepresentation();
            menu();
            break;
            
            case 5 : creercategorierepresentation();
            menu();
            break;
            
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
    if (repr.getNom().trim().equalsIgnoreCase(nmsp))     
        return repr;
    }
    }
        return trouve;
    } 
    
    
    public Spectacle modifierdatespectacle()
    {
    String nmsp;
    int ad,md,jd,rep;
    int af,mf,jf;
    Date dated, datef;
    int i=0;
    Spectacle repr;
    System.out.println("Saisir le nom du spectacle");
    nmsp=Clavier.lireString();
    repr=rechercherSpectacle();
    System.out.println("Voulez vous modifier : 1- La date de début ou 2-La date de fin ou 3-Les deux");
    rep=Clavier.lireInt();
    
    if (rep==1)
    {  
    System.out.println("La date de début actuelle est : " +repr.getDatedebut());
    System.out.println("Quelle est la nouvelle année de début ?");
                ad = Clavier.lireInt(); 
    System.out.println("Quel est le nouveau mois de début ?");
                md = Clavier.lireInt();
    System.out.println("Quel est le nouveau jour de début ?");
                jd = Clavier.lireInt(); 
    dated=new Date(ad-1900,md-1,jd);
                repr.getDatedebut();
                System.out.println("La nouvelle date de début du spectacle est : " + repr.getDatedebut());
              }
    if (rep==2)
    {  
    System.out.println("La date de fin actuelle est : " +repr.getDatefin());
    System.out.println("Quelle est la nouvelle année de fin ?");
                af = Clavier.lireInt(); 
    System.out.println("Quel est le nouveau mois de fin ?");
                mf = Clavier.lireInt();
    System.out.println("Quel est le nouveau jour de fin ?");
                jf = Clavier.lireInt(); 
    datef=new Date(af-1900,mf-1,jf);
                repr.getDatefin();
                System.out.println("La nouvelle date de fin du spectacle est : " + repr.getDatefin());
              }
    if (rep==3){
      System.out.println("La date de début actuelle est : " +repr.getDatedebut());
    System.out.println("Quelle est la nouvelle année de début ?");
                ad = Clavier.lireInt(); 
    System.out.println("Quel est le nouveau mois de début ?");
                md = Clavier.lireInt();
    System.out.println("Quel est le nouveau jour de début ?");
                jd = Clavier.lireInt(); 
    dated=new Date(ad-1900,md-1,jd);
                repr.getDatedebut();
                System.out.println("La nouvelle date de début du spectacle est : " + repr.getDatedebut()); 
    System.out.println("La date de fin actuelle est : " +repr.getDatefin());
    System.out.println("Quelle est la nouvelle année de fin ?");
                af = Clavier.lireInt(); 
    System.out.println("Quel est le nouveau mois de fin ?");
                mf = Clavier.lireInt();
    System.out.println("Quel est le nouveau jour de fin ?");
                jf = Clavier.lireInt(); 
    datef=new Date(af-1900,mf-1,jf);
                repr.getDatefin();
                System.out.println("La nouvelle date de fin du spectacle est : " + repr.getDatefin());            
    }
    return repr;
            }  
    
    
    public Representation rechercherrepresentation(int nbrepresentation)
    { 
    Representation repre, trouve = null;
    int i=0;

    System.out.println("Saisissez le numéro de représentation à rechercher");
    nbrepresentation=Clavier.lireInt();

    if (!listerepresentation.isEmpty())
    {
      while(i<listerepresentation.size()&& trouve == null)
        
    {
        repre=listerepresentation.get(i);
        if(repre.getNbrepresentation()== nbrepresentation)
    
    {
      trouve = repre;
    } 
    i++;
    }
    }
    return trouve;

    }
    
    
    public void annulerRepresentation() // peut être besoin de créer un attribut 'annule' dans la classe representation
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
    
     r=rechercherrepresentation(nbrepresentation); 
     int j=0;
     int i =0;
     String reponse;
     
     System.out.println("Voulez-vous annuler la représentation");
     reponse=Clavier.lireString();
     if (reponse.equals("o")|| (reponse.equals("O")))
     {
         System.out.println("Donnez le numéro de représentation");
         nbrepresentation=Clavier.lireInt();
         r=rechercherrepresentation(nbrepresentation);
         System.out.println("La représentation est annulée");
     }
     else 
     {
         System.out.println("La représentation n'a pas été annulée");
     }
    }    
    
    
    
    public double calculermontantspect() //Ilo
    {
    double mt=0;
    Reservation r;
    Spectacle repr;
    int j=0, i=0;
    String rep;
    if (repr.getListereservation().isEmpty()){
        while(j<repr.getListereservation().size()){
        repr=repr.getListereservation().get(i); 
        System.out.println("Quelle catégorie?:"); 
        rep=Clavier.lireString();
        while((i<v.getCla().size())){ // ici besoin d'une classe catégorie je pense
            cat=repr.getCat().get(i); // importer la catégorie dans la partie spectacle 
            if(r.getListereservation().contains(v) && cat.getLibelle().equalsIgnoreCase(rep)){
            mt=mt+(cat.getPrix()*r.getNbplaces()); // ajouter un nombre de place dans réservation poir pouvoir faire le calcul
            }
            i++;
        }
        j++;
    }           
    }       
    return mt;   
    /*
        Pour calculer le montant des réservations pour un spectacle, nous avons besoin :
        D’une variable montant de type double que nous initialiserons à 0
        De la classe réservation pour obtenir les informations sur les réservations comme le nombre de réservation
        De la classe spectacle pour pouvoir obtenir un spectacle donné
        De la classe place pour obtenir le prix diffère selon les catégories choisies
        Il faudra tout d’abord demander à l’agent de saisir le numéro de spectacle 
        pour pouvoir calculer le montant total des réservations associées à ce spectacle. 
        Ce numéro de spectacle sera recherché dans la liste des réservations. 
    
        Le système vérifie que le numéro de spectacle saisi est bien présent dans la liste de réservation avec un if. 
        S’il existe, le système demandera à l’agent de saisir la catégorie associée à chaque numéro de réservation. 
        Ensuite, il faut que le spectacle soit présent dans la liste du spectacle et qu’il soit associé à la catégorie saisie selon son libellé.

        Dans ce cas, nous pouvons calculer le montant qui sera égal au prix de la catégorie présent 
        dans la classe place multiplié par le nombre de places présent dans la classe réservation. 
        A la fin, la méthode nous retourne le montant associé pour le spectacle donné.
    */
    }
           
    
    public double calculermontantrepre() //Théo
    {
        
    }
    
    
    
     public static void main(String[] args) {
        // TODO code application logic here
        GestionAgent a = new GestionAgent();
        a.menu();
    }
     
     
         public Representation creerrepresentation()
{
    Representation repre;
    Salle poss; 
    Spectacle represente;
    Date dated,datef;


    int jd, md, ad; int jf, mf, af;
    String nom, adresse, ville; int capacite;
    String spec;

  
    System.out.println("Saisir la date de début jj puis mm puis aaaa ?");
                jd = Clavier.lireInt(); 
    System.out.println("Quel est le nouveau mois de début ?");
                md = Clavier.lireInt();
    System.out.println("Quel est l'année de début ?");
                ad = Clavier.lireInt(); 
    dated=new Date(ad-1900,md-1,jd);
    
    System.out.println("Saisir la date de fin jj puis mm puis aaaa ?");
                jf = Clavier.lireInt(); 
    System.out.println("Quel est le nouveau mois de fin ?");
                mf = Clavier.lireInt();
    System.out.println("Quel est l'année de fin ?");
                af = Clavier.lireInt(); 
    datef=new Date(af-1900,mf-1,jf);
    

    System.out.println("Saisir le nom de la salle ");
    nom=Clavier.lireString();
    
    System.out.println("Saisir l'adresse de la salle ");
    adresse=Clavier.lireString();
    
    System.out.println("Saisir la ville de la salle ");
    ville=Clavier.lireString();
    
    System.out.println("Saisir la capacité de la salle ");
    capacite=Clavier.lireInt();
    
    poss= new Salle(nom, adresse, ville, capacite);
    listesalle.add(poss); 
    
    System.out.println("A quel Spectacle est-elle reliée ?");
    spec=Clavier.lireString();
    spec=rechercherspectacle();
    // Il faut créer la méthode rechercherspectacle afin de reliée la représentation au spectacle

    repre= new Representation(dated, datef,spec, poss );
    // On ajoute la nouvelle representation qui possède une date de début, de fin, reliée à un spectable et à une salle défini
}
         
public Representation creercategorierepresentation()
    {
        String lib; double prx;
        Categorie c;
        Place diff = null;
   
            System.out.println("Quel est le libellé de la catégorie ?");
            lib=Clavier.lireString();
            System.out.println("Quelle est le prix de cette catégorie ?");
            prx=Clavier.lireDouble();

            c= new Categorie(lib, prx, diff); 
            listecategorie.add(c);     
    }
}
