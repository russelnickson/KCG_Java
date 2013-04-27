import java.io.*;

class currency {
	int m1,m2;
	public currency(int x,int y){
		m1=x;
		m2=y;
		}
}
class rupee extends currency {
	int r1,r2;
	public rupee(int x,int y){
		super(x,y);
		}
}
class dollar extends currency {
	int d1,d2;
	public dollar(int x,int y){
		super(x,y);
		}
}
class test implements Serializable{
	int dm1,dm2,rm1,rm2;
	public test(dollar d,rupee r){
		dm1 = d.m1;
		dm2 = d.m2;
		rm1 = r.m1;
		rm2 = r.m2;
		}
	}
