import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://jqueryui.com/draggable/");
	//	driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.switchTo().frame(0);
		WebElement Src=driver.findElement(By.cssSelector("#draggable"));
		
		Actions a= new Actions(driver);
		Thread.sleep(1000);
		a.dragAndDropBy(Src, 50, 80).build().perform();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.cssSelector(".desc")).getText());
		
		//https://jqueryui.com/draggable/

	}

}
