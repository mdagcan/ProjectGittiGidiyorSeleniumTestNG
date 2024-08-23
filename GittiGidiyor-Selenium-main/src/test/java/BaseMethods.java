import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMethods {

    public static WebDriver webDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://ais.usvisa-info.com/tr-tr/niv/users/sign_in");
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver driver = webDriver();
    WebDriverWait wait = new WebDriverWait(driver,50,1000);
    WebElement findElement(By by){
         return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    void clickToElement (By by){
        findElement(by).click();
    }
    String getUrl(){
        return driver.getCurrentUrl();
    }
    void goToUrl(String x){
         driver.get(x);
    }


}
