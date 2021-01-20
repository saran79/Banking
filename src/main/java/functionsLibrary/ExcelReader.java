package functionsLibrary;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {

    public void fileRead() throws IOException {
        FileInputStream fileInputStream=new FileInputStream(FilePaths.ExcelFilePath);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

          /*int rows = xssfSheet.getLastRowNum();
          //int cols= xssfSheet.getr

        for ( int r = 0;r < rows;r++) {

            XSSFRow row = xssfSheet.getRow(r);

            for(int c= 0;c<row.getLastCellNum();c++){

                XSSFCell cell = row.getCell(c);

                System.out.println(cell.getStringCellValue());
            }
        }*/

        Iterator it = xssfSheet.iterator();

          while(it.hasNext()){
            XSSFRow row =  (XSSFRow)it.next();

            Iterator cellIt = row.cellIterator();

            while (cellIt.hasNext()) {
                XSSFCell cell = (XSSFCell) cellIt.next();

            }

          }
        }

        public void getData() {

        }
        }