package practice;

public class ConstructClass {
	
	//String Name; //instant Variable
	//int Age; //instant Variable
	
	
	ConstructClass(){
		this(10);
		System.out.println("Executing no argument Constructor");
	}
	
	ConstructClass(int a){
		this(10,25);
		System.out.println("Executing one argument Constructor");
	}
	
	ConstructClass(int a, int b){
		this("test");
		System.out.println("Executing two argument Constructor");
	}

	
	ConstructClass(String b){
		System.out.println("Executing String Constructor");
	}

	
	public static void main(String[] args) {
		new ConstructClass();
	}

}

