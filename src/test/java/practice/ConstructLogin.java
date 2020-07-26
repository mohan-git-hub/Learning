package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConstructLogin {
	
	String Name;
	int Marks;
	
	//WebDriver driver = new ChromeDriver();
	
	ConstructLogin(String Name, int Marks){
		this.Name = Name;
		this.Marks = Marks;
	}
	
	public void AssignStudent() {
		if(this.Marks > 35) {
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {		
		ConstructLogin CS1 = new ConstructLogin("Ram",50);
		CS1.AssignStudent();
	}
}
