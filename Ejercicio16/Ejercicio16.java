class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: Q" + precio);
    }
}

class ProductoFisico extends Producto {
    private double peso;

    public ProductoFisico(String nombre, double precio, double peso) {
        super(nombre, precio);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo: Producto Físico | Peso: " + peso + " kg");
    }
}

class ProductoDigital extends Producto {
    private double tamanoArchivoMB;

    public ProductoDigital(String nombre, double precio, double tamanoArchivoMB) {
        super(nombre, precio);
        this.tamanoArchivoMB = tamanoArchivoMB;
    }

    public double getTamanoArchivoMB() {
        return tamanoArchivoMB;
    }

    public void setTamanoArchivoMB(double tamanoArchivoMB) {
        this.tamanoArchivoMB = tamanoArchivoMB;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo: Producto Digital | Tamaño: " + tamanoArchivoMB + " MB");
    }
}

public class Ejercicio16 {
    public static void main(String[] args) {
        Producto[] productos = new Producto[3];
        productos[0] = new ProductoFisico("Laptop HP", 4500.00, 2.3);
        productos[1] = new ProductoDigital("Curso de Java Online", 350.00, 850.5);
        productos[2] = new ProductoFisico("Mouse Inalámbrico", 120.00, 0.15);

        System.out.println("=== Sistema de Productos ===\n");

        for (Producto p : productos) {
            p.mostrarDetalles();
            System.out.println("-----------------------------");
        }
    }
}