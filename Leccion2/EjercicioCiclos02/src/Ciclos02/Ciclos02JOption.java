/*
Ejercicio 2: Leer un número e indicar si es positivo o
negativo. El proceso se repetira hasta que se introduzca
un cero 0
Hacer este ejercicio con la clase Scanner, 
luego hacerlo nuevamente con la clase JOptionPane
*/
package Ciclos02;

import javax.swing.JOptionPane; /*Importamos la clase JOptionPane*/

public class Ciclos02JOption {
     public static void main(String[] args) {
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero != 0){
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El número "+numero+" es POSITIVO");
                /*El parámetro "null" significa que no hay ningún cuadro
                                   principal al cual este cuadro esté asociado*/
            }
            else{
                JOptionPane.showMessageDialog(null, "El número "+numero+" es NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        JOptionPane.showMessageDialog(null, "El número "+numero+" finaliza el programa");
        
        /*NOTAS DE LA CLASE: Métodos de la clase JOptionPane
                    .showMessageDialog = Muestra un cuadro de diálogo
                    .showInputDialog = Muestra un cuadro para introducir datos*/
    }
}
