import java.io.*;
class polymex{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		vehicle v = new vehicle();
		sportsvehicle sv = new sportsvehicle("BMW",6000);
		passengervehicle pv = new passengervehicle("RR",6);
		System.out.println("1.Sports vehicle \t2.Passenger vehicle");
		System.out.println("Enter ur choice : ");
		choice = Integer.parseInt(br.readLine());
		switch(choice)
			{
			case 1: v = sv;break;
			case 2: v = pv;break;
			}
		v.display();	
		}
	}