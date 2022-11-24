package caja; //Package

public class Caja { //Clase publica caja
    //Atributos (caracteristicas)
    int ancho; 
    int alto;
    int profundo;
    //Métodos y constructores (acciones)
    public Caja() { //Constructor 1 = vacio
    }
    //Contructor con parámetros
    public Caja(int ancho, int alto, int profundo) { //Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen() { //Método para calcular
        return ancho * alto * profundo;
    }
}
