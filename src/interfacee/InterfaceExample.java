package interfacee;
interface  Example
{
	void inter();
}

public class InterfaceExample implements Example {
  
	public void inter()
	{
		System.out.println("Interface");
	}
	
	public static void main(String[] args) {


		InterfaceExample id=new InterfaceExample();
		id.inter();
		
	}
}

