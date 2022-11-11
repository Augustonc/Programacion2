
package test;

public class TestArreglos {
    public static void main(String[] args) {
       int edades[] = new int[3]; //del lado izquierdo declaramos la variable
       // y del lado derecho instanciamos un objeto de tipo objet, el arreglo tendrá
       // 3 elementos, no puede tener más
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);
        
        //NOTA:  En arreglos no se puede trabajar de forma dinamica
        // Tarea: llenar los dos arreglos que faltan
        edades [1] = 18;
        System.out.println("edades 1 = " + edades [1]);
        
        edades [2] = 19;
        System.out.println("edades 2 = " + edades [2]);
        
        //NOTA: Los programadores acostumbran a utilizar palabras plurales
        // para los arreglos
        
        //¿Que pasa si queremos acceder a un elemento fuera de nuestro rango?
        
        //edades[3] = 7; // Esto no es un error de compilación, es un error
        // en tiempo de ejecucion, cuando ejecutemos nos va  a incdicar
        // que la posicion del arreglo está fuera de rango
        
        for(int i = 0; i < edades.length; i++){ // no ponemos i <= edades.length por que nos quedaría fuera de rango en tiempo de ejecución
            System.out.println("edades y sus elementos " + i + ": " + edades[i]);
        } // podemos utilizar length por que es un atributo de la clase arreglo
        
        
        
    }
    
}
