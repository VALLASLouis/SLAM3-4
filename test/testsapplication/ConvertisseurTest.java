package testsapplication;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConvertisseurTest extends TestCase {
    private Convertisseur convertisseur;
    public ConvertisseurTest(){
        
    }
    
    @Test
    public void testAjouterDevise() throws Exception {
        //Convertisseur convertisseur = new Convertisseur();
        
        try {
            convertisseur.ajouterDevise("EUR", 1.36);
            fail ("Erreur non détéctée (devise déjà ajouté");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void testConvertir() throws Exception {
        
        //conversion d'1 euro en en euros
        double resultat = convertisseur.convertir(1.0, "EUR", "EUR");
        assertEquals(1.0,resultat,0.000001);
        
        resultat = convertisseur.convertir(1.0, "GBP", "USD");
        assertEquals(1.6,resultat,0.000001);
        
        resultat = convertisseur.convertir(20.0, "EUR", "GBP");
        assertEquals(17.0,resultat,0.000001);
        
        try {
            convertisseur.convertir(1.0,"YEN","USD");
            fail ("Erreur non détectée : devise inconnue");      
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } 

    @Override
    protected void setUp() throws Exception {
        convertisseur = new Convertisseur();
        convertisseur.ajouterDevise("EUR", 1.36);
        convertisseur.ajouterDevise("GBP", 1.6);
        convertisseur.ajouterDevise("USD", 1.0);
    }
    
}
