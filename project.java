package internproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class project {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://downtowndallas.com/experience/stay/");
		driver.get("https://downtowndallas.com/experience/stay/");
	    driver.findElement(By.xpath("//a[contains(text(),'AC Marriott')]")).click();
	    System.out.println(driver.findElement(By.className("place-name")).getText());
	    String a = driver.getCurrentUrl();
	    System.out.println(a);
	    System.out.println(driver.findElement(By.xpath("//a[contains(text(),'1712 Commerce')]")).getText());
	    System.out.println(driver.findElement(By.xpath("//a[contains(text(),'214-290-0111')]")).getText());
	    System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Main Street District')]")).getText());
	    WebElement image = driver.findElement(By.xpath("//body/main[1]/div[1]/img[1]"));
	    
	    Actions action= new Actions(driver);
	    action.contextClick(image).build().perform();
	    //action.sendKeys(Keys.CONTROL,"v").build().perform();
	    action.sendKeys(Keys.CONTROL,"s").build().perform();
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_D);
	    robot.keyPress(KeyEvent.VK_SHIFT);
	    robot.keyPress(KeyEvent.VK_SEMICOLON);
	    robot.keyRelease(KeyEvent.VK_SHIFT);
	    robot.keyPress(KeyEvent.VK_BACK_SLASH);
	    robot.keyPress(KeyEvent.VK_T);
	    robot.keyPress(KeyEvent.VK_E);
	    robot.keyPress(KeyEvent.VK_S);
	    robot.keyPress(KeyEvent.VK_T);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    

	}


}