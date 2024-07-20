import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PLP {
    WebDriver driver;

    @FindBy

    public PDP(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void generateExcelSheet() {

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data");

        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Product Name");
        row.createCell(0).setCellValue("Product Price");

        FileOutputStream fileOut = new FileOutputStream("excelsheet.xlsx");
        workbook.write(fileOut);
        workbook.close();

    }

    public void clickOnAnyProduct() {

    }

}
