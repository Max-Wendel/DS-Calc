
public class Esqueleto {

	Calculadora calculadora;
	
	public Esqueleto() {
		// TODO Auto-generated constructor stub
		this.calculadora = new Calculadora();
	}
	
	public String soma(String msg) {
		String array[];
		array = msg.split(";");
		System.out.println("SOMA: "+ Double.parseDouble(array[0])+" "+
				Double.parseDouble(array[1]));
		 calculadora.somar(Double.parseDouble(array[0]), 
				 Double.parseDouble(array[1]));
		 return String.valueOf(calculadora.getTotal());
	}
	public String sub(String msg) {
		String array[];
		array = msg.split(";");
		System.out.println("SUBTRAI: "+ Double.parseDouble(array[0])+" "+
				Double.parseDouble(array[1]));
		 calculadora.subtrair(Double.parseDouble(array[0]),
				 Double.parseDouble(array[1]));
		 return String.valueOf(calculadora.getTotal());
	}
	public String mult(String msg) {
		String array[];
		array = msg.split(";");
		System.out.println("MULTIPLICA: "+ Double.parseDouble(array[0])+" "+
				Double.parseDouble(array[1]));
		 calculadora.multiplicar(Double.parseDouble(array[0]), 
				 Double.parseDouble(array[1]));
		 return String.valueOf(calculadora.getTotal());
	}
	public String div(String msg) {
		String array[];
		array = msg.split(";");
		System.out.println("DIVIDE: "+ Double.parseDouble(array[0])+" "+
				Double.parseDouble(array[1]));
		 calculadora.dividir(Double.parseDouble(array[0]),
				 Double.parseDouble(array[1]));
		 return String.valueOf(calculadora.getTotal());
	}
	public String pod(String msg) {
		String array[];
		array = msg.split(";");
		System.out.println("PODER: "+ Double.parseDouble(array[0])+" "+
				Double.parseDouble(array[1]));
		calculadora.exponente(Double.parseDouble(array[0]),
				Double.parseDouble(array[1]));
		return String.valueOf(calculadora.getTotal());
	}
	
}
