import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo: ");
            double dividendo = sc.nextDouble();

            System.out.print("Ingrese el divisor: ");
            double divisor = sc.nextDouble();

            if (divisor == 0) {
                throw new ArithmeticException("No se puede dividir entre cero.");
            }

            double resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar valores numéricos.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Fin del programa.");
        }
    }
}