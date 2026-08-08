abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularPago();
}

class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, double salarioMensual) {
        super(nombre);
        if (salarioMensual < 0) {
            throw new IllegalArgumentException("El salario mensual no puede ser negativo.");
        }
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}

class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, double horasTrabajadas, double pagoPorHora) {
        super(nombre);
        if (horasTrabajadas < 0 || pagoPorHora < 0) {
            throw new IllegalArgumentException("Las horas trabajadas y el pago por hora no pueden ser negativos.");
        }
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * pagoPorHora;
    }
}

public class Ejercicio15 {
    public static void main(String[] args) {
        try {
            Empleado[] empleados = new Empleado[2];
            empleados[0] = new EmpleadoTiempoCompleto("Ana Lopez", 6500.00);
            empleados[1] = new EmpleadoPorHoras("Carlos Ruiz", 80, 35.50);

            System.out.println("=== Sistema de Empleados ===\n");

            for (Empleado e : empleados) {
                System.out.println("Empleado: " + e.getNombre());
                System.out.println("Pago calculado: Q" + e.calcularPago());
                System.out.println("-----------------------------");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear empleado: " + e.getMessage());
        }
    }
}