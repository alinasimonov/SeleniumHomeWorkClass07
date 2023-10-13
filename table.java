package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class table extends CommonMethods {
    public static void main(String[] args) {
        String url="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        //get the whole table
       //*****table level access********
        WebElement allTable= driver.findElement(By.xpath("//table[@id='customers']"));
        String tableContent=allTable.getText();
        System.out.println(tableContent);
    }
}
