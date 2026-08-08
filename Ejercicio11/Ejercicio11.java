import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad <= 12) {
            System.out.println("Clasificación: Niño");
        } else if (edad <= 17) {
            System.out.println("Clasificación: Adolescente");
        } else {
            System.out.println("Clasificación: Adulto");
        }

        sc.close();
    }
}