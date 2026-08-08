import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();

            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }

            System.out.println("Edad ingresada correctamente: " + edad + " años");

        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un valor numérico.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Fin del programa.");
        }
    }
}