package hyperlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class praclinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver= new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("http://www.leafground.com/");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img")).click();
		Thread.sleep(2000);
		 //driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a")).click();
		/*
		 * WebElement links =driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[2]/div/div/a")); String value=
		 * links.getAttribute("href"); System.out.println(value);
		 */
	   //boolean enable= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a")).isEnabled();
	//System.out.println(enable);
	driver.findElement(By.linkText("Go to Home Page")).click();
	driver.findElement(By.partialLinkText("Home Page")).click();
	
	}

}
