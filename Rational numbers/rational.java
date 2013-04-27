import java.io.*;
import java.math.*;


public class rational
{
	private int num;
	private int den;
	public rational()
	{
		this(0);
	}
	public rational(int x)
	{
		this(x,1);
	}
	public rational(int x, int y)
	{
	int g=gcd(Math.abs(x) , Math.abs(y));
	num = x / g;
	den = Math.abs(y) / g;
	if(y < 0) num = -num;
	}
	public rational add (rational r)
	{
		return new rational (this.num * r.den + this.den * r.num , this.den * r.den);
	}
	public rational sub (rational r)
	{
		return new rational (this.num * r.den - this.den * r.num , this.den * r.den);
	}
	public rational mul (rational r)
	{
		return new rational (this.num * r.num,this.den * r.den);
	}
	public rational div (rational r)
	{
		return new rational (this.num * r.den,this.den * r.num);
	}
	
	private int gcd (int x , int y)
	{
		int r=x%y;
		while(r!=0)
		{
			x=y;
			y=r;
 			r=x%y;
		}
		return y;
	}
	public String toString()
	{
	if(den == 1)
		return " "+num;
	else
		return num + "/" + den;
	}

public static void main(String args[]) throws IOException
{
	int numerator,denominator,choice;
	char cont = 'y';
	System.out.println("Enter the numerator and the denominator of rational no. A.. :");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	numerator = Integer.parseInt(br.readLine());
	denominator = Integer.parseInt(br.readLine());
	rational a = new rational(numerator,denominator);
	System.out.println("Enter the numerator and the denominator of rational no. B.. :");
	numerator = Integer.parseInt(br.readLine());
	denominator = Integer.parseInt(br.readLine());
	rational b = new rational(numerator,denominator);
	do
	{
		System.out.println("\n/*** MAIN MENU ***/");
		System.out.println("1. ADD");
		System.out.println("2. SUBRACT");
		System.out.println("3. MULTIPLY");
		System.out.println("4. DIVIDE");
		System.out.println("5. EXIT");
		System.out.println("Enter choice [1-5].. :");
		choice =Integer.parseInt(br.readLine());
		switch (choice)
		{
		case 1 :
			System.out.println(a + " + " + b + " = " + a.add(b));
			break;
		case 2 :
			System.out.println(a + " - " + b + " = " + a.sub(b));
			break;
		case 3 :
			System.out.println(a + " * " + b + " = " + a.mul(b));
			break;
		case 4 :
			System.out.println(a + " / " + b + " = " + a.div(b));
			break;
		case 5 :
			cont = 'N';
			break;
		}
	}while(cont == 'y');
}

}

































