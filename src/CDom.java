import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CDom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
		System.out.println(driver.findElement(By.cssSelector("td a:nth-child(1)")).getText());
		driver.findElement(By.cssSelector("td a:nth-child(1)")).click();
	}

}
