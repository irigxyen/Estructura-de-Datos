/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos;

/**
 *
 * @author Karla
 */
public class Lavadora extends Electrodomestico {
    
    private int carga = 5 ;
    
    public Lavadora (){
        super ();
    }
    
    public Lavadora (float peso, double precio, int carga){
        super (peso, precio);
        this.carga= carga;
    }

    public int getCarga() {
        return carga;
    }
    public void setCarga(){
        this.carga = carga;
    }
    
    public void precioFinal(){
        
    }
    
    
    
}
