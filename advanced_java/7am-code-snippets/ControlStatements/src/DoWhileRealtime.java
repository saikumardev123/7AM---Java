public class DoWhileRealtime {

 public static void main(String[] args) {
	
	 String users[]= {"user1","user2","user3","user4","user5","user6","user7","user8","user9","user10","user11","user12"};
	 
	  int index = 0;
	  int size = users.length; // 12
	  int threshold = 4;
	  int counter=4;
	  int pagination= 1; 
	  int checkPoint = size+1;
	  System.out.println("checkpoint" + checkPoint);
	  // index = 8
	  //counter = 12
	 do {
		
		 if(index < counter) {
			  System.out.println(users[index]); // u1,u2,u3,u4,u5,u6,u7,u8
			  index++;
		 }
		 else {
			 System.out.println("Pagination :"+ pagination+ "completed");
			 counter = counter+threshold;
			 pagination++;
		 }
	// }while(counter != size); // 12 != 12
	 //}while (counter != size);
	 }while(index != size);
	 
}
 
}

/*

   totalUsers = the size of the array 
   
   threshold = 4 
   
   currentUserIndex 
   
   
   
   
   


*/