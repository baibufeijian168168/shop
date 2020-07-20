package TCP通讯;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP发送数据 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket sc=new Socket(InetAddress.getByName("zhangbin168168"),10000);
		//Socket sc=new Socket("zhangbin168168",10000);
		OutputStream stream = sc.getOutputStream();
		stream.write("hello world,我来了".getBytes());
		sc.close();
	}
}
