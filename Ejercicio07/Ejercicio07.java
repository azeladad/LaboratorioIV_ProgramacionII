import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            System.out.println("Número ingresado correctamente: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un valor numérico, no texto.");
        } finally {
            sc.close();
            System.out.println("Fin del programa.");
        }
    }
}