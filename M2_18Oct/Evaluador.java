
import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        String continuar = "s";
        double sumaCosto = 0;
        int totalProductos = 0;
        int contadorAltos = 0;
        
        System.out.println("¿Desea ingresar un producto? (s/n):");
        continuar = leer.next();
        
        while (continuar.equalsIgnoreCase("s")) { 
            
            int loteProducto;
            int cantidadProductos;
            double costo;

        System.out.println("¿En que lote desea guardar el producto?");
        loteProducto = leer.nextInt();

        System.out.println("¿Cuantos productos desea ingresar al lote?");
        cantidadProductos = leer.nextInt();

        System.out.println("¿Cuanto cuesta el producto?");
        costo = leer.nextDouble();
        sumaCosto += costo;
        totalProductos++;
            
        if (costo < 10000) {
            System.out.println("Producto de categoria baja ingresado correctamente");

        } else if (costo >= 10000 && costo <= 50000) {
            System.out.println("Producto de categoria media ingresado correctamente");
            
        } else {
            System.out.println("Producto de categoria alta ingresado correctamente");
            contadorAltos += cantidadProductos;
        }
        
        System.out.println("¿Desea ingresar otro producto? (s/n):");
        continuar = leer.next();

        }
            double promedioCostos = 0;
            if (totalProductos > 0) {
            promedioCostos = sumaCosto / totalProductos;
            }
            System.out.println("REPORTE FINAL");
            System.out.println("Costo promedio de los productos ingresados: " + promedioCostos);
            System.out.println("Cantidad de productos de categoría alta: " + contadorAltos);
    }
}
