package TCP通讯练习;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class receive5 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10001);
		Socket s = ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new FileWriter("send4.txt"));
		String line;
		while((line=br.readLine())!=null) {
			
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		BufferedWriter bbw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bbw.write("文件上传成功");
		bbw.newLine();
		bbw.flush();
		
		bw.close();
		s.close();
	}
}
