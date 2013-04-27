import java.rmi.*;
public class Server {
	public static void main(String args[]) throws Exception{
		Calculator c = new CalcImp();
		Naming.rebind("rmi://localhost:1099/CalculatorService", c);
	}
}
