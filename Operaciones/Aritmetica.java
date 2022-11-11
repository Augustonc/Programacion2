
package Operaciones;

public class Aritmetica {
    // Clase 5
    // Atributos de la clase
    int a;
    int b;
    
  //Metodo
  //Metodo que no retorna nada
    
  /*Donde llamamos a los metodos es donde les vamos
    a pasar los argumentos, recordemos que EN EL CODIGO
    SE LLAMAN ARGUMENTOS Y EN LA FUNCIÓN (Metodo en Java)
    SON PARÁMETROS*/
    
    
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    //Metodo que si retorna algo
    public int sumarConRetorno(){
        //int resultado = a + b;
        return a + b; //Es lo mismo que esta comentado en la linea de arriba
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b;
    
        //El operador this hace que se diferencien los atributos de los argumentos
        //return a + b;
        return sumarConRetorno();
        /* Dentro de un metodo se pide que se retorne otro metodo*/
        /* Esto no es usual, es para aprendizaje, lo estamos viendo de una
                    forma basica*/
        
        
        
    }
}
