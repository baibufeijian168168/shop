package TCP通讯练习;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class receive3 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10099);
		//监听客户端的链接，返回一个对应的socket对象
		Socket s=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new FileWriter("Tcp.txt"));
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		ss.close();
	}
}
