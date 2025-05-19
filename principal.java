import java.util.*;


public class principal {

     static List<producto> productos= new ArrayList<>();
     static Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {
       int opcion;
        do {
            System.out.println("\n--- Menú de Artículos ---");
            System.out.println("1. Crear artículo");
            System.out.println("2. Listar artículos");
            System.out.println("3. Modificar artículo");
            System.out.println("4. Eliminar artículo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scan.nextInt();
            scan.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> System.out.println("crearArticulo()");
                case 2 -> System.out.println("listarArticulos()"); 
                case 3 -> System.out.println("modificarArticulo()");
                case 4 -> System.out.println("eliminarArticulo()");
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 5);
    }
}
