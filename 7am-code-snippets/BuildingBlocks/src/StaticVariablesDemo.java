
public class StaticVariablesDemo {
	
    static int a=10;
    static String b="hello";
    
     public static void main(String[] args) {
    	  System.out.println(a);
    	  System.out.println(StaticVariablesDemo.a); // recommended
    	  System.out.println(StaticVariablesDemo.b); // recommended

    	  StaticVariablesDemo obj = new StaticVariablesDemo();
    	  System.out.println(obj.a);
    	  System.out.println(obj.b);
    	  obj.a = 200;
    	  System.out.println(StaticVariablesDemo.a); // 
    	  StaticVariablesDemo.b = "World";
    	  System.out.println(obj.b); // 
    	 
	}

}
