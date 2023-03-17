import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class hello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		WebElement locator=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown= new Select(locator);
		dropDown.selectByIndex(1);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByValue("USD");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		dropDown.selectByVisibleText("AED");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		int i=0;
		while(i<4)
		
		{
			
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		String name= (driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(name, "5 Adult");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div#glsctl00_mainContent_ddl_destinationStation1_CTNR a[value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-highlight")).click();
		Boolean disable=driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5");
		Assert.assertTrue(disable);
		driver.findElement(By.id("Div1")).click();
		Boolean Enable=driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5");
		Assert.assertFalse(Enable);
		
		
	 while (!driver.findElement(By.cssSelector("[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText().equals("May"));
	 {
		 driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		
	 }
		
		int count=driver.findElements(By.cssSelector(".ui-state-default")).size();
		System.out.println(count);
		
		for(int j=0;j<count;j++)
		{ 
			String abc=driver.findElements(By.cssSelector(".ui-state-default")).get(j).getText();
			if (abc.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector(".ui-state-default")).get(j).click();
				break;
			}
			
			
			
				
			}
			
		}
		
		
		
	//	driver.quit();
		
		
		
	
		
		
		
	/*	WebElement locator=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown= new Select(locator);
	System.out.println(dropDown.getFirstSelectedOption().getText());*/
	}
	

	


