package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class tableTask extends CommonMethods {
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
        //List<WebElement> columns=driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
        //for(WebElement column:columns){
        //String text=column.getText();
        //System.out.println(text);

            //********Task*******
            //*****print the row with position Software eng without using contain method*****

            //locate the column that contains position
            List<WebElement> positions=driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
            int i=0;
            //iterate
            for(WebElement position:positions){
                String text=position.getText();
                if(text.equals("Software Engineer")){
                    System.out.println("the row contains software engineer is "+i);
                    WebElement row=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+(i+1)+"]"));//(i+1) because index starts from 1 not from 0, if starts from 0 is only i
                    System.out.println(row.getText());
                }
                i=i+1;
            }

        }
    }
