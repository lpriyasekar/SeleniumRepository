package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		//To enter account name
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Lakshmi Priya");
		
		// to handle dropdowm// dropdown in select tag in dom
		//step1: Find the element
		WebElement findElement = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		
		//create object for select class
		Select option=new Select(findElement);
		
		// select value
		option.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
	}

}
