import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Scrollling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int sum= 0;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> a=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		for(int i=0;i< a.size();i++)
		{
			System.out.println(a.get(i).getText());
			sum=sum+Integer.parseInt(a.get(i).getText());
		}
		System.out.println(sum);
		String S=driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total=Integer.parseInt(S.split(":")[1].trim());
		Assert.assertEquals(total,296);
		WebElement table=driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td"));
		System.out.println(secondrow.get(1).getText());
		
		
		
		
	}

}
