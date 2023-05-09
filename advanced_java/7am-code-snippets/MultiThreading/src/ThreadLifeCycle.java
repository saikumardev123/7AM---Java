
 class T extends Thread{
	 @Override
	public void run() {
		 System.out.println(Thread.currentThread().getName());
		 try {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is executed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThreadLifeCycle {

	 public static void main(String[] args) {
		
		      T t1= new T();
		      T t2= new T();
		      
		      System.out.println("T1 before start:"+t1.getState());
		      System.out.println("T2 before start:"+t2.getState());
		      
		      t1.start();
		      t2.start();
		      
		      System.out.println("T1 after start:"+t1.getState());
		      System.out.println("T2 after start:"+t2.getState());
		      
		 
	}
	
}
