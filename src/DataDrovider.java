import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrovider {

	@Test(dataProvider="Data")
	public void dataDriven(String name,String url, String greet) {
		System.out.println(name+url+greet);

	}
	
	@DataProvider(name="Data")
	public Object[][] getData()  {
		
	Object[][] a= new Object[] [] {{"vimal","Rahu","kim"},{"aak","vim","raj"}};
		return a;
	/*	DataFormatter df= new DataFormatter();
		FileInputStream fis= new FileInputStream("C:\\Demodata.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet sheet=wb.getSheetAt(0);
		int sht=sheet.getPhysicalNumberOfRows();
		 XSSFRow s=sheet.getRow(0);
		 int k=s.getLastCellNum();
		 Object[][] a= new Object[sht-1][k];
		 for(int i=0;i<sht;i++)
		 {
			 s=sheet.getRow(i+1);
			 for(int j=0;j<k;j++)
			 {
				 XSSFCell cell=s.getCell(j);
				 df.formatCellValue(cell);
				 a[i][j]=  df.formatCellValue(cell);
				 
			 }
		 }
		 return a;*/
		
		
		
	}

}
