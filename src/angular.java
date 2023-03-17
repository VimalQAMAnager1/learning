import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class angular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.getTitle();
		driver.findElement(By.name("name")).sendKeys("vimal");
		driver.findElement(By.name("email")).sendKeys("vimal@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("raju");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement l=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown= new Select(l);
		dropdown.selectByVisibleText("Female");
		System.out.println(dropdown.getFirstSelectedOption().getText());
	
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("12/02/2023");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

	}

}
