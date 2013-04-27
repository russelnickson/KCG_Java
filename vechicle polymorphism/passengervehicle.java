class passengervehicle extends vehicle{
	int seats;
	public passengervehicle(String s,int st){
		super(s);
		seats = st;
		}
	void display(){
		super.display();
		System.out.println("No of seats in the passenger vehicle is : " + seats);
		}
	}