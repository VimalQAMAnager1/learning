import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class SSLCert {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url=driver.findElement(By.xpath("//li/a")).getAttribute("href");
		System.out.println(url);
		
	HttpURLConnection a	=(HttpURLConnection)new URL(url).openConnection();
	a.setRequestMethod("HEAD");
	a.connect();
	int b=a.getResponseCode();
	System.out.println(b);
	/*	for(int i=0;i<url.size();i++)
		{
			String a=url.get(i).getAttribute("href");
			url.get(i).click();
			System.out.println(a);
		}*/
		
		
		

	}

}
