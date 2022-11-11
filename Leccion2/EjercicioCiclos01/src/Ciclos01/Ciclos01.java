/*Ejercicio1: Leer un número y mostrar su cuadrado, repetir
    el proceso hasta que se introduzca un número negativo*/
package Ciclos01;
//Importamos la clase Scanner para poder pedirle datos al usuario
import java.util.Scanner;
public class Ciclos01 {
    public static void main(String[] args) {
        /*Debemos crear una variable para usarla de medio
                   para utilizar la clase Sccanner*/
        Scanner numero = new Scanner(System.in);
        //Creamos "a" para que el usuario ingrese un número
        int a = 0;
        // y creamos "b" para almacenar el resultado del cuadrado de ese numero
        int b = 0;
        /*Utilizamos "DO WHILE" ya que ejecuta primero el código
                   y después consulta la condición. Si usaramos "WHILE" solo,
                    no tendríamos variable para comprobar si hay que entrar
                    al ciclo, ya que el usuario todavía no ingresa el numero*/
        do {
            System.out.println("Ingresa un numero para saber su cuadrado: ");
            System.out.println("En cuanto usted ingrese un número negativo el programa terminará");
            a = numero.nextInt();
            b = a*a;
            System.out.println("b = " + b);
        } while (a >= 0);
       
        }
    }