import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String ParentId=it.next();
		String ChildId= it.next();
		driver.switchTo().window(ChildId);
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("div h3")).getText());
		Thread.sleep(1000);
		driver.switchTo().window(ParentId);
		System.out.println(driver.findElement(By.cssSelector("div h3")).getText());
		

	}

}
