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
                case 1 -> crearArticulo();
                case 2 -> listarArticulos(); 
                case 3 -> modificarArticulo();
                case 4 -> System.out.println("eliminarArticulo()");
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 5);
        }

        
        public static void crearArticulo(){
            System.out.println("Ingrese nombre del articulo: ");
            String articulo = scan.nextLine();
            System.out.println("Ingrese el precio: ");
            int precio = scan.nextInt();

            if(articulo!=""){
                producto productoNuevo= new producto(articulo, precio, 0);
                productos.add(productoNuevo);
                System.out.println("Articulo "+articulo+ " agregado");
                System.out.println(productos);
            }
            else{
                System.out.println("No puede ingresar articulo sin nombre");
            }
            

        }


        public static void listarArticulos(){
            if (productos.size()!=0){
                 for(producto prod: productos){
                System.out.println(prod.toString());
                }     
            }
            else{
                System.out.println("No hay ningun producto agregado en la lista.2");
            }
           
        }

        public static void modificarArticulo(){
            System.out.println("Ingrese el nombre del articulo a modificar");
            String nombreProducto= scan.nextLine();

            for(producto p: productos){
            System.out.println("Ingrese el nuevo nombre al producto: ");
            String nuevoNombreProducto= scan.nextLine();

            if(p.nombre==(nombreProducto)){
                System.out.println("producto "+ nombreProducto +" existente");
                p.setNombre(nuevoNombreProducto);
                System.out.println("nombre de Producto "+nombreProducto+ "cambiado a "+ nuevoNombreProducto);
            }
        }
            System.out.println("No existe producto "+ nombreProducto);
        
        }


}
