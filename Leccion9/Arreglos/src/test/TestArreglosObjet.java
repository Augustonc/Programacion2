
package test;

import domain.Persona;


public class TestArreglosObjet {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Augusto");
        personas[1] = new Persona("Ariel");
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);
        // Hasta aquí el soutv me imprimirá las direcciones de memoria de cada posición del arreglo
        
        
    }
}
