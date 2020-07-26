package practice;

public class StaticInstantBlocks {

	StaticInstantBlocks(){
		System.out.println("Executing Constructor");
	}

	static {
		System.out.println("Executing First static block");
	}

	static {
		System.out.println("Executing second static block");
	}

	{
		System.out.println("Executing First instant block");
	}
	
	{
		System.out.println("Executing second instant block");
	}
	
	public static void main(String[] args) {
		new StaticInstantBlocks();
	}

}
