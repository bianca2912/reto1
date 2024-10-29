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
			System.out.println("Elige la operaci�n:");
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
					System.out.println("N�mero incorrecto.");
					valido = false;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("N�mero no reconocido.");
				valido = false;
			}
		} while (!valido);
		
		do {
			System.out.println("Introduce el primer n�mero: ");
			String input = scanner.nextLine();
			try {
				a = Integer.parseInt(input);
				valido = true;
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("N�mero no reconocido.");
				valido = false;
			}
		} while (!valido);
		
		do {
			if(menu>=5 && menu<=8) {break;}
			System.out.println("Introduce el segundo n�mero: ");
			String input = scanner.nextLine();
			try {
				b = Integer.parseInt(input);
				valido = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("N�mero no reconocido.");
				valido = false;
			}
		
		} while (!valido);
		scanner.close();
		
		
		
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
				System.out.println ("La multiplicaci�n  entre: " + a + " x " + b + " es: " + resultado);
				break;
			}
			case 4: {
				double resultado = funcion1.dividir(a, b);
				System.out.println("La divisi�n de " + a + " entre " + b + " es: " + resultado);
				break;
				}
			case 5:{
				boolean valida=funcion2.par(a);
				System.out.println("El numero "+a+" es par? "+valida);
				break;
				}
			case 6:{
				boolean valida=funcion2.impar(a);
				System.out.println("El numero "+a+" es impar? "+valida);
				break;
			}
			case 7:{
				boolean valida=funcion2.positivo(a);
				System.out.println("El numero "+a+" es positivo? "+valida);
				break;
			}
			case 8:{
				boolean valida=funcion2.negativo(a);
				System.out.println("El numero "+a+" es negativo? "+valida);
				break;	
			}
		
			
			default:
				break;
			}
			
	}
}


