package ex4;

public class Operaciones {
	// Atributos
	private double a;
	private double b;
	
	// Constructor por defecto
	public Operaciones() {
		this.a = 0;
		this.b = 0;
	}

	// Constructor con los atributos como parametros
	public Operaciones(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	// Metodo para sumar los atributos
	public double suma() {
		double s = 0;
		
		s = a + b;
		
		return s;
	}
	
	// Metodo para restar los atributos
	public double resta() {
		double s = 0;
		
		s = a - b;
		
		return s;
	}
	
	// Metodo para multiplicar los atributos
	public double multiplicacion() {
		double s = 0;
		
		s = a * b;
		
		return s;
	}
	
	// Metodo para dividir los atributos
	public double division() {
		double s = 0;
		
		s = a / b;
		
		return s;
	}
	
	// Metodo para calcular la potencia del primer atributo por el segundo
	public double potencia() {
		double s = 0;
		
		s = Math.pow(a, b);
		
		return s;
	}
	
	// Metodo para calcular la raiz cuadrada del primer atributo
	public double raizCuadrada() {
		double s = 0;
		
		s = Math.sqrt(a);
		
		return s;
	}
	
	// Metodo para calcular la raiz cubica del segundo atributo
	public double raizCubica() {
		double s = 0;
		
		s = Math.cbrt(b);
		
		return s;
	}
}
