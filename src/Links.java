import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement foot=driver.findElement(By.xpath("//td/ul"));
		List<WebElement> totalLinks=foot.findElements(By.tagName("a"));
	
		for(int i=1;i<totalLinks.size();i++)
		{
			String ClinkonLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			foot.findElements(By.tagName("a")).get(i).sendKeys(ClinkonLink);
		
		}
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
		

	}

}
