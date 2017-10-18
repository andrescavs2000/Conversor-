
package convertidor;


public class Convertidor {

    
    public static void main(String[] args) {
        
       ConversorConcreto miConversor = new ConversorConcreto();
       
       miConversor.dato=80.24;
       
       System.out.println(miConversor.farenheit2kelvin());
       System.out.println(miConversor.grado2radian());
       
       CTransformador miTransformador = new CTransformador();
       
       miTransformador.valor=38.58;
       
       System.out.println(miTransformador.grado2radian());
       System.out.println(miTransformador.kelvin2celsius());
       
 }   
    
}
