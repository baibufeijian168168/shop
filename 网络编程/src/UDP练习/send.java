package UDP练习;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class send {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		byte[] byt="我是张兵".getBytes();
		DatagramPacket dp=new DatagramPacket(byt,byt.length,InetAddress.getByName("zhangbin168168"),10086);
		
		ds.send(dp);
		ds.close();
		
	}
}
