class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}

class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Carro | Número de puertas: " + numeroPuertas);
    }
}

class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Moto | Cilindrada: " + cilindrada + "cc");
    }
}

public class Ejercicio02 {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Carro("Toyota", "Corolla", 4);
        vehiculos[1] = new Moto("Honda", "CBR 250", 250);
        vehiculos[2] = new Carro("Mazda", "3", 4);

        System.out.println("=== Sistema de Vehiculos ===\n");

        for (Vehiculo v : vehiculos) {
            v.mostrarDatos();
            System.out.println("-----------------------------");
        }
    }
}