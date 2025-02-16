package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Demo {
    @Test
    public void abc() {

        By location= By.xpath("//div[@id=\"nav-packard-glow-loc-icon\"]");
        By pincode=By.xpath("//input[@id=\"GLUXZipUpdateInput\"]");
        By btnSubmit=By.xpath("(//input[@class=\"a-button-input\"])[3]");
        System.setProperty("webdriver.chrome.driver","path of the driver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=17151353461616627943&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9195217&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
        WebDriverWait wait=new WebDriverWait(driver, TimeUnit.SECONDS.ordinal());
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(location)));
        driver.findElement(location).click();
        driver.findElement(pincode).sendKeys("761032");
        driver.findElement(btnSubmit).click();

    }


}

