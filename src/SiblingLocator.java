import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	    driver.navigate().to("https://the-internet.herokuapp.com/challenging_dom");
	    driver.navigate().back();
	    
		System.out.println(driver.findElement(By.xpath("//div/button")).getText());
		System.out.println(driver.findElement(By.xpath("//div/button/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//div/button/following-sibling::button[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//div/button[3]/parent::div/button[2]")).getText());

	}

}
