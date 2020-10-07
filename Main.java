/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos;
import Electrodomesticos.Lavadora;
import Electrodomesticos.Television;
import Electrodomesticos.Electrodomestico;
import java.util.ArrayList;

/**
 *
 * @author Karla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   // public static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(6);
    public static void main(String[] args) {
        // TODO code application logic here
        Electrodomestico electrodomesticos[]= new Electrodomestico[6];
        double precio_total=0;
        double precio_electrodomesticos= 0;   
        double precio_lavadoras=0;
        double precio_televisiones=0;
       
        
        electrodomesticos [0] = new Electrodomestico(2000, "rojo",'B',10 );
        electrodomesticos [1] = new Electrodomestico(1500, "azul",'B',30);
       // Electrodomestico electrodomestico3 = new Electrodomestico();
       // Electrodomestico electrodomestico4 = new Electrodomestico();
        electrodomesticos [2] = new Lavadora(2000,35);
        electrodomesticos [3] = new Lavadora(1000,30);
       // Lavadora lavadora3 = new Lavadora();
        electrodomesticos [4] = new Television(500,"negro",'E', 20, false,20);
        electrodomesticos [5] = new Television(2000,"beige",'F', 20, true,30 );
       // Television television3 = new Television();
        //  electrodomesticos.add(electrodomestico1);
        //  electrodomesticos.add(electrodomestico2);
        //  electrodomesticos.add(lavadora1);
        //  electrodomesticos.add(lavadora2);
        //  electrodomesticos.add(television1);
        //  electrodomesticos.add(television1);
        //  electrodomesticos.add(electrodomestico1);
        //  electrodomesticos.add(electrodomestico1);
        //  electrodomesticos.add(electrodomestico1);
        //  electrodomesticos.add(electrodomestico1);
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Electrodomestico) {
                precio_electrodomesticos += electrodomestico.precioFinal();
            }
            if (electrodomestico instanceof Lavadora) {
                precio_lavadoras += electrodomestico.precioFinal();
            }
            if (electrodomestico instanceof Television) {
                precio_televisiones += electrodomestico.precioFinal();
            }
        }
        precio_total= precio_electrodomesticos+precio_lavadoras+precio_televisiones;
       System.out.println("El precio total de electrodomesticos es: $"+ precio_electrodomesticos);
       System.out.println("El precio total de Lavadoras es: $"+ precio_lavadoras);
       System.out.println("El precio total de Televisiones es: $"+ precio_televisiones);
      // System.out.println("El precio total de electrodomesticos es: $"+ precio_electrodomesticos);
       
}
}
