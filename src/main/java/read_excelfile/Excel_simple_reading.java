package read_excelfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.Test;

public class Excel_simple_reading {
	
	@Test
	public void read_excel_file() throws IOException {
		String path = "C:\\Users\\Administrator\\Desktop\\Testing.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("RK");
     //   System.out.println(sheet.getRow(2).getCell(3));
		//if I value is test case name then capture the row value
		int lastRow = sheet.getLastRowNum();
		System.out.println("Last row- " + lastRow);
		for (int i = 0; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			int lastCell = row.getLastCellNum();
			for (int j = 0; j < lastCell; j++) {
				Cell cell = row.getCell(j);
			//	System.out.println(i+":"+j);
				//if the j value matches the column name capture the column name 
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			System.out.println();


	}
	}
	
	@Test
	public void read_excel_aspercondition() {
		readXLs("Smoke_3","First name");
	}

	
	
	public void readXLs(String testName , String columnName){

		//readXL("TC004" , "Password");

		try {
			String path = "C:\\Users\\Administrator\\Desktop\\Testing.xls";
			FileInputStream fis = new FileInputStream(path);
			Workbook workbook = new HSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("RK");
			int lastRow = sheet.getLastRowNum();
			System.out.println("Last row- " + lastRow);
			for (int i = 0; i <= lastRow; i++) {
				Row row = sheet.getRow(i);
				int lastCell = row.getLastCellNum();
				Cell cell = row.getCell(0);
				String value = cell.getStringCellValue();
				//System.out.println(value);
				if(value.equals(testName)){
					Row rownew = sheet.getRow(0);
					for (int j = 0; j < lastCell; j++) {
						Cell cellnew = rownew.getCell(j);
						String valuenew = cell.getStringCellValue();
						if(cellnew.toString().equals(columnName)) {

							System.out.println(sheet.getRow(i).getCell(j));

						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
}
	


