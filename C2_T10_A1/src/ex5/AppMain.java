package ex5;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n del Scanner
		Scanner sc = new Scanner(System.in);
		
		// Introducci�n de datos y creaci�n del array de Passwords
		System.out.println("Cuantas contrase�as quieres crear?");
		int ps = sc.nextInt();
		Password[] password = new Password[ps];
		
		// Petici�n de datos para el atributo longitud y el array boolean
		System.out.println("Como de largas ser�n las contrase�as?");
		int lg = sc.nextInt();
		
		boolean[] bls = new boolean[ps];
		
		// Creaci�n de las contrase�as, validaci�n del m�todo esFuerte y salida de datos
		for (int i = 0; i < password.length; i++) {
			password[i] = new Password(lg);
			bls[i] = password[i].esFuerte();
			System.out.println(password[i].getContrase�a()+" "+bls[i]);
		}
		
	}

}
