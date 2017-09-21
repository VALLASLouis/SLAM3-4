package testsapplication;

public class Devise {
    private String nom;
    private double tauxChange;
    public Devise (String unNom, double unTauxChange) throws Exception {
        if (unNom.length() == 3) {
            this.nom = unNom;
            this.tauxChange = unTauxChange;
        }
        else {
            throw new Exception ("Le nom " + nom + "est incorrect");
        }
    }
    public String getNom() {
        return nom;
    }
    public double getTauxChange() {
        return tauxChange;
    }
}
