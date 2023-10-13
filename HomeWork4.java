package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class HomeWork4 extends CommonMethods {
    //@hw3:goto http://35.175.58.98/table-pagination-demo.php print the rows that have status  "in progress" no use of contains method allowed
    public static void main(String[] args) {
        String url = "http://35.175.58.98/table-search-filter-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        List<WebElement> statuses =driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int i=1;
       for(WebElement status:statuses){
          String text= status.getText();
          if(text.equals("in progress")){
              WebElement row= driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+i+"]"));
              System.out.println(row.getText());
          }
          i=i+1;
       }
    }
}
