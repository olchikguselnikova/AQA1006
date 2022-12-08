import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson12 {

    static WebDriver webDriver=new ChromeDriver();
    static By firstNameLocator = new By.ById("firstName");
    static By lastNameLocator = new By.ById("lastName");
    static By emailLocator = new By.ById("userEmail");
    static By mobileLocator = new By.ById("userNumber");
    static By subjectLocator= new By.ById("subjectsInput");


    public static void main(String[] args) {
        webDriver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName = webDriver.findElement(firstNameLocator);
        firstName.sendKeys("Olga");

        WebElement lastName= webDriver.findElement(lastNameLocator);
        lastName.sendKeys("Guselnikova");

        WebElement userEmail= webDriver.findElement(emailLocator);
        userEmail.sendKeys("oguselnikova@gmail.com");

        WebElement userNumber= webDriver.findElement(mobileLocator);
        userNumber.sendKeys("0633737976");

        WebElement subject= webDriver.findElement(subjectLocator);
        subject.sendKeys("IT");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.quit();
    }
}
