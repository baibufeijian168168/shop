package TCP通讯练习;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10001);
		//监听客户端的连接，返回一个对应的socket对象
		while(true) {
		Socket accept = ss.accept();
		new Thread(new ServerThread(accept)).start();
		}
	}
}
