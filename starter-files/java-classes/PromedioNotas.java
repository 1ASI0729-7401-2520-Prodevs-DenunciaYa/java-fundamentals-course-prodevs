public class PromedioNotas {
    public static double calcularPromedio(double n1, double n2, double n3) {
        double promedio = (n1 + n2 + n3) / 3;
        return promedio;
    }

    public static void main(String[] args) {
        double resultado = calcularPromedio(15.5, 18.0, 16.0);
        System.out.println("El promedio es: " + resultado);
    }
}

