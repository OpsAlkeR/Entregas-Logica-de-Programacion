
import java.util.Scanner;

public class Chevignon {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int CEDI = 0;
        String continuar = "s";
        int respuesta;

        String [] Referencias = new String[5];
        Referencias [0] = "Chaqueta Cuero Icon";
        Referencias [1] = "Jean Slim Fit";
        Referencias [2] = "Camiseta Polo Leathe";
        Referencias [3] = null;
        Referencias [4] = null;

        System.out.println("!Hola¡ Bienvenido la bodega ¿Deseas buscar o ingresar alguna referencia? (s/n)");
        continuar = leer.next();

        if (continuar.equalsIgnoreCase("s")) {
            do { 
                System.out.println("Que deseas realizar en esta ocacion");
                System.out.println("1. Buscar referencia.");
                System.out.println("2. Agregar referencia.");
                System.out.println("3. Listar todas las referencias.");
                System.out.println("4. Salir.");
                System.out.println("-----------------------------------");
                respuesta = leer.nextInt();

                switch (respuesta) {
                case 1:
                    System.out.println("Ingrese la referencia que desea encontrar");
                    leer.nextLine();
                    String buscarReferencia = leer.nextLine();
                    boolean encontrada = buscarReferencia(Referencias, buscarReferencia);

                    if (encontrada) {
                        System.out.println("La referencia sí se encuentra registrada");
                    } else {
                        System.out.println("NOP, esa referencia no existe en el sistema.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la referencia que desea agregar");
                    leer.nextLine();
                    String nuevaRef = leer.nextLine();

                    boolean agregado = nuevaPrenda(Referencias, nuevaRef);
                    if (agregado) {
                        System.out.println("-----------------------------------------------");
                        System.out.println("Referencia ingresada correctamente, ya la metió");
                        System.out.println("-----------------------------------------------");
                    } else {
                        System.out.println("----------------------------------");
                        System.out.println("Negativo al civil, ya no hay cupo.");
                        System.out.println("----------------------------------");
                    }
                    break;
                case 3:
                    listarReferencias(Referencias);
                    System.out.println("----------------------");

                    break;
                case 4:
                    System.out.println("Tramite culminao");
                    break;


                default:
                    throw new AssertionError();
                }
            } while (respuesta !=4);
            

        } else {
            System.out.println("Tramite finalizado");
        }
    }
    public static boolean nuevaPrenda(String[] salchicha, String nuevaPrenda) {
        for (int i = 0; i < salchicha.length; i++) {
           if (salchicha[i] == null) {
            salchicha[i] = nuevaPrenda;
            return true;
           }
        }
        return false;
    }
    public static boolean buscarReferencia(String[] papa, String buscado) {
        for (int i = 0; i < papa.length; i++) {
            if (papa[i] != null && papa[i].equalsIgnoreCase(buscado)) {
                return true;
            }
        }
        return false;
    }
    public static void listarReferencias(String[] arreglo) {
        for (String ref : arreglo) {
            if (ref != null) {
                System.out.println(ref);
            }
        }
    }

}