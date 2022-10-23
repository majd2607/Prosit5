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
public class ProduitLegume extends ProduitsAgricoles{
    public ProduitLegume(int id,String libelle,float quantite,String saison)
    {
        super(id,libelle,quantite,saison);
    }

    @Override
    public String toString() {
        return "ProduitLegume{" + '}';
    }
    
    
}
