package ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		// Declaración del Scanner
		Scanner sc = new Scanner(System.in);
		try {
			// Recogida de datos por parte del usuario
			System.out.println("Indique el primer valor:");
			double a = sc.nextDouble();
			System.out.println("Indique el segundo valor:");
			double b = sc.nextDouble();
			
			// Creación de la clase Operaciones
			Operaciones o = new Operaciones(a, b);
			
			// Salida de datos con los métodos
			System.out.println("Suma: "+o.suma());
			System.out.println("Resta: "+o.resta());
			System.out.println("Multiplicacion: "+o.multiplicacion());
			System.out.println("Division: "+o.division());
			System.out.println("Potencia: "+o.potencia());
			System.out.println("Raiz Cuadrada de 10: "+o.raizCuadrada());
			System.out.println("Raiz Cuadrada de 5: "+o.raizCubica());
			
			// Control de Excepciones
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		

	}

}
