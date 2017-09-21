package testsapplication;

import java.util.HashMap;

public class Convertisseur {
    private HashMap<String,Devise> listeDevises = new HashMap();
    
    public void ajouterDevise (String unNom, double unTauxChange)
            throws Exception{
            if (listeDevises.containsKey(unNom)){
                throw new Exception ("Devise déjà existante");
            }
            else {
                listeDevises.put(unNom, new Devise(unNom,unTauxChange));
            }
    }
    public double convertir (double unNombre, String nomDeviseDepart,
        String nomDeviseCible) throws Exception {
        if(!listeDevises.containsKey(nomDeviseDepart) || 
                !listeDevises.containsKey(nomDeviseCible)){
            throw new Exception("Devise inconnue");
        }
        unNombre=unNombre*this.getDevise(nomDeviseDepart).getTauxChange();
        if(nomDeviseCible.equals("USD"))
        {
            return unNombre;
        }
        else
        {
            return unNombre/this.getDevise(nomDeviseCible).getTauxChange();
        }
    }
    public Devise getDevise (String unNomDevise)throws Exception{
        if (listeDevises.containsKey(unNomDevise)){
            return listeDevises.get(unNomDevise); 
        }
        else{
            throw new Exception ("Pas de nom devise correspondante");
        }
    }
}
