package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HomeWork2 extends CommonMethods {
    //Hw2:http://35.175.58.98/synchronization-waits.php click on click me button and get the text and print on screen
    public static void main(String[] args) {
        String url = "http://35.175.58.98/synchronization-waits.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement button1 = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        button1.click();
        WebElement displayedText = driver.findElement(By.xpath("//div[@class='card-body']"));
        wait.until(ExpectedConditions.textToBePresentInElement(displayedText, "Hello, this message appeared after you clicked the button"));
        System.out.println("The text from the first click me box is: " + displayedText.getText());

        WebElement button2=driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        button2.click();
        WebElement femaleBtn=driver.findElement(By.xpath("//input[@value='Female']"));
        femaleBtn.click();
        System.out.println("Is the Female button selected: " + femaleBtn.isSelected());


        WebElement clickMe3 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']"));
        clickMe3.click();
        WebElement checkBox = driver.findElement(By.xpath("//input[@value='Option-1']"));
        checkBox.click();
        System.out.println("Is Option 1 checkbox selected: " + checkBox.isSelected());


    }
}
