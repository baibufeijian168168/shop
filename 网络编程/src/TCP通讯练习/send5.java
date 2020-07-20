package TCP通讯练习;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class send5 {
	public static void main(String[] args) throws IOException {
		Socket sc=new Socket("zhangbin168168",10001);
		BufferedReader br=new BufferedReader(new FileReader("src\\TCP通讯练习\\send4.java"));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		sc.shutdownOutput();
		
		
		BufferedReader client=new BufferedReader(new InputStreamReader(sc.getInputStream()));
		String sss=client.readLine();
		System.out.println("服务器反馈的数据"+sss);
		br.close();
		sc.close();
	}
}
