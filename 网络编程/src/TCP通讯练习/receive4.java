package TCP通讯练习;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class receive4 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(20000);
		//监听连接
		Socket accept = ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(accept.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new FileWriter("复制send3.txt"));
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		accept.close();
	}
}
