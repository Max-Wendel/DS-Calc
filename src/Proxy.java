
import java.io.IOException;

public class Proxy {

	ClienteTcp clienteTcp;
	
	public Proxy() {
		this.clienteTcp = new ClienteTcp();
		this.clienteTcp.rodar();
	}
	
	public double soma(double a ,double b) throws IOException {
		String msg = String.valueOf(a + ";+;" + b);
		this.clienteTcp.enviar(msg);
		System.out.println("\nEnviado");
		return Double.parseDouble(this.clienteTcp.getResposta());
		
	}
	public double sub(double a ,double b) throws NumberFormatException, IOException {
		String msg = a + ";-;" + b;
		this.clienteTcp.enviar(msg);
		System.out.println("\nEnviado");
		return Double.parseDouble(this.clienteTcp.getResposta());
		
	}
	public double mult(double a ,double b) throws NumberFormatException, IOException {
		String msg = a + ";*;" + b;
		this.clienteTcp.enviar(msg);
		System.out.println("\nEnviado");
		return Double.parseDouble(this.clienteTcp.getResposta());
	
	}
	public double div(double a ,double b) throws NumberFormatException, IOException {
		String msg = a + ";/;" + b;
		this.clienteTcp.enviar(msg);
		System.out.println("\nEnviado");
		return Double.parseDouble(this.clienteTcp.getResposta());
	}
	public double pod(double a ,double b) throws NumberFormatException, IOException {
		String msg = a + ";^;" + b;
		this.clienteTcp.enviar(msg);
		System.out.println("\nEnviado");
		return Double.parseDouble(this.clienteTcp.getResposta());
	}
	
	public void close() throws IOException{
		this.clienteTcp.close();
	}
	
}
