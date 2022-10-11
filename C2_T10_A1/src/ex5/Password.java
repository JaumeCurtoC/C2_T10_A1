package ex5;

public class Password {
	// Atributos
	private int longitud;
	private String contrase�a;

	// Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contrase�a = "";
	}

	// Constructor con logitud pasado como par�metro
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = crearContrase�a();

	}

	// Getters y Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	// M�todo para generar la contrase�a aleatoria
	private String crearContrase�a() {
		// Estos ser�n los valores que usaremos para crear la contrase�a random
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		// Declaramos un StringBuilder del tama�o que hemos pasado como par�metro
		StringBuilder sb = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {
			// Por cada pasada del for, se seleccionara de forma aleatoria la posici�n de un
			// caracter del AlphaNumericString
			int index = (int) (AlphaNumericString.length() * Math.random());
			// Luego lo a�adimos al StringBuilder indicando el caracter por la posici�n
			// anteriormente randomizada
			sb.append(AlphaNumericString.charAt(index));
		}
		// Por �ltimo, los pasamos a String y lo definimos como el atributo contrase�a
		return sb.toString();
	}
	
	public boolean esFuerte() {
		boolean b = true;
		int contMayus = 0;
		int contMinus = 0;
		int contNum = 0;
		
		for (int i = 0; i < contrase�a.length(); i++) {
			if(contrase�a.charAt(i) == contrase�a.toUpperCase().charAt(i)) {
				contMayus++;
			}
			
			if(contrase�a.charAt(i) == contrase�a.toLowerCase().charAt(i)) {
				contMinus++;
			}
			
			if(Character.isDigit(contrase�a.charAt(i))) {
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
