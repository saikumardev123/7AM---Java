
public class InstanceVariablesDemo {
	
	  int age=21;
	  String name= "kiran";
	  String email = "kiran@gmail.com";  
	
	
	public static void main(String[] args) {
		
		  InstanceVariablesDemo obj1 = new InstanceVariablesDemo();
		  System.out.println(obj1.age);
		  System.out.println(obj1.name);
		  System.out.println(obj1.email);
		  obj1.age=23;
		  obj1.name= "kiran kumar";
		  
		  InstanceVariablesDemo obj2 = new InstanceVariablesDemo();
		  System.out.println(obj2.age); // 21
		  System.out.println(obj2.name); // kiran
		
	}

}
