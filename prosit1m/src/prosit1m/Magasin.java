/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit1m;
import java.util.Comparator;


/**
 *
 * @author Majd Tabessi
 */
public class Magasin {
    
    private int id;
    private String adresse;
    private String nom;
    private int capacite;
    private int nbre_prod = 0;
    private Produit[] ensembleProduit;
    private Employee[] ensembleEmlpoyee;
    private int nbEmployee;
    
    
    
    public Magasin(){};
   
     public Magasin(int id,String adresse)
    {
        this.id=id;
        this.adresse=adresse;
        this.capacite=0;
        
        this.ensembleProduit= new Produit[50];
    }
    
    public Magasin(int id,String nom,String adresse)
    {
        this.id=id;
        this.nom=nom;
        this.adresse=adresse;
        this.capacite=0;
        this.ensembleProduit= new Produit[50];
    }
    
    public boolean ajouterProduit(Produit p)
    {
        if(this.capacite<50)
        {
            if(chercherProduit(p)==false){
            ensembleProduit[this.capacite]=p;
            this.capacite++;
            return true;
        }
        else {
                return false;
             
        }
        }
        return false;
    }

 
    
     public boolean comparer(Produit P1,Produit P2)
    {
       return ((P1.getId()==P2.getId()) && (P1.getLibelle()==P2.getLibelle()) && (P1.getPrix()==P2.getPrix()));

    }
    
    
     public boolean chercherProduit(Produit P)
    {
        for(int i=0;i<this.capacite;i++)
        {
            if(comparer(P, ensembleProduit[i]))
            {
                return true;
            }
        }
        return false;
    }
     
     public void supprimer(Produit P)
     {
         int index=-1;
         for (int i=0; i < capacite; i++)
         {
             if(ensembleProduit[i].comparer(P))
             {
                 index=i;
                 break;
             }
         }
             if(index==49)
             {
                 ensembleProduit[index]=null;
             }
             for(int i=index;i<capacite;i++)
             {
                 ensembleProduit[i]= ensembleProduit[i+1];
             }
             capacite--;
             ensembleProduit[capacite]=null;
         }
     
         public static Magasin comparerMagasin(Magasin M1,Magasin M2)
         {
             if (M1.capacite>M2.capacite)
             {
                 return M1;
             }
             else if (M1.capacite<M2.capacite)
             {
                 return M2;
             }
             return null;
                 
         }
         
           public boolean chercherEmployee(Employee E)
    {
        for(int i=0;i<this.nbEmployee;i++)
        {
            if(ensembleEmlpoyee[i].comparer(E))
            {
                return true;
            }
        }
        return false;
    }
     
 
            public boolean ajouterEmployee(Employee E)
    {
        if(this.nbEmployee<20)
        {
            if(chercherEmployee(E)==false){
            ensembleEmlpoyee[this.nbEmployee]=E;
            this.nbEmployee++;
            return true;
        }
        else {
                return false;
             
        }
        }
        return false;
    }
     public boolean ajouterEmployee(Vendeur V)
    {
        if(this.nbEmployee<20)
        {
            if(chercherEmployee(V)==false){
            ensembleEmlpoyee[this.nbEmployee]=V;
            this.nbEmployee++;
            return true;
        }
        else {
                return false;
             
        }
        }
        return false;
    }
     
            public boolean ajouterEmployee(Responsable R)
    {
        if(this.nbEmployee<20)
        {
            if(chercherEmployee(R)==false){
            ensembleEmlpoyee[this.nbEmployee]=R;
            this.nbEmployee++;
            return true;
        }
        else {
                return false;
             
        }
        }
        return false;
    }
            
                   public boolean ajouterEmployee(Caissier C)
    {
        if(this.nbEmployee<20)
        {
            if(chercherEmployee(C)==false){
            ensembleEmlpoyee[this.nbEmployee]= C;
            this.nbEmployee++;
            return true;
        }
        else {
                return false;
             
        }
        }
        return false;
    }

    @Override
    public String toString() {
                String mag="";

        mag= ( "Magasin{" + "id=" + id 
                + "\n" + ", adresse=" + adresse 
                + "\n" + ", capacite=" + capacite 
                + "\n" + ", nbEmployee=" + nbEmployee + '}');
    
   
        for(int i=0;i<this.capacite;i++)
        {
            mag += ensembleProduit[i].toString();
            
        }
    
        
        for(int i=0;i<this.nbEmployee;i++)
        {
            mag +=ensembleEmlpoyee[i].toString();
        }
        return mag;
    }
    public  float calculStock(){
        float qt= 0;
        for( int i=0; i<nbre_prod; i++){
           // if (tab[i] instanceof ProduitFruit)
           if (ensembleProduit[i].determinerTypeProduit().equals("Fruit")){
               qt=qt+ ( (ProduitFruit) ensembleProduit[i]).getQuantite();
           }
        }
        
        return qt;
}
}
                   

   
