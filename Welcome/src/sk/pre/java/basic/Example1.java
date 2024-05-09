package sk.pre.java.basic;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 ex1 = new Example1();
		ex1.test1();
	}
	
	public void test2() {
		for(int i=0;i<9;i++) {
			System.out.println("2X"+(i+1)+"="+(2*(i+1)));

		}

	}
	
	public void test3() {
		System.out.println("test1");
		int number = 1;
		for(int i=0;i<9;i++) {
			System.out.println("2X"+number+"="+(2*number));
			number = number + 1;
		}
	}
		
	public void test1() {
		System.out.println("test1");
		for(int k=2;k<10;k++) {
			int dan = k;
			
			int number = 1;
			for(int i=0;i<9;i++) {
				System.out.println(dan+"X"+number+"="+(dan*number));
				number = number + 1;
			}
		}
		
//		System.out.println("2X2=4");
//		System.out.println("2X3=6");
//		System.out.println("2X4=8");
//		System.out.println("2X5=10");
//		System.out.println("2X6=12");
//		System.out.println("2X7=14");
//		System.out.println("2X8=16");
//		System.out.println("2X9=18");
	}

}
