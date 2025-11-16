import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        // Agregamos estudiantes
        listaEstudiantes.add(new Estudiante("Pedro", 16));
        listaEstudiantes.add(new Estudiante("Lucía", 17));
        listaEstudiantes.add(new Estudiante("Jorge", 15));

        // Mostramos los nombres
        for (Estudiante e : listaEstudiantes) {
            System.out.println(e.getNombre() + ", Edad: " + e.getEdad());
        }

        // Eliminamos un estudiante
        listaEstudiantes.remove(1); // elimina a Lucía
        System.out.println("Después de eliminar a Lucía:");
        for (Estudiante e : listaEstudiantes) {
            System.out.println(e.getNombre());
        }
    }
}

