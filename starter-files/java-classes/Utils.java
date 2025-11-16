public class Utils {
    public static void mostrarNombres(Estudiante[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].getNombre());
        }
    }
}

