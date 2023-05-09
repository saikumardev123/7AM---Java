
public class ForLoopDemo {
	public static void main(String[] args) {
		String users[]= {"user1","user2","user3","user4","user5"};
		 for(int index = 0; index < users.length; index++) {
			  if(index == 3) {
				  continue;
			  }
//			 if(users[index].contentEquals("user3") || users[index].contentEquals("user2") ) {
//				 continue;
//			 }
			 System.out.println(users[index]); 
		 } 
	}
}
