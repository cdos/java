
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testing {
	   public static WebDriver driver; 
	   
	   public static void main(String[] args) { 
	        DesiredCapabilities capability = new DesiredCapabilities();
	     
	        capability.setBrowserName("firefox");
	        capability.setPlatform(Platform.WINDOWS);
	       	              
	        driver = new RemoteWebDriver(capability);
	        driver.get("http://10.221.209.252/liveview");
	   }
}
