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
public class ConversorConcreto extends AConversor{
    
    @Override
    double grado2radian(){
        return (dato*Math.PI)/180;
    }
    
    @Override
    double farenheit2kelvin(){
        return (dato+459.67)*5/9;
        
    }
}
