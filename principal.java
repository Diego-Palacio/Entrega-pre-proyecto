import java.util.*;


public class principal {

     static List<producto> productos= new ArrayList<>();
     static Scanner scan= new Scanner(System.in);
     static int id=0;

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
                case 4 -> eliminarArticulo();
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
                id++;
                producto productoNuevo= new producto(articulo, precio, id);
                productos.add(productoNuevo);
                System.out.println("Articulo "+ productoNuevo
                + " agregado");
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
            System.out.println("Ingrese el id del producto a modificar");
            int idProducto= scan.nextInt();

            for(producto p: productos){

               if(p.id==(idProducto)){
                    scan.nextLine();
                    System.out.println("Ingrese el nuevo nombre al producto "+ p.nombre+" : ");
                    String nuevoNombreProducto= scan.nextLine();
                    p.setNombre(nuevoNombreProducto);
                    System.out.println("nombre de Producto "+idProducto+ "cambiado a "+ nuevoNombreProducto);
                }
        }
            System.out.println("No existe producto "+ idProducto);
        
        }

public static void eliminarArticulo(){

    System.out.println("Ingrese el id del producto a eliminar: ");
    int idEliminar= scan.nextInt();

    productos.removeIf(producto -> producto.id==idEliminar);
    System.out.println("Articulo eliminado");


}


}
