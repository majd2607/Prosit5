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
public class Employee {
    private int id;
    private String nom;
    private String adresse;
    private int nbHeures;
    
    
    public Employee(int id,String nom,String adresse,int nbHeures)
    {
        this.id=id;
        this.nom=nom;
        this.adresse=adresse;
        this.nbHeures=nbHeures;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbHeures=" + nbHeures + '}';
    }
    public boolean comparer(Employee E)
    {
        return ((this.getId()==E.getId()) && (this.getNom()==E.getNom()) && (this.getAdresse()==E.getAdresse()) && (this.getNbHeures()==E.getNbHeures()));
    }
    
}
