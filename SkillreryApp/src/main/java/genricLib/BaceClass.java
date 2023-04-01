package genricLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaceClass {
	public WebDriver driver;
	public PropertyFile p=new PropertyFile();
	
	
	@BeforeMethod
	public void openApp() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getPropertyFiledata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	
	@AfterMethod
	public void  closeApp(ITestResult result) {
		int status =result.getStatus();
		String name=result.getName();
		if(status==2) {
			Screenshot s=new Screenshot();
            
            
            
		}
		driver.quit();
	}

}
