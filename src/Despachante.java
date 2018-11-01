
public class Despachante {

	Esqueleto esqueleto;
	
	public Despachante() {
		// TODO Auto-generated constructor stub
		this.esqueleto=new Esqueleto();
	}
	
	public String invoke(String msg) {
		String array[];
		array = msg.split(";");
		String val = array[0]+";"+array[2];
		String response = "";

		if (array[1].equals("*")) {

			System.out.println("DESPACHANDO: "+Double.parseDouble(array[0])+" * "+
					Double.parseDouble(array[2]));

			response += this.esqueleto.mult(val);
				
		}else if (array[1].equals("/")) {

			System.out.println("DESPACHANDO: "+Double.parseDouble(array[0])+" / "+
					Double.parseDouble(array[2]));

			response += this.esqueleto.div(val);

		}else if (array[1].equals("+")) {

			System.out.println("DESPACHANDO: "+Double.parseDouble(array[0])+" + "+
					Double.parseDouble(array[2]));

			response += this.esqueleto.soma(val);

		}else if (array[1].equals("-")) {

			System.out.println("DESPACHANDO: "+Double.parseDouble(array[0])+" - "+
					Double.parseDouble(array[2]));

			response += this.esqueleto.sub(val);
			
		}else if (array[1].equals("^")) {
			
			System.out.println("DESPACHANDO: "+Double.parseDouble(array[0])+" ^ "+
					Double.parseDouble(array[2]));
					
			response += this.esqueleto.pod(val);
		
		}
	
		return response;
	}
	
}
