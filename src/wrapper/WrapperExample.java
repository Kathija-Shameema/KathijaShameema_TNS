package wrapper;

public class WrapperExample {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			//AutoBoxing - primitive to object
			//UnBoxing - object to primitive
			
			int x = 5;
			//autoboxing
			Integer y = Integer.valueOf(x);
			
			//unboxing 
			
			int b = y;
			
			System.out.println(y+""+b);
			
		//	System.out.println(typeOf(x));
		}
}
