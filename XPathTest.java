import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathTest {
    private final static String CHROME_DRIVER_PATH = "/Users/User1/Downloads/chromedriver";
    private final static String CHROME_WEB_DRIVER = "webdriver.chrome.driver";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(CHROME_WEB_DRIVER,CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("http://btamada.github.io/");
        Thread.sleep(10000);
        driver.close();
        driver.quit();
    }

}