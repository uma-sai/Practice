package Alartboxs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracalartbox {

	public static void main(String[] args) throws InterruptedException {
 		// TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver",
            		"C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.manage().deleteAllCookies();
           driver.manage().window().maximize();
           driver.get("http://www.leafground.com/");
           WebElement homealert= driver.findElement(By.
        		   xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/img"));
           homealert.click();
           //accepting ok on a alart box
           
           WebElement firstalert= driver.findElement(By.
        		    xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
           firstalert.click();
           
		 Alert alert= driver.switchTo().alert();
		 alert.accept();
		 // dismissing from the alert message 
		 
		 WebElement secondalert= driver.findElement(By.
				 xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		 secondalert.click();
		 Alert disalert= driver.switchTo().alert();
		 Thread.sleep(1000);
		 disalert.dismiss();
		 
		 // enter value in alert box and accept
		 
		 WebElement thirdalert= driver.findElement(By.
				 xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		 thirdalert.click();
		 Alert textenter= driver.switchTo().alert();
		 textenter.sendKeys("uma");
		 textenter.accept();
		 
		 // click on alert and accept
		 
			/*
			 * WebElement fourthalert= driver.findElement(By.xpath("//*[@id=\"btn\"]"));
			 * fourthalert.click(); Alert accept1= driver.switchTo().alert();
			 * //Thread.sleep(1000);
			 */		
		 WebElement sweetAlert = driver.findElement(By.id("btn"));
		  sweetAlert.click();
		  Thread.sleep(3000);
		  //driver.findElement(By.
				  //xpath("/html/body/div[2]/div/div[2]/div/button")).click();



		 driver.close();
		 
		 
		 
				 
		
		 
	}

}
