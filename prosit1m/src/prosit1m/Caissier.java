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
public class Caissier extends Employee {
    private int numCaisse;
    
    
    public Caissier(int numCaisse, int id, String nom,String adresse,int nbHeures)
    {
        super(id,nom,adresse,nbHeures);
        this.numCaisse=numCaisse;
                
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{" + "numCaisse=" + numCaisse + '}';
    }
    
    
    
}
