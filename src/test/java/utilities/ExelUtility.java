package utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExelUtility {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    /**
     * This method will open/load an Exel sheet
     * @param filePath
     * @param sheetName
     */
    public static void getExelInstance(String filePath, String sheetName){
        try {
            workbook = new XSSFWorkbook(filePath);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method will return the number of Rows present in the sheet
     * @return
     */
    public static int getRowCount(){
        int rowCount = sheet.getPhysicalNumberOfRows();
        return rowCount;
    }

    /**
     * This method will return the number of Columns present in the sheet
     * @return
     */
    public static int getColumnCount(){
        int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
        return columnCount;
    }

    /**
     * This method will return the value of the cell at the specific row and column numbers
     * @param rowNumber
     * @param columnNumber
     * @return
     */
    public static String getCellDataString(int rowNumber, int columnNumber){
        String cellData = sheet.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
        return cellData;
    }


}
