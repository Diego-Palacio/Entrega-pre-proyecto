import java.util.*;


public class principal {
    public static void main(String[] args) {

        List<producto> productos= new ArrayList<>();

        producto producto1= new producto("Coca cola", 4000, 10);
        producto producto2= new producto("Manaos", 1300, 10);
        producto producto3= new producto("Pepsi", 2200, 10);
        producto producto4= new producto("Fanta", 2800, 10);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);


        for (producto p: productos){
            System.out.println(p.toString());
        }
        //System.out.println(producto1.toString());
    }
}
