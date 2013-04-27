import java.io.*;
class Linklist{
	Link first;
	Linklist(){
		first = null;
	}
	void cons(int d){
		Link newlink = new Link(d);
		newlink.next = first;
		first = newlink;
	}
	Link car(){
		Link temp = first;
		first = first.next;
		System.out.println(temp);
		return temp;
	}
	public String toString(){
		String str =  "";
		Link current = first;
		if(current == null)
			System.out.println("Empty string...");
		while(current != null){
			str += "{" + current.data + "}";
			current = current.next ;
		}
		return str;
	}
	public static void main(String[] args) throws Exception {
		Linklist list = new Linklist();
		int number, choice;
		while(true){
		   System.out.println("Enter choice... [1-4]");
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   choice = Integer.parseInt(br.readLine());
		   switch(choice)
			{
			case 1:
				System.out.println("Enter data:");
				number = Integer.parseInt(br.readLine());
				list.cons(number);
				System.out.println(list);
				break;
			case 2:
				list.car();
				System.out.println(list);
				break;
			case 3:
				System.out.println(list);
				break;
			case 4:
				System.exit(0);
			}
		   }
	}
}

		   



