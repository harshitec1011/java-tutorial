package pOperaterDemo;

public class POperaterDemo {
	public static void main(String[] args)
	{
		int m=6,n=4;
		int r1=m+n;
		int r2=m-n;
		double r3=m/n;// the divide operator will let the output be in int form so specifically do type casting using double
		double r4=(double)m/n;
		int r5=m%n;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}

}
