import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Grid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<WebElement> a=driver.findElements(By.xpath("//tr/td[1]"));
		a.stream().filter(s->s.getText().contains("Beans")).map(s->veggie(s)).collect(Collectors.toList()).forEach(k->System.out.println(k));
		
	}
         
	public static String veggie(WebElement s){
		String h=s.findElement(By.xpath("/following-sibling::td[1]")).getText();
		return h;
	 
	
	
	
}
}
	