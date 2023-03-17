import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeiFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	
		System.out.println(driver.findElements(By.tagName("frame")).size());
		//driver.findElement(By.name("frameset-middle"))
		
	driver.switchTo().frame("frame-top");
	driver.switchTo().frame("frame-middle");
	
	String s=driver.findElement(By.cssSelector("#content")).getText();

	

	}

}
