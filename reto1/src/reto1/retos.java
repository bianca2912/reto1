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
				break;
			}
			case 2: {
				int resultado = funcion1.restar(a, b);
				System.out.println ("La resta  entre: " + a + " - " + b + " es: " + resultado);
				break;
			}
			case 3: {
				int resultado = funcion1.multiplicar(a, b);
				System.out.println ("La multiplicación  entre: " + a + " x " + b + " es: " + resultado);
				break;
			}
			case 4: {
				double resultado = funcion1.dividir(a, b);
				System.out.println("La división de " + a + " entre " + b + " es: " + resultado);
				break;
				}
			case 5:{
				boolean valida=funcion2.par(a);
				System.out.println("El numero "+a+" es par? "+valida);
				boolean validab=funcion2.par(b);
				System.out.println("El numero "+b+" es par? "+validab);
				break;
				}
			case 6:{
				boolean valida=funcion2.impar(a);
				System.out.println("El numero "+a+" es impar? "+valida);
				boolean validab=funcion2.impar(b);
				System.out.println("El numero "+b+" es impar? "+validab);
				break;
			}
			case 7:{
				boolean valida=funcion2.positivo(a);
				System.out.println("El numero "+a+" es positivo? "+valida);
				boolean validab=funcion2.positivo(b);
				System.out.println("El numero "+b+" es positivo? "+validab);
				break;
			}
			case 8:{
				boolean valida=funcion2.negativo(a);
				System.out.println("El numero "+a+" es negativo? "+valida);
				boolean validab=funcion2.negativo(b);
				System.out.println("El numero "+b+" es negativo? "+validab);
				break;	
			}
			
			
			default:
				break;
			}
	}
}


