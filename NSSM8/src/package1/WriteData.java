package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		File file= new File("./excelreport/reporttest.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("Automation");
		/*XSSFRow rw=sh.createRow(1);
		XSSFCell c1=rw.createCell(3, CellType.STRING);
		c1.setCellValue("Selenium Execution");*/
		sh.createRow(0).createCell(1).setCellValue("PASS");
		sh.createRow(1).createCell(1).setCellValue("FAIL");
		
		/*sh.getRow(0).createCell(1).setCellValue("PASS");
		sh.getRow(1).createCell(1).setCellValue("Fail");*/
		
		wb.write(fos);
		System.out.println("Witten..");
				
	}

}
