package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Lakshmi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Priya");
		WebElement findElement = driver.findElement(By.xpath("//select[@id='day']"));
		Select options=new Select(findElement);
		options.selectByValue("9");
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(findElement2);
		month.selectByValue("4");
		
		WebElement findElement3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(findElement3);
		year.selectByValue("1993");
		driver.findElement(By.xpath("//input[@id='sex']")).click();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("25648235");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("xccsadfdsf");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}
	
}
