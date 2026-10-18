
import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int loteProducto;
        int cantidadProductos;
        String continuar = "s";
        double costo;

        while (continuar.equalsIgnoreCase("s")) { 

        System.out.println("¿En que lote desea guardar el producto?");
        loteProducto = leer.nextInt();

        System.out.println("¿Cuantos productos desea ingresar al lote?");
        cantidadProductos = leer.nextInt();

        System.out.println("¿Cuanto cuesta el producto?");
        costo = leer.nextDouble();

            
        if (costo < 10000) {
            System.out.println("Producto de categoria baja ingresado correctamente");

        } else if (costo >= 10000 && costo <= 50000) {
            System.out.println("Producto de categoria media ingresado correctamente");
            
        } else {
            System.out.println("Producto de categoria alta ingresado correctamente");
        }
        continuar = leer.next();
        }
        leer.close();
    }
}
