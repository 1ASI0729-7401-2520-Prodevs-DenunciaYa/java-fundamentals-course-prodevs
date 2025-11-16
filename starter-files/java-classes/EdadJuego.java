import java.util.Scanner;

public class EdadJuego {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuántos años tienes?: ");
        int edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("¡Puedes ver la película!");
        } else {
            System.out.println("Lo siento, necesitas tener al menos 18 años.");
        }
    }
}

