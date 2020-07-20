package UDP练习;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(10086);
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys,bys.length);
		ds.receive(dp);
		String dataString=new String(dp.getData(),0,dp.getLength());
		System.out.println(dataString);
		ds.close();
	}
}
