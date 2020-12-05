package radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracradiobuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver",
    		   "C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   
	   driver.get("http://www.leafground.com/");
	   
	   WebElement Pressradio= driver.findElement(By.
			   xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[6]/a/img"));
	    Pressradio.click();
	    //radio yes or no
	   Thread.sleep(1000);
	    WebElement clickyes= driver.findElement(By.id("no"));
	    clickyes.click();
	    
	    
	    // checked or unchecked
	    
	    WebElement unchecked= driver.findElement(By.
	    		xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]"));
	    WebElement checked= driver.findElement(By.
	    		xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
	  Thread.sleep(1000);
	    unchecked.click();
	  checked.click();
	    boolean result1= unchecked.isSelected();
	   boolean result2= checked.isSelected();
	   System.out.println(result1);
	   System.out.println(result2);
	   
	   
	   //select your age using radio button
	   
	   WebElement age= driver.findElement(By.
			   xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
	   age.click();
	    
	
	
	
	
	
	}

}
