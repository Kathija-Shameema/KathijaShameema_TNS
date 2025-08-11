package accessmodifiers;

public class Testaccess {
	

		public static void main(String[] args) {
			
			Testaccess ame = new Testaccess();
			
			System.out.println("Public Variable: "+ ame.publicVar);
			//System.out.println("Private Variable: "+ ame.privateVar);
			System.out.println("Protected Variable: "+ ame.protectedVar);
			System.out.println("Default Variable: "+ ame.defaultVar);

		}
}
