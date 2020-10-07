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
public class Television extends Electrodomestico {
    
    private boolean sintonizador;
    private float resolucion;
    
    private final boolean sintonizador_defecto= false;
    private final float resolucion_defecto = 20;
    
    public Television(){
        sintonizador= sintonizador_defecto;
        resolucion= resolucion_defecto;
    }

    public Television (double precio_base, float peso){
        super(precio_base, peso);
        sintonizador= sintonizador_defecto;
        resolucion= resolucion_defecto;
    }   
    public Television (double precio_base, String color, char consumo_energetico, float peso, boolean sintonizador,float resolucion){
        super (precio_base, color, consumo_energetico, peso);
        this.sintonizador=sintonizador;
        this.resolucion=resolucion;
            
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public float getResolucion() {
        return resolucion;
    }
   public double precioFinal(){
        double precio=super.precioFinal();
        if (resolucion>40){
            precio += precio_base*0.30;
        }
        if (sintonizador== true){
            precio += 50;
        }
        return precio;
       
    }
    
    
    
 
}
