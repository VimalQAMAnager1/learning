import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class getData {
   
	@Test
	public ArrayList<String> dataDriven(String TestCase) throws IOException  {
		
		ArrayList<String> a = new ArrayList<String>();
		 FileInputStream fis= new FileInputStream("C:\\Users\\Lenovo\\Demodata.xlsx");
		 XSSFWorkbook workbook= new XSSFWorkbook(fis);
		int sheets= workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Test"))
			{
			XSSFSheet sht=workbook.getSheetAt(i);
			Iterator<Row> rows=sht.iterator();
			Row fr=rows.next();
			Iterator<Cell> cell= fr.iterator();
			int k=0;
			int column=0;
			while(cell.hasNext())
			{
				Cell value=cell.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCase"))
				{
					column=k;
				}
				k++;
			}
			while(rows.hasNext())
			{
				Row r=rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))
				{
					Iterator<Cell> ce=r.cellIterator();
					while(ce.hasNext())
					{
						Cell c=ce.next();
						if(c.getCellType()==CellType.STRING)
						{
							a.add(c.getStringCellValue());
						}
						else
						{
							a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						}
							
					}
					
				}
			}
			}
			   
			
			
		}
		return a;

	} 

}
