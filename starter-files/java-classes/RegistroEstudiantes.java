import java.util.ArrayList;
import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        ArrayList<Estudiante> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- Menú de Registro ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch(opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    lista.add(new Estudiante(nombre, edad));
                    System.out.println("Estudiante agregado ✅");
                    break;
                case 2:
                    System.out.println("\nLista de estudiantes:");
                    for (Estudiante e : lista) {
                        e.mostrarDatos();
                    }
                    break;
                case 3:
                    System.out.print("Nombre del estudiante a eliminar: ");
                    String eliminar = scanner.nextLine();
                    boolean eliminado = false;
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getNombre().equalsIgnoreCase(eliminar)) {
                            lista.remove(i);
                            eliminado = true;
                            System.out.println("Estudiante eliminado ✅");
                            break;
                        }
                    }
                    if (!eliminado) System.out.println("Estudiante no encontrado ❌");
                    break;
                case 4:
                    System.out.println("¡Hasta luego! 👋");
                    break;
                default:
                    System.out.println("Opción inválida ❌");
            }
        } while(opcion != 4);

        scanner.close();
    }
}

