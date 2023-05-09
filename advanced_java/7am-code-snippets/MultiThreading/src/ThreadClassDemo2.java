
class MyThread extends Thread {
	 @Override
	public void run() {
		 System.out.println(Thread.currentThread().getName());
	}
}



public class ThreadClassDemo2 {

	public static void main(String[] args) {
		
		MyThread t1= new MyThread();
		
		t1.start();
		
		
MyThread t2= new MyThread();
		
		t2.start();
		
MyThread t3= new MyThread();
		
		t3.start();
		
//		System.out.println(t1.getState());
//		
//		t1.run();
//		
//		System.out.println(t1.getState());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		System.out.println(Thread.activeCount());
	
		
		
	}
	
}
