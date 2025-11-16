public class Mascota {
    String nombre;
    int edad;
    String tipo;

    // Constructor
    public Mascota(String n, int e, String t) {
        nombre = n;
        edad = e;
        tipo = t;
    }

    void saludar() {
        System.out.println("¡Hola! Soy " + nombre + ", tengo " + edad + " años y soy un " + tipo + ".");
    }
}

