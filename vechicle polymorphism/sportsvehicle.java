class sportsvehicle extends vehicle{
	int enginecc;
	public sportsvehicle(String s,int cc){
		super(s);
		enginecc = cc;
		}
	void display(){
		super.display();
		System.out.println("The engine cc of sports vehicle:" + enginecc);
		}
	}