package TCP通讯;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP接收数据 {
	public static void main(String[] args) throws IOException {
		ServerSocket sc=new ServerSocket(10000);
		Socket accept = sc.accept();
		InputStream is= accept.getInputStream();
		byte[] bys=new byte[1024];
		int len=is.read(bys);
		String s=new String (bys,0,len);
		System.out.println("数据是"+s);
		sc.close();
		
	}
}
