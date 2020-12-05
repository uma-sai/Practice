package droppables;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class droppables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		WebElement homedrop= driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[14]/a/img"));
		homedrop.click();
		
		// drag and drop
		
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		//action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		action.dragAndDrop(drag, drop).build().perform();
		
		driver.close();
		
		
		
		
	}

}
