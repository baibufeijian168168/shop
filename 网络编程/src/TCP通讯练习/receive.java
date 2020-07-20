package TCP通讯练习;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class receive {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10000);
		Socket s = ss.accept();
		InputStream gis = s.getInputStream();
		byte[] bys=new byte[1024];
		int i = gis.read(bys);
		String str=new String(bys,0,i);
		System.out.println("服务器"+str);
		
		OutputStream os = s.getOutputStream();
		os.write("数据已经收到".getBytes());
//		s.close();
		ss.close();
	}
}
