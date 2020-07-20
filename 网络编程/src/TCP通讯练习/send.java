package TCP通讯练习;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class send {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket sc=new Socket(InetAddress.getByName("zhangbin168168"),10000);
		OutputStream os = sc.getOutputStream();
		os.write("hello,tcp我来了".getBytes());
		
		
		InputStream is = sc.getInputStream();
		byte[] bys=new byte[1024];
		int len=is.read(bys);
		String data=new String(bys,0,len);
		System.out.println("客户端："+data);
		sc.close();
		
	}
}
