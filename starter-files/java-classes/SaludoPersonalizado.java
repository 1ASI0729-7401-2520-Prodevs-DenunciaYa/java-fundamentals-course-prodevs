import java.util.Scanner;
public class SaludoPersonalizado {
    public static void saludar(String nombre) {
        System.out.println("¡Hola " + nombre + "! Bienvenido al curso de Java 😄");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombreIngresado = entrada.nextLine();

        saludar(nombreIngresado);
    }
}