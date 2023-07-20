package seleniuminstall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstautomation {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/control/login");
    driver.manage().window().maximize();
    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText( "Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("hankook");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("subash");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("bose");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("subashjothi.1208@gmail.com");
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9443883554");
    driver.findElement(By.name("submitButton")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("updateLeadForm_companyName")).clear();
    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Enhance");
    driver.findElement(By.name("submitButton")).click();


	}}
