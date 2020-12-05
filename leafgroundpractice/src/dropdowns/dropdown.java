package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
             System.setProperty("webdriver.chrome.driver","C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
		     driver.manage().deleteAllCookies();
		     driver.manage().window().maximize();
		     
		     driver.get("http://www.leafground.com/");
		     WebElement dropbutton=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img"));
		     dropbutton.click();
		     //select one item in dropdown by index
		     
		     WebElement dropdown1= driver.findElement(By.id("dropdown1"));
		     Select select=new Select(dropdown1);
		     select.selectByIndex(2);
		     
		     // select using text
		     
		     WebElement dropdown2= driver.findElement(By.name("dropdown2"));
		     Select select1= new Select(dropdown2);
		     select1.selectByVisibleText("Selenium");
		     
		     // select using value
		     
		     WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		     Select select2=new Select(dropdown3);
		     select2.selectByValue("4");
		     Thread.sleep(2000);
		     
		// get the number of dropdown options
		     
		     WebElement dropdowns=driver.findElement(By.className("dropdown"));
		   Select select3=new Select(dropdowns);
		  List<WebElement> size= select3.getOptions();
		 int value= size.size();
		  System.out.println(value);
		  
		 // send keys in the dropdown
		  
		  WebElement dropdowntext= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		  dropdowntext.sendKeys("loadrunner");
		  Thread.sleep(1000);
		  
		  //multiselect in dropdown
		  
		  WebElement multiselect= driver.findElement(By.xpath
				  ("//*[@id=\"contentblock\"]/section/div[6]/select/option[1]"));
		  Select multiselectbox= new Select(multiselect);
		  multiselectbox.selectByIndex(1);
		  multiselectbox.selectByIndex(2);
		  multiselectbox.selectByIndex(3);
		  Thread.sleep(1000);
		  driver.close();
	}

}
