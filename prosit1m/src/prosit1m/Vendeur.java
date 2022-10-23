/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit1m;

/**
 *
 * @author Majd Tabessi
 */
public class Vendeur extends Employee {
    
    private float tauxDeVente;
    
    public Vendeur(float tauxDeVente,int id , String nom,String adresse,int nbHeures)
    {
        super(id,nom,adresse,nbHeures);
        this.tauxDeVente=tauxDeVente;
    }

    public float getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{" + "tauxDeVente=" + tauxDeVente + '}';
    }
    
    


}
            
    

