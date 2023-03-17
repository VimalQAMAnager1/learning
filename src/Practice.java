
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	//	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	/*	driver.findElement(By.id("password")).sendKeys("learning");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='form-check-inline']/label/following-sibling::label/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("okayBtn")).click();
		Thread.sleep(1000);
		WebElement b=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown= new Select(b);
		dropdown.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(2000);
		List<WebElement> k=driver.findElements(By.cssSelector(".btn.btn-info"));
		for(int i=0; i< k.size();i++)
		{
			String f=k.get(i).getText();
			System.out.println(f);
			k.get(i).click();
			
		}
		driver.findElement(By.cssSelector(".nav-item.active")).click();*/
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set window=driver.getWindowHandles();
		 Iterator<String> it= window.iterator();
		 String parentId=it.next();
		 String ChildId=it.next();
		 driver.switchTo().window(ChildId);
		 String s=driver.findElement(By.cssSelector(".im-para.red")).getText();
		 System.out.println(s);
		 String d=s.split("@")[1].split("with")[0].trim();
		 System.out.println(d);
		 driver.switchTo().window(parentId);
		 driver.findElement(By.id("username")).sendKeys(d);
		 driver.findElement(By.id("password")).sendKeys("learning");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='form-check-inline']/label/following-sibling::label/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("okayBtn")).click();
			Thread.sleep(1000);
			WebElement b=driver.findElement(By.xpath("//select[@class='form-control']"));
			Select dropdown= new Select(b);
			dropdown.selectByIndex(2);
			driver.findElement(By.id("terms")).click();
			driver.findElement(By.id("signInBtn")).click();
			Thread.sleep(2000);
			List<WebElement> k=driver.findElements(By.cssSelector(".btn.btn-info"));
			for(int i=0; i< k.size();i++)
			{
				String f=k.get(i).getText();
				System.out.println(f);
				k.get(i).click();
				
			}
			driver.findElement(By.cssSelector(".nav-item.active")).click();
		 
		 
		 
		
		

	}

}
