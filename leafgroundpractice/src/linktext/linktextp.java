package linktext;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class linktextp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement gmail= driver.findElement(By.linkText("Gmail"));
		
		Actions gaction= new Actions(driver);
		
		gaction.contextClick(gmail).moveToElement(driver.findElement(By.linkText("open link in new tab"))).click().build().perform();
		Thread.sleep(2000);
		//gaction.moveToElement(driver.findElement(By.linkText("open link in new tab"))).click().build().perform();
		//WebElement newtab= driver.findElement(By.linkText("Open link in new tab"));
		/*
		 * Thread.sleep(1000); driver.switchTo().activeElement();
		 * gaction.moveToElement(newtab).click().build().perform();
		 */
		//keyDown(Keys.ARROW_DOWN).click().build().perform();
		//keyDown(Keys.ARROW_DOWN).click().build().perform();
		//WebElement newtab= driver.findElement(By.linkText("Open link with new tab"));
		//sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		 //gaction.contextClick(gmail).moveToElement(newtab).click().build().perform();
			Thread.sleep(2000);
		
	}

}
