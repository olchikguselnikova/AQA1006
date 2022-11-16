import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lesson11_testFirst {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\driversweb\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
