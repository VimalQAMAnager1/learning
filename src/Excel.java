

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		ArrayList<String> a= new ArrayList<String>();

		 FileInputStream fis= new FileInputStream("C:\\Users\\Lenovo\\Demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		System.out.println(sheets);
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Test"))
			{
				XSSFSheet sht=workbook.getSheetAt(i);
				Iterator<Row>rows=sht.iterator();
				Row firstrow=rows.next();
				Iterator<Cell> ce=firstrow.iterator();
				int k=0;
				int column=0;
				while(ce.hasNext())
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCase"))
					{
				     column= k;
				     }
					k++;
				}
				
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))
					{
						Iterator<Cell> cv=r.cellIterator();
						while(cv.hasNext())
						{
							a.add(cv.next().getStringCellValue());
						}
						
					}
					}
					
				
				
			}
			
		}
		
	}
	
	}


