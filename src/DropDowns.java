import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
		List<WebElement> a=driver.findElements(By.cssSelector(".ui-menu-item a"));
		for(WebElement b: a)
		{
			String c=b.getText();
			if(c.equalsIgnoreCase("India"))
			{
				
				System.out.println(b.getText());
				b.click();
			    
			}
		}
		
		WebElement l=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(l);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.cssSelector(".paxinfo")).click();
		
	     WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
	     w.until(ExpectedConditions.elementToBeClickable(By.id("hrefIncAdt")));
		int i=1;
				while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		
		
		
		
		

	}

}
