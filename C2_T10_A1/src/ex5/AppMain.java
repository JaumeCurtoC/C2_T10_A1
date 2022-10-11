package ex5;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		// Declaración del Scanner
		Scanner sc = new Scanner(System.in);
		
		// Introducción de datos y creación del array de Passwords
		System.out.println("Cuantas contraseñas quieres crear?");
		int ps = sc.nextInt();
		Password[] password = new Password[ps];
		
		// Petición de datos para el atributo longitud y el array boolean
		System.out.println("Como de largas serán las contraseñas?");
		int lg = sc.nextInt();
		
		boolean[] bls = new boolean[ps];
		
		// Creación de las contraseñas, validación del método esFuerte y salida de datos
		for (int i = 0; i < password.length; i++) {
			password[i] = new Password(lg);
			bls[i] = password[i].esFuerte();
			System.out.println(password[i].getContraseña()+" "+bls[i]);
		}
		
	}

}
