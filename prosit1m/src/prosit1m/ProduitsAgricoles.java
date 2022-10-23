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
public class ProduitsAgricoles extends Produit{
    
    private String type;
    private String saison;
    private float quantite;
    
    public ProduitsAgricoles(int id,String libelle,float quantite,String saison){
        super(id,libelle);
        this.quantite=quantite;
        this.saison=saison;
        
               
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "ProduitsAgricoles{" + "type=" + type + ", saison=" + saison + ", quantite=" + quantite + '}';
    }
    
}
