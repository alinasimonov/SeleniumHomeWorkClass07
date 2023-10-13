package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class table1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/table-data-download-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        //get the whole table
        //*****table level access********
        WebElement allTable = driver.findElement(By.xpath("//table[@id='example']"));
        String tableContent = allTable.getText();
        // System.out.println(tableContent);

        //******row level access********
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        for (WebElement row : rows) {
            String text = row.getText();
            //only print rows software engineer
            if (text.contains("Software Engineer")) {//without if cond prints all text
                System.out.println(text);
            }
        }
        //****column Level access****
        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
        for(WebElement column:columns){
            String text=column.getText();
            System.out.println(text);

        }
    }
}