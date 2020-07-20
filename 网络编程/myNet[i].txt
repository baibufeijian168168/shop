package TCP通讯练习;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class send4 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket c=new Socket(InetAddress.getByName("zhangbin168168"),20000);
		BufferedReader bf=new BufferedReader(new FileReader("src\\TCP通讯练习\\send3.java"));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(c.getOutputStream()));
		String line;
		while((line=bf.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bf.close();
		c.close();
	}
}
