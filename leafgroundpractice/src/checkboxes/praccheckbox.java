package checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class praccheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver",
            		"C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.get("http://www.leafground.com/");
            WebElement checkbox=driver.findElement(By.
            		xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[7]/a/img"));
            checkbox.click();
            //select a item in check box
            
            WebElement javabox= driver.findElement(By.
            		xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input"));
            javabox.click();
            // find if the item is selected or not
            Thread.sleep(1000);
            WebElement selenium= driver.findElement(By.
            		xpath("//*[@id=\"contentblock\"]/section/div[2]/label"));
            Thread.sleep(1000);
            boolean selected=selenium.isSelected();
            System.out.println(selected);
            // deselected the selected one
                          
            WebElement unselected= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
            WebElement selected1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));          
           if(unselected.isSelected())
           {
        	  unselected.click(); 
           }
           else selected1.click();
                               
            //select one from the option
	         
	        WebElement option= driver.findElement(By
	        		.xpath("/html/body/div/div/div[3]/section/div[4]/div[4]/input"));
	         option.click();
	
	
	}

}
