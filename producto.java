

public class producto {

    String nombre;
    double precio;
    int id;

    
    public producto(String nombre, double precio, int id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id=id;
       
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
    @Override
    public String toString() {
        return "producto [nombre=" + nombre + ", precio=" + precio + ", id= " + id +"]";
    }

    



}


