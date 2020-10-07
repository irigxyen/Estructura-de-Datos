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
    
    private int carga;
    private final int carga_defecto = 5 ;
    
   // public Lavadora (){
     //   super ();
    
    public Lavadora () {       
        carga= carga_defecto;
    }
    public Lavadora (double precio_base,float peso){
        super (precio_base, peso);
        carga= carga_defecto;
    }
    public Lavadora (double precio_base, String color, char consumo_energetico, float peso, int carga){
        super (precio_base, color, consumo_energetico, peso);
        this.carga= carga;
    }

    public int getCarga() {
        return carga;
    }
   
    
    public double precioFinal(){
        double precio=super.precioFinal();
        if (carga>30){
            precio += 50;
        }
        return precio;
    }
    
    
    
}
