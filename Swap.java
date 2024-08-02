package work;

public class Swap {

	public static void main(String[] args) {
		int a=67;
		int b=34;
		//b=b-a;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);

	}

}
