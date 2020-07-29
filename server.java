import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


public class server {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		DatagramSocket ds = new DatagramSocket(9999);
		Scanner scan = new Scanner(System.in);
		@SuppressWarnings("unused")
		account acc = new account();
		while(true) {
		// TODO Auto-generated method stub
			
			
			byte[] b = new byte[1024];
			DatagramPacket dp = new DatagramPacket(b, b.length);
			ds.receive(dp);
			
			String str = new String(dp.getData());
			
			int num = Integer.parseInt(str.trim());
			byte[] b2 = new byte[1024];
			if(num == 1) {
				System.out.println(acc.getfirstName());
				b2 = "".getBytes();
			}
			else if(num == 2) {
				
				String name = scan.nextLine();
				acc.setfirstName(name);
				System.out.println(acc.getfirstName());
				b2 = (name).getBytes();
			}
			
			InetAddress ia = InetAddress.getLocalHost();
			DatagramPacket dp1 = new DatagramPacket(b2, b2.length, ia, dp.getPort());
			
			ds.send(dp1);
		}
	}

}
