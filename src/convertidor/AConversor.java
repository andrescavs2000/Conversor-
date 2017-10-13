/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

/**
 *
 * @author Administrador
 */
public abstract class AConversor {

    double dato;
    double farenheit = dato;
    double anGrados= dato; //grados 
abstract double grado2radian();
      
     public double farenheit2kelvin(double farenheit){
         
         double kelvin =  (5/9 * (farenheit - 32) + 273.15);
         return kelvin;
    }
} 
 
        

