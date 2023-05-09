
class Table{
	synchronized void printTable(int num) {
		  for(int i=1; i<=10;i++) {
			  System.out.println(num * i);
			  try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  }
		 
	 }
	
}

class ThreadOne extends Thread{
	
	Table t;
	
	 ThreadOne(Table table){
		  this.t = table; 
	 }
	
	@Override
	public void run() {
		 t.printTable(2); 
	}
	
}
class ThreadTwo extends Thread{
	
	Table t;
	 ThreadTwo(Table table){
		  this.t = table; 
	 }
	@Override
	public void run() {
		 t.printTable(5); 
	}
}

public class ThreadSyncExample {
	
	public static void main(String[] args) {
		
		Table t= new Table();
		
		ThreadOne tOne = new ThreadOne(t);
		ThreadTwo tTwo = new ThreadTwo(t);
		tOne.start();
		tTwo.start();
		
		
	}

}
