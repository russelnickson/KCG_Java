public class CalcImp extends java.rmi.server.UnicastRemoteObject implements Calculator{
	public CalcImp() throws java.rmi.RemoteException{
		super();
	}
	public long add (long a, long b) throws java.rmi.RemoteException{
	System.out.println("adding");
	return a + b;
	}
	
}
