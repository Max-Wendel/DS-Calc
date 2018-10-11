import java.io.IOException;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		Proxy proxy = new Proxy();



        System.out.println(proxy.soma(2.0,3.0));
        System.out.println(proxy.sub(10.0,3.0));
        System.out.println(proxy.mult(2.0,2.0));
        System.out.println(proxy.div(8.0,4.0));

		System.out.println(proxy.soma(2.0,7.0));
		System.out.println(proxy.sub(1.0,30.0));
		System.out.println(proxy.mult(6.0,2.0));
		System.out.println(proxy.div(45.0,5.0));

		System.out.println(proxy.soma(21.0,3.0));
		System.out.println(proxy.sub(5.0,3.0));
		System.out.println(proxy.mult(67.0,2.0));
		System.out.println(proxy.div(9.0,4.0));

		System.out.println(proxy.soma(2.0,8.0));
		System.out.println(proxy.sub(10.0,5.0));
		System.out.println(proxy.mult(32.0,2.0));
		System.out.println(proxy.div(48.0,7.0));

	}
	
}
