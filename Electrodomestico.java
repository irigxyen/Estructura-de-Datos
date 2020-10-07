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
public class Electrodomestico {
    
    protected double precio_base;
    protected String color;
    protected char consumo_energetico;
    protected float peso;
    
    private final String color_defecto= "blanco";
    private final char consumo_defecto= 'F' ;
    private final double preciobase_defecto= 100;
    private final float peso_defecto= 5;
    
    public Electrodomestico (){
        color=color_defecto;
        consumo_energetico=consumo_defecto;
        precio_base=preciobase_defecto;
        peso=peso_defecto;
    }
    public Electrodomestico (double precio_base, float peso){
        this.precio_base =precio_base;
        this.peso=peso;
        consumo_energetico=consumo_defecto;
        color=color_defecto;
           
        
    }

    public Electrodomestico(double precio_base, String color, char consumo_energetico, float peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public float getPeso() {
        return peso;
    }
    
    private char comprobarConsumoEnergetico(char Letra){
        
        if (Letra == 'A' || Letra == 'B' || Letra == 'C' || Letra == 'D' || Letra== 'F')
        {
            return Letra;
        } else {
            return 'F';
            
        }
    }
    private String comprobarColor(String Color){
        if (Color.equalsIgnoreCase("Blanco")|| Color.equalsIgnoreCase("Negro")|| Color.equalsIgnoreCase("Rojo")|| Color.equalsIgnoreCase("Azul")|| Color.equalsIgnoreCase("Gris"))
        {
            return Color;
        } else {
            return "Blanco";
          
        }
           
    }
    public double precioFinal(){
          double preciofinal=precio_base;
          switch(consumo_energetico){
            case 'A':
                preciofinal+=100;
                break;
            case 'B':
                preciofinal+=80;
                break;
            case 'C':
                preciofinal+=60;
                break;
            case 'D':
                preciofinal+=50;
                break;
            case 'E':
                preciofinal+=30;
                break;
            case 'F':
                preciofinal+=10;
                break;
    }
          if (peso>=0 && peso<19){
            preciofinal+=10;
        }
          else if(peso>=20 && peso<49){
            preciofinal+=50;
        }
          else if(peso>=50 && peso<=79){
            preciofinal+=80;
        }else if(peso>=80){
         
            preciofinal+=100; 
        }
                return preciofinal;
                
    }                
                        
            


}