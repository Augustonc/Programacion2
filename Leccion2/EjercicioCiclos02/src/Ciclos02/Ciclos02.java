/*
Ejercicio 2: Leer un número e indicar si es positivo o
negativo. El proceso se repetira hasta que se introduzca
un cero 0
Hacer este ejercicio con la clase Scanner, 
luego hacerlo nuevamente con la clase JOptionPane
*/
package Ciclos02;

import java.util.Scanner;
/*Esta es la forma de importar clases, en este caso la clase Scanner que sirve para
que se pueda pedirle al usuario que introduzca datos en el programa*/

public class Ciclos02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        /*para utilizar la clase importada debemos crear una variable de la clase
                "Scaner <nombre-de-la-variable> = new Scanner (System.in)
                 */
        System.out.println("Digite un número: ");
        
        var numero = Integer.parseInt(entrada.nextLine());
        /*"Integer.parseInt(), es una función que intentará devolvernos un número
                    entero a partir de un String, dentro de dicha función se utiliza el método
                    <variable>.nextLine(), para que el usuario ingrese datos
                    Si el usuario ingresa otro dato que no sea un número entero
                 se producirá un error en tiempo de ejecución*/
        
        while(numero != 0){
            if(numero > 0){
                System.out.println("El número "+numero+" es POSITIVO");
            }
            else{
                System.out.println("El número "+numero+" es NEGATIVO");
            }
            System.out.println("Digite otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        /*En el bloque while dice lo siguiente:
                    Mientras la variable <nuemero> sea distinta a "0" se ejecutará el siguiente
                    bloque de código:
                        Si <numero> es mayor a "0" imprimirás en pantalla "ES POSITIVO"
                        si no, "ES NEGATIVO"
                    En el caso de que <numero> sea igual a "0" dejara de ejecutar el bloque con
                    el código condicional y finalizará el programa*/
        System.out.println("El número "+numero+" finaliza el programa");
    }
}
