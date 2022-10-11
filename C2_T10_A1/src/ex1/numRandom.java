package ex1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class numRandom {
	// Atributo
	private int numero;

	// Constructor por defecto
	public numRandom() {
		Random r = new Random();
		this.numero = r.nextInt(500);
	}

	// Este método pide al usuario adivinar el número generado de forma aleatoria
	public void adivinarNum() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;

		do {	
			// Control de expeciones
			try {
				System.out.println("Adivina el número (1-500)");
				num = sc.nextInt();

				if (num < numero) {
					System.out.println("Es más grande");
				} else if (num > numero) {
					System.out.println("Es más pequeño");
				}
				i++;

				// En caso de que no se introduja un int, pasaremos por el catch para tratar el
				// error
			} catch (InputMismatchException e) {
				System.out.println("El tipo de dato es incorrecto");
				// Este nextLine es MUY importante, sin él, el programa entraría en un loop
				// infinito si hubiera un error
				sc.nextLine();
				i++;
			}

		} while (num != numero);

		// Salida de datos
		System.out.println("Correcto! El número era " + numero);
		System.out.println("Intentos realizados: " + i);

	}
}
