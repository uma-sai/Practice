package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltiptext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		WebElement homebutton= driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[20]/a/img"));
		homebutton.click();
		// get the text from the tool tip

		WebElement tooltext= driver.findElement(By.id("age"));
		String text= tooltext.getAttribute("title");
		System.out.println(text);
        driver.close(); 











	}

}
