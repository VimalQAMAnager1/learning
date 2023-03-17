import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String[] itemList= {"Cucumber","Brocolli"};
		Ecom ec= new Ecom();
		ec.getPro(driver, itemList);
		
		
		
	}
	
	public  void getPro(WebDriver driver, String[] itemList)
	{
		List<WebElement> cart=driver.findElements(By.cssSelector(".product h4"));
	for(int i=0;i<cart.size();i++)
	
	{	String s=cart.get(i).getText().split("-")[0].trim();;
		
		List ItemLists= Arrays.asList(itemList);
		int j=0;
		if(ItemLists.contains(s))
		{
			driver.findElements(By.xpath("//div[@class='product']/h4/following-sibling::div/button")).get(i).click();
			j++;
			if (j==itemList.length)
			{
				break;
			}
		   
			
		}
		
}	
}
}
		
		
  
	


