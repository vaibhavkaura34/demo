import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readexceljxl {

	public static void main(String[] args) throws BiffException, IOException {
		File inputWorkbook = new File("F:/sampledata.xls");
		Workbook workbook;
		workbook = Workbook.getWorkbook(inputWorkbook);
		Sheet sheet = workbook.getSheet(0);
		int rowcount = sheet.getRows();
		int columncount = sheet.getColumns();
		
		for(int i=0;i<rowcount;i++) {
			for(int j=0 ; j<columncount; j++) {
				Cell cell = sheet.getCell(j,i);
				System.out.println(cell.getContents());
			}
			System.out.println();
		}

	}

}
