package Framework.testCases;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel {
    @Test
    public void ExcelFile() throws FileNotFoundException, IOException {
        FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Framework\\testData\\sample.xlsx");
        XSSFWorkbook book= new XSSFWorkbook(fis);//XSSF = "XML Spread Sheet Format" . Use it for files ending with ".xlsx" :
        //HSSF = "Horrible Spread Sheet Format. Use it for files ending with ".xls" "
        XSSFSheet sheet=book.getSheetAt(0);
        XSSFRow row= sheet.getRow(0) ;
        XSSFCell cell=row.getCell(0);
        int rowSize=sheet.getPhysicalNumberOfRows();
        int cellSize=row.getLastCellNum();
        System.out.println(rowSize);
        System.out.println(cellSize);
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<cellSize;j++){
                System.out.println(sheet.getRow(i).getCell(j));
            }
        }
    }
}
