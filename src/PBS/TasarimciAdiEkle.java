/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBS;

/**
 *
 * @author MG
 */
public class TasarimciAdiEkle implements Tasarimci {
   private String a;
   private String b;

    public TasarimciAdiEkle(String a, String b) {
        this.a = a;
        this.b = b;
    }
   
   
    @Override
    
    public String tasarimciYazdir() {
        return "Desing By   "+a+" / "+b+" ";
        
    }
    
}
