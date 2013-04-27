import java.io.*;
import java.net.*;

class Client{
	public static void main(String[] args) throws Exception{
		String toserver,fromserver;
		Socket Clientsocket = new Socket ("localhost",5000);
		while(true){
			
			BufferedReader infromuser = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader infromserver = new BufferedReader(new InputStreamReader(Clientsocket.getInputStream()));
			PrintWriter outtoserver = new PrintWriter(Clientsocket.getOutputStream(),true);
			while(true)
				{
				toserver = infromuser.readLine();
				outtoserver.println(toserver);
				fromserver = infromserver.readLine();
				System.out.println(fromserver);
				}
			}
		}
	}