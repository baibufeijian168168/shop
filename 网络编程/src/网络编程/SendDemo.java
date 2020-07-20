package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		while((line=br.readLine())!=null) {
			
		}
	}
}
