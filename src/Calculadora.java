public class Calculadora {

	private double total;

	public Calculadora() {
		this.total = 0.0;
		// TODO Auto-generated constructor stub
	}


	public void somar(double a,double b) { this.total = a + b;}

	public void subtrair(double a,double b) {
		this.total = a - b;
	}

	public void dividir(double a,double b) {
		this.total = a / b;
	}

	public void multiplicar(double a,double b) { this.total = a * b;}

//
	
	public void calcIdade(String array[]) {
		String ano = array[1]+array[2]+array[3]+array[4];
		this.total = 2018 - (Double.parseDouble(ano));
	}
	
	
	public double getTotal() {
		return this.total;
	}

}
