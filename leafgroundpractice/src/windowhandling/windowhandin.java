package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.manage().deleteAllCookies();
	     driver.manage().window().maximize();
	     
	     driver.get("http://www.leafground.com/");
	     WebElement windowbutton= driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img"));
	     windowbutton.click();
	     //getting the control of the parent or old window
	     String parentwindow= driver.getWindowHandle();
	         
	     // home page to open in new window handle it and close it
	     
	     WebElement child1window= driver.findElement(By.id("home"));
	     child1window.click();
	     
	    Set<String> childwindows= driver.getWindowHandles();
	       for (String newwindow : childwindows) {
	    	   
	    	   driver.switchTo().window(newwindow);
					}
	      WebElement editbox=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
	       editbox.click();
	       Thread.sleep(2000);
	     driver.close();
	     driver.switchTo().window(parentwindow);
	     // find the number of windows opens and close them
	     
	     WebElement windowcount= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
	     windowcount.click();
	     
	     int numberofwin=driver.getWindowHandles().size();
	     System.out.println(numberofwin);
			
	     Set<String> newwindows=  driver.getWindowHandles();
	     
	     for (String allwindows : newwindows) {
	    	 if(!allwindows.equals(parentwindow))
	    	 {
	    		 driver.switchTo().window(allwindows);
	    		 driver.close();
	    	 }
		}
	     driver.switchTo().window(parentwindow);
	     
	     
	     // close the child windows expect the main window
	     
	     WebElement colorwindow=driver.findElement(By.id("color"));
	     colorwindow.click();
	     Thread.sleep(1000);
	     Set<String>color=driver.getWindowHandles();
	     for (String allwin : color) {
			if(!allwin.equals(parentwindow))
			{
				driver.switchTo().window(allwin);
				driver.close();
			}
		}
	     
	     
	     
	     
		}
	     
	      
	}


