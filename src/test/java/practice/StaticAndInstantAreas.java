package practice;

public class StaticAndInstantAreas {

	public int length; //declare within the class outside of the method
	int breadth; //default
	
	static int Area; //declare within the class outside of the method but with Static keyword
	
	public int CalculateArea(int a, int b) {
		length = a;
		breadth = b;
		int Area1;
		Area1 = length * breadth;
		return Area1;
	}
	
	public int AssignArea(int length, int breadth) {
		int result;
		this.length = length;
		this.breadth = breadth;
		return result= this.length* this.breadth;
	}
	
	public static int FindArea(int a, int b) {
		StaticAndInstantAreas SI = new StaticAndInstantAreas();
		SI.AssignArea(30, 60);
		int c;
		c = a * b + SI.AssignArea(30, 60);
		return c;
	}
	
	public static void main(String[] args) {
		StaticAndInstantAreas SI = new StaticAndInstantAreas();
		System.out.println("The Area of Local Method is " + SI.CalculateArea(20, 40));
		System.out.println("The Area of Find Method is " + StaticAndInstantAreas.FindArea(10, 4));
		System.out.println("Result Area is " + SI.AssignArea(2, 5));
	}
}
