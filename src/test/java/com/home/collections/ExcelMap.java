package com.home.collections;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Learning

public class ExcelMap {
	
	public static void TestDataMap(){
		try {
		FileInputStream FIS = new FileInputStream("G:\\Mohan\\Selenium_Software\\WorkSpace\\learning\\CORE_API_TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(FIS);
		XSSFSheet ws = wb.getSheet("Users");
		
		int SheetRows = ws.getPhysicalNumberOfRows();
		System.out.println("No of Rows in Excel is " + SheetRows);
		int LastRowNum = ws.getLastRowNum();
		System.out.println("No of Rows in Excel is " + LastRowNum);
		int LastColNum = ws.getRow(0).getLastCellNum();
		int Cells = ws.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of CElls in Excel is " + LastColNum);
		System.out.println("No of Physical CElls in Excel is " + Cells);
		
		ArrayList<Map<String,String>> mapArray = new ArrayList<Map<String,String>>();
		Map<String,String> TestData = new LinkedHashMap<String,String>();
		
		
		for(int i = 0; i<LastRowNum;i++) {//Get Row Num
			for(int j=0;j<LastColNum;j++) {//Get Col Num
				TestData.put(ws.getRow(0).getCell(j).toString(), ws.getRow(i+1).getCell(j).toString());
			}
			mapArray.add(TestData);
		}
		System.out.println(TestData);
		System.out.println(mapArray);
		System.out.println(TestData.get("TestCaseID"));
		}
		catch(Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		new ExcelMap().TestDataMap();
	}

}
