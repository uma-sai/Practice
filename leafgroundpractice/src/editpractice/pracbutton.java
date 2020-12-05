package editpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracbutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","C:\\Users\\nrangana\\\\OneDrive - Capgemini\\\\Desktop\\\\Selenium softwares\\\\chromedriver_win32\\\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("http://www.leafground.com/");
		 Thread.sleep(1000);
		WebElement button= driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a"));
		button.click();
		Thread.sleep(1000);
		//WebElement home= driver.findElement(By.id("home"));
		//home.click();
		Thread.sleep(500);
		WebElement positon=driver.findElement(By.xpath("//*[@id=\"home\"]"));
		
		
		
		driver.close();
		
		
		
		
	}

}
