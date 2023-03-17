import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsPractice2 {
 WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		String username = "vimal@gmail.com";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		driver.findElement(By.name("inputPassword")).sendKeys("123456");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();

		String abc = driver.findElement(By.cssSelector("p[class='error']")).getText();
		if (abc.equalsIgnoreCase("* Incorrect username or password")) {
			driver.findElement(By.linkText("Forgot your password?")).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vimal");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vimal@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("raju@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("123456789");
		driver.findElement(By.xpath("//div/form/input[3]")).clear();

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9811240006");

		String Pass = getPassword(driver);
		System.out.println(Pass);
		driver.findElement(By.cssSelector("div button:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("vimal@gmail.com");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(Pass);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.cssSelector("div p")).getText(), "You are successfully logged in.");
		String j = driver.findElement(By.xpath("//div[contains(@class,'container')]/h2")).getText();
		Assert.assertEquals(j, "Hello " + username + ",");
		System.out.println(j.split(" ")[1]);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.quit();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(1000);
		String d = driver.findElement(By.cssSelector("form p")).getText();
		driver.findElement(By.cssSelector("div button:nth-child(1)")).click();
		System.out.println(d);
		String[] s = d.split("'");
		String k = s[1].split("'")[0];
		System.out.println(k);

		return k;
	
	
		
	}

}
