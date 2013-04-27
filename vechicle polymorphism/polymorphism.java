import java.io.*;

class vehicle{
	String name;
	public vehicle(String s){
		name = s;
		}
	void display(){
		System.out.println("The name of the vehicle is : " + name);
		}
	}
class sportsvehicle extends vehicle{
	int enginecc;
	public sportsvehicle(String s,int cc){
		super(s);
		enginecc = cc;
		}
	void display(){
		System.out.println("SPORTS VEHICLE");
		super.display();
		System.out.println("The engine cc of sports vehicle:" + enginecc);
		}
	}
class passengervehicle extends vehicle{
	int seats;
	public passengervehicle(String s,int st){
		super(s);
		seats = st;
		}
	void display(){
		System.out.println("PASSENGER VEHICLE");
		super.display();
		System.out.println("No of seats in the passenger vehicle is : " + seats);
		}
	}



class polymorphism{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		vehicle v = new vehicle("Benz");
		sportsvehicle sv = new sportsvehicle("BMW",6000);
		passengervehicle pv = new passengervehicle("RR",6);
		System.out.println("1.Sports vehicle \t2.Passenger vehicle \t3.Vehicle");
		System.out.println("Enter ur choice : ");
		choice = Integer.parseInt(br.readLine());
		switch(choice)
			{
			case 1: v = sv;		break;
			case 2: v = pv;		break;
			}
		v.display();	
		}
	}