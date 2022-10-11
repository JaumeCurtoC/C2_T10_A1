package ex2;

public class CustomException extends Exception {
	// Atributos
	private int codigoException;

	// Constructores
	public CustomException(int codigoError) {
		super();
		this.codigoException = codigoError;
	}

	public CustomException() {
		super();
		System.out.println(getMessage());
	}

	// Mensaje a devolver
	@Override
	public String getMessage() {
		String mensaje = "Excepcion capturada con mensaje: Esto es un objeto Exception";
		return mensaje;
	}
	
	// Este metodo indica si un número es par o impar dependiendo del código de excecpcion que le pasemos
	public String parImpar() {
		String m = "";

		switch (codigoException) {
		case 0:
			m = "Es par";
			break;
		case 1:
			m = "Es impar";
			break;

		default:
			m = "Error";
			break;
		}
		
		return m;
	}

}
