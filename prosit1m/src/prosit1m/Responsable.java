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
public class Responsable extends Employee {
    
    private float prime;
    
    public Responsable(float prime,int id,String nom,String adresse,int nbHeures)
    {
        super(id,nom,adresse,nbHeures);
        this.prime=prime;
    }         

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable{" + "prime=" + prime + '}';
    }
    
    
    
    
}
