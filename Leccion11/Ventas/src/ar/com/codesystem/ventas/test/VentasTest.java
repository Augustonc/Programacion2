
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Producto producto3 = new Producto("Musculosa", 3200.00);
        Producto producto4 = new Producto("Remera", 5000.00);
        Producto producto5 = new Producto("Medias", 1200.00);
        Producto producto6 = new Producto("Zapatillas", 32900.00);
        Producto producto7 = new Producto("Gorra", 2900.00);
        Producto producto8 = new Producto("Reloj", 19900.00);
        Producto producto9 = new Producto("Short de baño", 59000.00);
        Producto producto10 = new Producto("Buzo", 8900.00);
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        //Agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        System.out.println("");
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto10);
        orden2.mostrarOrden();
        
        
        //Tarea: 
        //Crear mas objetos de tipo Producto = 10
        //Crear mas objetos de tipo Orden = 2
    }
    
}
