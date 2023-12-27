package GridSetupTestDt.GridSetupTestDt;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

		// Burada command da hub ve node olusturduk sonra burada google sayfasina gittik selenium gridle google title aldik
		public static void main(String[] args) throws MalformedURLException {
			
			//Define Desired Capabilities
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName("chrome");			
			//Merge OS and browser name,merge desired capabilities
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);
			
			//Create s String variable for hub URL
			String hubUrl = "http://192.168.178.20:4444/wd/hub";
			
			//many classes implementing chromedriver,firefox
			//Create driver object
			WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);
			
			//Type Selenium codes
			driver.get("https://www.google.com/");
			System.out.println(driver.getTitle());
			//driver.close();

	}

}
