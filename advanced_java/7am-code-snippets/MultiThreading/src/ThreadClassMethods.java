

class OwnThread extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class ThreadClassMethods {
	
	public static void main(String[] args) {
		
	 OwnThread t1= new OwnThread();
	 t1.setName("Thread - One");
	 t1.setPriority(1);
//	  System.out.println(t1.getState());
//	  System.out.println(t1.getPriority());
	 // t1.start(); // to start the thread
	 OwnThread t2 = new OwnThread();
	 t2.setName("Thread - Two");
	 t2.setPriority(4);
	 OwnThread t3 = new OwnThread();
	 t3.setName("Thread - Three");
	 t3.setPriority(3);
	 t1.start();
	 t2.start();
	 t3.start();
	}

}
