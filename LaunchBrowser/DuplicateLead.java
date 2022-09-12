package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			//driver.close();
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			String text=driver.findElement(By.tagName("h2")).getText();
			System.out.println(text);
			String title=driver.getTitle();
			System.out.println(title);
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.className("inputBox")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinitha");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Govindaraj");
			driver.findElement(By.name("departmentName")).sendKeys("BCA");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Fresher");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinig632@gmail.com");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.linkText("Duplicate Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Selenium Automation");
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vini");
			driver.findElement(By.className("smallSubmit")).click();
			String title1=driver.getTitle();
			System.out.println(title1);
	}
}
