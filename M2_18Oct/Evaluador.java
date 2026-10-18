
import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int loteProducto;
        int cantidadProductos;
        double costo;

        System.out.println("¿En que lote desea guardar el producto?");
        loteProducto = leer.nextInt();

        System.out.println("¿Cuantos productos desea ingresar al lote?");
        cantidadProductos = leer.nextInt();

        System.out.println("¿Cuanto cuesta el producto?");
        costo = leer.nextDouble();
    }
}
