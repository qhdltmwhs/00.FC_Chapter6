package ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {

		/*
		 * BufferedReader의 예시로 소켓이 연결상태가 아니므로 
		 * java.net.SocketException: Socket is not connected
		 */
		Socket socket = new Socket();

		BufferedReader br = new BufferedReader((new InputStreamReader(socket.getInputStream())));

		br.read();
		br.readLine(); // newLine전까지 한줄씩 읽어온다.

	}

}
