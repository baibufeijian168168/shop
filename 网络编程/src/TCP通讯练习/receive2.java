package TCP通讯练习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class receive2 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10000);
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		while((str=br.readLine())!=null) {
			
			System.out.println(str);
			if("886".equals(str)) {
				break;
			}
		}
		s.close();
	}
}
