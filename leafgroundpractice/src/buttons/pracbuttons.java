package buttons;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracbuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             System.setProperty("webdriver.chrome.driver", "C:\\Users\\nrangana\\OneDrive - Capgemini\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
              WebDriver driver = new ChromeDriver();
              driver.manage().deleteAllCookies();
              driver.manage().window().maximize();
              driver.get("http://www.leafground.com/");
              driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
            // find the position of the button
                            
              WebElement positionbutton= driver.findElement(By.id("position"));
            Point xypoint= positionbutton.getLocation();
            int xvalue= xypoint.getX();
            int yvalue= xypoint.getY();
            System.out.println("x vaule is: "+ xvalue + "y value is:"+ yvalue);
            //find the color of the button
            
            WebElement color= driver.findElement(By.id("color"));
            String boxcolor=color.getCssValue("background-color");
            System.out.println(boxcolor);
            
            //find the size of the buton
            
            WebElement size= driver.findElement(By.id("size"));
              int  boxheight= size.getSize().getHeight();
           int boxwidth = size.getSize().getWidth();
           System.out.println("box height is:"+boxheight+"box width is: "+boxwidth);
            // click to go back to home page
           
           WebElement gohome= driver.findElement(By.id("home"));
           gohome.click();
            
            driver.close();
              
	}

}
