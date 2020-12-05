package editpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pracedit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebElement editBox=	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		editBox.click();
		Thread.sleep(1000);
		WebElement enterEmail= driver.findElement(By.id("email"));
		enterEmail.sendKeys("shankari.uma@gmail.com");
		Thread.sleep(1000);
		WebElement appendText= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendText.sendKeys("Hello");
		Thread.sleep(2000);
		WebElement defaultText= driver.findElement(By.name("username"));
		String value= defaultText.getAttribute("value");
		System.out.println(value);
		Thread.sleep(1000);
		WebElement clearText =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearText.clear();
		Thread.sleep(1000);
		WebElement disableBox =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		boolean box= disableBox.isEnabled();
		System.out.println(box);
		driver.close();	
		
		
	}

}
