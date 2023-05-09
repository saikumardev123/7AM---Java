

@FunctionalInterface
interface Remote{
	   public void onOff();
	   
}
//
//class RemoteImpl implements Remote{
//
//	@Override
//	public void onOff() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//}
//
//
//class RemoteImpl2 implements Remote{
//
//	@Override
//	public void onOff() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//}

public class LambdaExpressionsDemo {
	
	 public static void main(String[] args) {
		
		   // Lambda Expression
		 Remote remote = () -> System.out.println("implementation 1");
		 Remote remote2= () -> System.out.print("Implementation 2");
		 
		 remote.onOff();
		 remote2.onOff();
	}

}
