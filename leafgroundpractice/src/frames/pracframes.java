package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver","/Users/uma/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		
		WebElement homeframebutton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[10]/a/img"));
		homeframebutton.click();
		
		// click on the button in the first frame
		/*
		 * driver.switchTo().frame(0); WebElement clickme1=
		 * driver.findElement(By.id("Click")); clickme1.click();
		 * driver.switchTo().defaultContent(); Thread.sleep(1000);
		 */
		driver.switchTo().frame(0);
		WebElement clickme1= driver.findElement(By.id("Click"));
		clickme1.click();
		driver.switchTo().defaultContent();
		// click on the button on the second frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		Thread.sleep(1000);
		WebElement clickme2= driver.findElement(By.id("Click1"));
		clickme2.click();
		String gettext=driver.findElement(By.id("Click1")).getText();
		System.out.println(gettext);
		
		// find the number of frames in the page
		driver.switchTo().defaultContent();
		List<WebElement> numberofframes= driver.findElements(By.tagName("iframe"));
		
		int howmany=numberofframes.size();
		
		System.out.println(howmany);
		
		driver.close();
		
		
	}

}
