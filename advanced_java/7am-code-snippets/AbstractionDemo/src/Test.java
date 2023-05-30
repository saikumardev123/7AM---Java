import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		 HashMap<Integer,Boolean> hm= new HashMap<Integer,Boolean>();
		 
		
	}
}
	
	
	class Rectangle{
	
		int i;
		int j;
		public Rectangle(int i, int j) {
			   this.i=i;
			   this.j=j;
		}
	}
	class Square{
	
		int i;
		int j;
		public Square(int i, int j) {
			   this.i=i;
			   this.j=j;
		}
	}
	
	class Box<T>{
		private T t;

		public T getT() {
			return t;
		}

		public void setT(T t) {
			this.t = t;
		}	
		
		public static void main(String[] args) {
			Box<Rectangle> rectange = new Box<Rectangle>();
		}
	}
	
	
	





