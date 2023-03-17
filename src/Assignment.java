import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String a=driver.findElement(By.cssSelector("label[for='benz']")).getText();
		WebElement c=driver.findElement(By.name("dropdown-class-example"));
		Select b= new Select(c);
		b.selectByIndex(2);
		System.out.println(b.getFirstSelectedOption().getText());
		driver.findElement(By.id("name")).sendKeys(a);
		driver.findElement(By.id("alertbtn")).click();
		String d=driver.switchTo().alert().getText();
		if(d.contains(a))
				{
			System.out.println("The Match is found");
				}
		else {
			System.out.println("No match found");
		}
		String e=d.split(",")[0].split(" ")[1].trim();
		Assert.assertEquals(a, e);
		
		
		

	}

}
