package assignmentproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Projectt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
        //Explicit wait is added after the Page load
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.titleContains("Welcome"));

        WebElement popUp=driver.findElement(By.className("fancybox-skin"));

        popUp.findElement(By.xpath(".//*[@id='load_form']/fieldset[1]/input")).sendKeys("Ankit kumar");
        popUp.findElement(By.xpath(".//*[@id='load_form']/fieldset[2]/input")).sendKeys("7503932425");
        popUp.findElement(By.xpath(".//*[@id='load_form']/fieldset[3]/input")).sendKeys("ak3347583@gmail.com");
        popUp.findElement(By.xpath(".//*[@id='load_form']/fieldset[5]/input")).sendKeys("Delhi");
        popUp.findElement(By.xpath(".//*[@id='load_form']/fieldset[6]/input")).sendKeys("Ankit");
        popUp.findElement(By.xpath(".//*[@id='load_form']/fieldset[7]/input")).sendKeys("7503932");
        
	  

	    

	    
	    
       
	}

}
