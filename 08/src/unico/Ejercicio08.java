package unico;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double solucion1;
		double solucion2;
		
		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax2 + bx + c = 0");
		System.out.print("Por favor, introduzca el valor de a: ");
		a = Double.parseDouble(teclado.nextLine());
		System.out.print("Ahora introduzca el valor de b: ");
		b = Double.parseDouble(teclado.nextLine());
		System.out.print("Por último introduzca el valor de c: ");
		c = Double.parseDouble(teclado.nextLine());
		
		solucion1 = (-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/2;
		solucion2 = (-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/2;
		
		
		}
}
	