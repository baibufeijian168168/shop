package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class inetAddress {
	public static void main(String[] args) throws IOException {
//		InetAddress address=InetAddress.getByName("192.168.43.122");
//		String name = address.getHostName();
//		String ip = address.getHostAddress();
//		System.out.println("主机名"+name);
//		System.out.println(ip);
		DatagramSocket ds=new DatagramSocket();
		byte[] bys="hello world 我来了".getBytes();
		InetAddress address=InetAddress.getByName("192.168.43.122");
		 DatagramPacket dp=new DatagramPacket(bys,bys.length,address,10086);
		ds.send(dp);
		
		ds.close();
	}
}
