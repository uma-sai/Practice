package selectables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectableones {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		WebElement selectable= driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[15]/a/img"));
		selectable.click();
		List< WebElement> select= driver.findElements(By.
				xpath("//*[@id=\"selectable\"]/li"));
		int number=select.size();
		System.out.println(number);

         Actions action=new Actions(driver);
         action.keyDown(Keys.CONTROL)
         .click(select.get(0))
         .click(select.get(1))
         .click(select.get(2)).build().perform();
         Thread.sleep(2000);
		driver.close();







	}

}
