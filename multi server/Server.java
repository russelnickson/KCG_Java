import java.io.*;
import java.net.*;
import java.awt.event.*;

class Server{
	public static void main(String[] args) throws Exception{
		String toclient;
		ServerSocket socket = new ServerSocket (5000);
		while(true){
			ClientWorker w = new ClientWorker(socket.accept());
			Thread t = new Thread(w);
			t.start();			
			
			}
		}
	}
class ClientWorker extends Server implements Runnable{
 	Socket client;
	ClientWorker (Socket c){
		client = c;
		}		
	public void run(){
		try{
			String fromclient;
			BufferedReader infromclient = new BufferedReader(new InputStreamReader(client.getInputStream()));
			while(true){
				fromclient = infromclient.readLine();
				System.out.println(fromclient);
				}
			}catch(Exception e){}
		}
	}