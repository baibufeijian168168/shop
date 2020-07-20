package TCP通讯练习;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerThread implements Runnable{
	private Socket s;
	public ServerThread(Socket s) {
		this.s=s;
	}
	@Override
	public void run() {
		//接收输入写到文本文件
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//			BufferedWriter bw=new BufferedWriter(new FileWriter("myNet.txt"));
			int count=0;
			File file=new File("myNet[i].txt");
			while(file.exists()) {
				count++;
				file=new File("myNet[i].txt");
			}
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));
			String line;
			while((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			//给出反馈
			BufferedWriter bwserver=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bwserver.write("文件上传成功");
			bwserver.newLine();
			bwserver.flush();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
