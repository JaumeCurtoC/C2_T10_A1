package ex3;

import java.util.Random;

public class randomNum {
	// Atributo
	private int numero;

	// Constructor por defecto
	public randomNum() {
		Random r = new Random();
		this.numero = r.nextInt(999);
	}
	
	//Getter
	public int getNumero() {
		return numero;
	}
}
