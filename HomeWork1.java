package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HomeWork1 extends CommonMethods {
    //hw1:http://35.175.58.98/synchronization-explicit-wait.php click to open alert and handle it
    //click to change text and get the changed text click to get hidden button click on it click to get the checkbox selected and print if it is selected or not
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php ";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement alertBtn = driver.findElement(By.xpath("//button[@id='show_alert']"));
        alertBtn.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        WebElement text = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        text.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Ssyntaxtechs']")));
        String textS=driver.findElement(By.xpath("//h2[text()='Ssyntaxtechs']")).getText();
        System.out.println(textS);

        WebElement enableBtn = driver.findElement(By.xpath("//button[@id='display_button']"));
        enableBtn.click();
        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Enabled']"));
        clickBtn.click();
        System.out.println("Is the hidden Enabled button selected: " + clickBtn.isEnabled());

        WebElement clickCheckBox = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        clickCheckBox.click();
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        wait.until(ExpectedConditions.elementSelectionStateToBe(checkBox,true));
        System.out.println("Is the checkbox clicked: " + checkBox.isSelected());



    }
}
