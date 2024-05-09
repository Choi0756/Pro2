package sk.pre.java.day9;

public class TestThread {
	
	public void test4() {
		//Runnable interface를 이용해서 Thread의 작업을 오버라이드 하고
		//해당 쓰레드에 적용시키시오.
		//Thread t = new Thread(new HisThread());
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++) {
					System.out.println(i);
					System.out.println("매개변수안의 익명객체");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
	}
	public void test1() {
		Thread t = new Thread();
		t.start();
	}
	public void test2() {
		Thread t = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("익명 객체");
			}
		};
		t.start();
	}
	public void test3() {
		//Thread t = new MyThread();
		Thread t = new YourThread();
		t.start();
		//t.run();
	}
	
	class YourThread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("inner class");
		}
	}
}
