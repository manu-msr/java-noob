package canica;

import java.awt.Color;

/**
 * Programa para probar los métodos de la clase canica
 * @author Manuel Soto Romero
 * @version 1.00 Marzo, 2013
 */
public class PruebaCanica {
    
    public static void main(String[] args){
        
        //Crear dos canicas
        Canica uno = new Canica();
        Canica dos = new Canica();
        
        //Mostrar las canicas
        System.out.println("Las canicas son: \n" + uno.toString() + "\n" 
                + dos.toString());
        
        //Mostrar si son iguales
        System.out.println("\nSon iguales?: " + uno.equals(dos));
        
        //Cambiar el color y número de pasos de las canicas
        uno.setColor(Color.yellow);
        uno.setPasos(10);
        dos.setColor(Color.black);
        dos.setPasos(5);
        
        //Subir la canica amarilla 2 pasos.
        System.out.println("Subió?: " + uno.avanzar("Arriba", 5));
        
        //Mostrar posición de la canica amarilla ahora
        System.out.println("Ahora se encuentra en: " + uno.getPos());
        
        //Bajar la canica amarilla 4 pasos.
        System.out.println("Bajó?: " + uno.avanzar("Abajo", 4));
        
        //Mostrar la posición de la canica amarilla ahora
        System.out.println("Ahora se encuentra en: " + uno.getPos());
        
        //Mover a la derecha la canica negra 2 pasos.
        System.out.println("Se movió?: " + dos.avanzar("Derecha", 2));
        
        //Mostrar posición de la canica negra ahora
        System.out.println("Ahora se encuentra en: " + dos.getPos());
        
        //Mover a la izquierda la canica negra 2 pasos.
        System.out.println("Se movió?: " + dos.avanzar("Izquierda", 2));
        
        //Mostrar la posición de la canica amarilla ahora
        System.out.println("Ahora se encuentra en: " + dos.getPos());
        
        //Mostrar el número de canicas
        System.out.println("\nNúmero de canicas: " + Canica.cuantasCanicas());
    }
}
