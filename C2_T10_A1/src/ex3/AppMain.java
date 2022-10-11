package ex3;

import ex2.CustomException;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de Variables
		randomNum n = new randomNum();
		
		System.out.println("Generando n�mero aleatorio...");
		System.out.println("El numero aleatorio generado es: "+n.getNumero());
		
		// Condicional para identificar el tipo de n�mero
		try {
			if(n.getNumero()%2 == 0) {
				throw new CustomException(0);
			}else {
				throw new CustomException(1);
			}
		}catch(CustomException e) {
			// Salida de datos
			System.out.println(e.parImpar());
		}
		
	}

}
