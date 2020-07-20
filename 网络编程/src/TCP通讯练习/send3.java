package TCP通讯练习;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class send3 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket sc=new Socket(InetAddress.getByName("zhangbin168168"),10099);
//		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
		String s;
		while((s=bf.readLine())!=null) {
			bw.write(s);
			bw.newLine();
			bw.flush();
			if("886".equals(s)) {
				break;
			}
		}
		sc.close();
	}
}
