package Framework.testCases;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excel2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileInputStream fis= new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\java\\Framework\\testData\\login.xlsx"));
        System.setProperty("webdriver.chrome.driver","\\chromedriver.exe");
        String userName,password;
        XSSFWorkbook workbook= new XSSFWorkbook(fis);
        XSSFSheet sheet= workbook.getSheetAt(0);
        Row row= sheet.getRow(0);
        Cell cell=row.getCell(0);
            int i=1,j=2;
            int rowSize=sheet.getLastRowNum();
            System.out.println(sheet.getLastRowNum());
            for(int k=1;k<=rowSize;k++){
                Cell cell1=sheet.getRow(k).getCell(1);
                Cell cell2=sheet.getRow(k).getCell(2);
                    System.out.println("Username: "+sheet.getRow(k).getCell(1));
                    System.out.println("Password: "+sheet.getRow(k).getCell(2));
                    WebDriver driver= new ChromeDriver();
                driver.get("https://www.facebook.com/");
                driver.findElement(By.id("email")).sendKeys(cell1.toString());
                driver.findElement(By.id("pass")).sendKeys(cell2.toString());
                driver.findElement(By.name("login")).click();
                Thread.sleep(3000);
            }
    }
}
