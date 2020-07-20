package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDP接收数据 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(10086);
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys,bys.length);
		ds.receive(dp);
		byte[] datas = dp.getData();
		String dataString=new String(datas,0,dp.getLength());
		System.out.println("数据shi "+dataString);
		ds.close();
	}
}
