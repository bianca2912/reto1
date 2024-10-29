package reto1;
import reto1.funcion1;
import reto1.funcion2;
import java.util.Scanner;

public class retos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int menu = 9;
		Scanner scanner = new Scanner (System.in);
		boolean valido;
		
		do {
			System.out.println("Elige la operación:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salir");
			String input = scanner.nextLine();
			try {
				menu = Integer.parseInt(input);
				if (menu >=0 && menu<=8) {
					valido = true;
				} else {
					System.out.println("Número incorrecto.");
					valido = false;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Número no reconocido.");
				valido = false;
			}
		} while (!valido);
		
		do {
			System.out.println("Introduce el primer número: ");
			String input = scanner.nextLine();
			try {
				a = Integer.parseInt(input);
				valido = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Número no reconocido.");
				valido = false;
			}
		} while (!valido);
		
		do {
			System.out.println("Introduce el primer número: ");
			String input = scanner.nextLine();
			try {
				b = Integer.parseInt(input);
				valido = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Número no reconocido.");
				valido = false;
			}
		} while (!valido);
		
			switch (menu) {
			case 1: {
				int resultado = funcion1.sumar(a, b);
				System.out.println ("La suma entre: " + a + " + " + b + " es: " + resultado);
			}
			case 2: {
				int resultado = funcion1.restar(a, b);
				System.out.println ("La resta  entre: " + a + " - " + b + " es: " + resultado);
			}
			case 3: {
				int resultado = funcion1.multiplicar(a, b);
				System.out.println ("La multiplicación  entre: " + a + " x " + b + " es: " + resultado);
			}
			default:
				break;
			}
	}
}


