
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        
        var conteo = 0; // Inferencia de tipos
        
        System.out.println("While");
        System.out.println("");
        
        while(conteo < 3){
            System.out.println("conteo = " + conteo);
            conteo ++; // El ++ aumenta en 1 la variable
        }

        var contador  = 0;
        
        System.out.println("");
        System.out.println("Do While");
        System.out.println("");
         
        do{
            System.out.println("contador = " + contador);
            contador ++;
        }while(contador <= 7); // Le ponemos el signo = para que nos muestre el numero 7
        
        /*En conclusión, while primero comprueba la condición para ejecutar el bloque de 
                    código y do while, ejecuta el código y depués corrobora la condición */
        
        System.out.println("");
        System.out.println("For y break");
        System.out.println("");
        
        // USO DE LAS PALABRAS BREAK Y CONTINUE JUNTO A LAS ETIQUETAS (LABEL)
        // Es necesario conocer esta sintaxis por que algún dia podemos
        // encontrarnos con ella, pero no es recomendable utilizarla por que puede romper
        // con la logica del programa.
        
        for(var contando = 0; contando < 7; contando++ ){
            if (contando % 2 == 0){
            System.out.println("contando = " + contando);
            break; //Si colocamos el break rompe el ciclo a la primera
            // e imprime un 0, si no está imprime pares hasta el 6
            }
        }
        
        System.out.println("");
        System.out.println("For y continue");
        System.out.println("");
        inicio: // Esto es una, etiqueta, básicamente no sirve para nada pero es bueno
        // saber que existe
        for(var contando = 0; contando < 7; contando++ ){
            if (contando % 2 != 0){
                continue inicio; //Quiere decir que vamos a la siguiente iteración
            }
            System.out.println("contando = " + contando);
        }
        /* El ciclo FOR tiene 3 lugares. El primero se utiliza para declarar el contador (iterador)
        el cual normalmente lo encontramos así (int i = 0), en el segundo lugar va la condición
        (i<7), y en el tercer lugar va el incremento o decremento
        */
    }
    
    
}
