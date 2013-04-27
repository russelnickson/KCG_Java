import java.io.*;
import java.net.*;

class Server{
	public static void main(String[] args) throws Exception{
		String toclient,fromclient;
		ServerSocket socket = new ServerSocket (5000);
		while(true){
			Socket connected = socket.accept();
			BufferedReader infromuser = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader infromclient = new BufferedReader(new InputStreamReader(connected.getInputStream()));
			PrintWriter outtoclient = new PrintWriter(connected.getOutputStream(),true);
			while(true)
				{
				toclient = infromuser.readLine();
				outtoclient.println(toclient);
				fromclient = infromclient.readLine();
				System.out.println(fromclient);
				}
			}
		}
	}