package ex2;

import ex2.CustomException;

public class AppMain {

	public static void main(String[] args) {
		// Prueba de CustomException
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new CustomException();
		}catch (CustomException e) {
		}
		System.out.println("Programa terminado");
	}

}
