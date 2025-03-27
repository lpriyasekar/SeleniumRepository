package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead2 {

	public static void main(String[] args) {
		// Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Load the url
				driver.get("http://leaftaps.com/opentaps");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				
				//To enter the username
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				
				//To enter the password
				driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
				
				//To Click the Login Button
				driver.findElement(By.xpath("//input[contains(@class,'dec')]")).click();
				
				//To Click CRMSFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//To click the Leads Link
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				
				//Click on Create Lead link
				//WebElement findElement = driver.findElement(By.linkText("Create Lead"));
				//findElement.click();
				driver.findElement(By.linkText("Create Lead")).click();
				//To enter the companyName
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
				
				//To enter the firstname
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
				
				//To enter the lastname
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");

				//To handle the Dropdown
				//Step1: Find the element
				WebElement sourceElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
				
				//Step2: Create the Object for Select Class
				Select option=new Select(sourceElement);
				
				//Step3: Use the method(3 method) to Select the value
				//selectByIndex
				//option.selectByIndex(3);

				//option.selectByVisibleText("Distribution");
				
				////selectByValue
				option.selectByValue("IND_RETAIL");

				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				
				

			}
		
	}

