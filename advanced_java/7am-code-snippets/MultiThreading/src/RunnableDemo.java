
class CustomThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		 CustomThread customThread = new CustomThread();
		
		  Thread t1= new Thread(customThread);
		  
		  t1.start();
		 
		
	}

}
