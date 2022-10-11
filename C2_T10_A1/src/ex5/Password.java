package ex5;

public class Password {
	// Atributos
	private int longitud;
	private String contraseña;

	// Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}

	// Constructor con logitud pasado como parámetro
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = crearContraseña();

	}

	// Getters y Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	// Método para generar la contraseña aleatoria
	private String crearContraseña() {
		// Estos serán los valores que usaremos para crear la contraseña random
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		// Declaramos un StringBuilder del tamaño que hemos pasado como parámetro
		StringBuilder sb = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {
			// Por cada pasada del for, se seleccionara de forma aleatoria la posición de un
			// caracter del AlphaNumericString
			int index = (int) (AlphaNumericString.length() * Math.random());
			// Luego lo añadimos al StringBuilder indicando el caracter por la posición
			// anteriormente randomizada
			sb.append(AlphaNumericString.charAt(index));
		}
		// Por último, los pasamos a String y lo definimos como el atributo contraseña
		return sb.toString();
	}
	
	public boolean esFuerte() {
		boolean b = true;
		int contMayus = 0;
		int contMinus = 0;
		int contNum = 0;
		
		for (int i = 0; i < contraseña.length(); i++) {
			if(contraseña.charAt(i) == contraseña.toUpperCase().charAt(i)) {
				contMayus++;
			}
			
			if(contraseña.charAt(i) == contraseña.toLowerCase().charAt(i)) {
				contMinus++;
			}
			
			if(Character.isDigit(contraseña.charAt(i))) {
				contNum++;
			}
		}
		
		if(contMayus > 2 && contMinus > 1 && contNum > 5) {
			b = true;
		}else {
			b = false;
		}
		
		return b;
	}
}
