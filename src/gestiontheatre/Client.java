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
public class Client extends Personne {
    
    private String login;
    private String motdepasse;
    private String adresse;
    //Peut-être intégrer la classe Reservation ??? //
    
    public Client(String nm, String prm, String log, String mdp, String ad)
    {
        super(nm, prm);
        login = log;
        motdepasse = mdp;
        adresse = ad;
    }

    public String getLogin() {
        return login;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public String getAdresse() {
        return adresse;
    }
    
  
    public void setLogin(String login) {
        this.login = login;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
      
}
