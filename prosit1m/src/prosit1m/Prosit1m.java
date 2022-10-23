/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit1m;


import java.time.LocalDateTime;

import java.time.LocalDate;

/**
 *
 * @author Majd Tabessi
 */
public class Prosit1m {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Produit p1=new Produit();
        Produit p2=new Produit(1021,"lait","delice");
        Produit p3=new Produit(2510,"yaourt","vitalait");
        Produit p4= new Produit(3250,"tomate","sicam",1.2f);
   
        
        p4.setPrix(0.7f);
        
        p3.setPrix(0.3f);
        p2.setPrix(1.0f);
        p2.setExpirationDate(LocalDate.of(2022, 10, 03).atTime(6, 46));
        p3.setExpirationDate(LocalDate.of(1999, 2, 1).atTime(6, 46));
        p4.setExpirationDate(LocalDate.of(2015, 1, 1).atTime(6, 46));


        
       // p2.afficher();
       // p3.afficher();
       // p4.afficher();
       
        //System.out.println(p2.toString());
        //System.out.println(p3.toString());
       // System.out.println(p4.toString());
       // p1.expirationDate(LocalDate.of(1985,1, 1).atTime(6,46));
       
       Magasin m1 = new Magasin(1,"ariana");
       m1.ajouterProduit(p2);
       m1.ajouterProduit(p3);
       m1.ajouterProduit(p4);
       System.out.println(m1.toString());
    p1.comparer(p4);
    m1.comparer(p1, p2);
    
Magasin M2 = new Magasin(1,"Carrefour","Centre ville");
Magasin M3= new Magasin (2,"Monoprix","Menzah6");

Caissier C1= new Caissier(22,1,"majd","ariana",12);
Caissier C2= new Caissier(23,2,"ali","tunis",13);

Vendeur V1 = new Vendeur(33,4,"salah","beja",10);
Responsable R1=new Responsable(50,41,"makrem","silana",52);

M2.ajouterEmployee(C1);
M2.ajouterEmployee(C2);
M2.ajouterEmployee(V1);
M2.ajouterEmployee(R1);

Caissier C3= new Caissier(5,3,"mohamed","kef",14);
Vendeur V2 = new Vendeur(2,5,"fahd","zarzis",11);
Vendeur V3 = new Vendeur(3,6,"wahchi","manouba",01);
Vendeur V4 = new Vendeur(4,7,"ahmed","sokra",5);
Responsable R2=new Responsable(50,41,"yacine","nabeul",52);

M3.ajouterEmployee(C3);
M3.ajouterEmployee(V2);
M3.ajouterEmployee(V3);
M3.ajouterEmployee(V4);
M3.ajouterEmployee(R2);

    
    
	        ProduitFruit prod1 = new ProduitFruit(1254,"Fraise",12.3f,"mars");
	        ProduitFruit prod2 = new ProduitFruit(1224, "pasteque", 50f, "juin");
	        ProduitFruit prod3 = new ProduitFruit(7896, "mandarine", 25.6f, "decembre");
	        ProduitLegume prod4 = new ProduitLegume(8521,"Artichauts",14f,"janvier");

    
	        M2.ajouterProduit(prod1);
	        M2.ajouterProduit(prod2);
	        M2.ajouterProduit(prod3);
	        M2.ajouterProduit(prod4);
	        
    }
   }
    

