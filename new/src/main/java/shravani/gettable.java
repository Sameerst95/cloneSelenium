package shravani;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettable {
    public static void main(String[] args) {
        String filepath = System.getProperty("user.dir");
        System.out.println(filepath);
        //Retrieves the path from where the program is being executed
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shravani\\IdeaProjects\\newjavaprogram\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(filepath + "/table.html");
       // driver.manage().window().maximize();
        int r=driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
        System.out.println(r);
        int c=driver.findElements(By.xpath("html/body/table/thead/tr/th")).size();
        System.out.println(c);
        for(int i=2;i<=r;i++){
            for(int j=1;j<=c;j++){
                driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]")).getText();
                driver.findElement(By.xpath("html/body/table/thead/tr/td["+j+"]")).getText();
            }

        }





    }
}
