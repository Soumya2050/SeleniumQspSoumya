package basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchMultipleBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1-- launch Empty Chrome Browser");
		System.out.println("2-- launch Empty Edge Browser");
		System.out.println("3-- launch Empty Chrome Browser");
		int key=sc.nextInt();
		switch(key)
		{
		case 1:WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		break;
		case 2:WebDriver driver1=new EdgeDriver();
		break;
		default:System.out.println("Enter the valid Driver");
		}
		
	}

}
