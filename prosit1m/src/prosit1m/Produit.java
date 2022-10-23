/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prosit1m;
import java.util.Comparator;


import java.time.LocalDateTime;
/**
 *
 * @author Majd Tabessi
 */
public class Produit {
    
    private int id;
    private String libelle,marque;
    private float prix;
    private LocalDateTime expirationDate;



public Produit() {
}

public Produit(int id,String libelle)
{
    this.id=id;
this.libelle=libelle;
}
public Produit(int id,String libelle,String marque)
{
    this.id=id;
this.libelle=libelle;
this.marque=marque;
}

public Produit(int id,String libelle,String marque,float prix)
{
    this.id=id;
this.libelle=libelle;
this.marque=marque;
this.prix=prix;
    

}


public void afficher()
{
    System.out.println("ID:" + this.id);
    System.out.println("********************");
    System.out.println("LIBELLE:"+this.libelle);
    System.out.println("********************");
    System.out.println("MARQUE:" + this.marque);
    System.out.println("********************");
    System.out.println("PRIX:" + this.prix);
    
}

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString() {
        return "id=" + id +"\n" + ", libelle=" + libelle + "\n" + ", marque=" + marque +"\n" + ", prix=" + prix +"\n"+ ",Date:" + expirationDate;
    }
    
    public boolean comparer(Produit p)
    {
        return ((this.id==p.id) && (this.libelle==p.libelle) && (this.prix==p.prix));
    }
    
    
    public String determinerTypeProduit(){
        if (this instanceof ProduitFruit)
        {
            return "FRUIT";
        }
        else if (this instanceof ProduitLegume)
        {
            return "LEGUME";
        }
            return "Autre";
             
    }
    
   
    }
     


