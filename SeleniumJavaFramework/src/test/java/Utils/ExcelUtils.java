package Utils;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	//declare these variables in the class to be global so that we can access them below .
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	//create a constructor to call, Constructor is called every time a class object is created using the new keyword
	public ExcelUtils(String ExcelPath, String sheetName) {//WE parameterize the constructor to get the excel path and sheet name
	    try {
	
	    //create references for workbook
		workbook = new XSSFWorkbook(ExcelPath);
		//create references for worksheet
		sheet = workbook.getSheet(sheetName);
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
	
	//create a main method which is the starting point for any java program. and call the getrowcount function we created.
	public static void main(String[] args) {
		//getRowCount();
		getCellDataString(0, 0);
		getCellDataNumber(1, 1);
	}
	
	public static int getRowCount() {
		int rowCount=0;
		try {
			
	
		
		//call row count function
		rowCount =sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows : "+rowCount);
		
	}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}
		return rowCount;
	
	}
	public static int getColCount() {
		int colCount=0;
		try {
		//call row count function
		colCount =sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of columns : "+colCount);
		
	}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}
		return colCount;
}
	//now create a function to get cell data
	public static String getCellDataString(int rowNum, int colNum) {
		String cellData=null;
		try {

			//call function to get cell data
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
			
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}
	public static void getCellDataNumber(int rowNum, int colNum) { //
		try {
		
			//call function to get cell data
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
			
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	

}