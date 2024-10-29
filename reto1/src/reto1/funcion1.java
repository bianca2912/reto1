package reto1;

public class funcion1 {
	
	public static int sumar (int a, int b) { // genera la suma 
		return a + b;
	}
	
	public static int restar (int a, int b) { // genera la resta
		return a - b;
	}
	
	public static int multiplicar (int a, int b) { // para generar multiplicación
		return a * b;
	}
    public static double dividir(double a, double b) { // genera división
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return 0; // Retorna 0 en caso de división por cero
        }
        return a / b;
    }
}