package UDP练习;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDP通信程序练习_接收 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(12345);
		
		while(true) {
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys,bys.length);
		ds.receive(dp);
		String str=new String(dp.getData(),0,dp.getLength());
		System.out.println(str);
		}
	}
}
