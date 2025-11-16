import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        int numeroSecreto = 7;
        int intento = 0;
        Scanner entrada = new Scanner(System.in);

        while (intento != numeroSecreto) {
            System.out.print("Adivina el número (entre 1 y 10): ");
            intento = entrada.nextInt();
        }

        System.out.println("🎉 ¡Adivinaste!");
    }
}

