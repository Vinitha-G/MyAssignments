package week1.day2;

public class Calculator {

public void addNumbers(int a,int b) {
		
		System.out.println("Addition value"  +  ( a+b));
	}
		public void subractNum(int a,float b,int c) {
			 
			
			System.out.println("subraction value"  +  (a-b-c));
	}

	public static void main(String[] args) {
		Calculator prob=new Calculator();
	prob.addNumbers(3,5);
	prob.subractNum(3,5.6f,10);
	}

}
