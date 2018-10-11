import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
public class ClienteTcp {
	DataOutputStream out;
	DataInputStream in;
	Socket s = null;
	int serverPort = 7896;
	
	public ClienteTcp() {
		// TODO Auto-generated constructor stub
	}
	
	public void rodar () {
		// arguments supply message and hostname
		try{
			s = new Socket("127.0.0.1", serverPort);    
			in = new DataInputStream( s.getInputStream());
			out =new DataOutputStream( s.getOutputStream());
		
			
			
		}catch (UnknownHostException e){System.out.println("Socket:"+e.getMessage());
		}catch (EOFException e){System.out.println("EOF:"+e.getMessage());
		}catch (IOException e){System.out.println("readline:"+e.getMessage());
		}
	}
	
	
	public void enviar(String msg) throws IOException {
		out.writeUTF(msg);      	// UTF is a string encoding see Sn. 4.4q		
	}
	
	public String getResposta() throws IOException {

        String data = "";

        data = in.readUTF();
        return String.valueOf(data);

	}
	
	public void close() throws IOException {
		s.close();
	}
	
	
	
}