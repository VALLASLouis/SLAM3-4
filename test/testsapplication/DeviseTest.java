/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsapplication;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VALLAS
 */
public class DeviseTest {
    
    public DeviseTest() {
    }

    @Test
    public void testConstructeur() {
        try {
            
        String nom = "USD";
        double tauxChange = 1.0;
        Devise devise = new Devise(nom,tauxChange);
        
        assertEquals(nom,devise.getNom());
        assertEquals(tauxChange,devise.getTauxChange(),0.000001);
        }
        catch (Exception e) {
            
        }      
    }
    @Test
    public void testReglesMetier() throws Exception {
        Devise devise;
        try {
            devise = new Devise ("EURO",0);
            fail("Erreur non detectée : nom de la devise incorrect");
        }
        catch (Exception e) {
            // erreur attendue
        }
    }
    
}
