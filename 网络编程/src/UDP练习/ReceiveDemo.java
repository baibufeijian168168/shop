package UDP练习;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(1086);
		byte[] bys=new byte[1024];
		while(true) {
		DatagramPacket dp=new DatagramPacket(bys,bys.length);
		ds.receive(dp);
		System.out.println("数据是"+new String(dp.getData(),0,dp.getLength()));
		}
//		ds.close();
	}
}
