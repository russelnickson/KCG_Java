import java.rmi.Naming;
public class Client {
	public static void main(String arg[])throws Exception{
		Calculator c = (Calculator)Naming.lookup("rmi://localhost/CalculatorService");
		System.out.println(c.add(4, 5));
	}

}
