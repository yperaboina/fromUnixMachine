package javaprograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		
	
		
		FileInputStream inputStream = new FileInputStream(new File("D:\\SnapFish Documents (1)\\UA APIs_Test Cases.xlsx"));
	Workbook workbook = new XSSFWorkbook(inputStream);
	org.apache.poi.ss.usermodel.Sheet firstSheet = workbook.getSheet("Smoke Test Cases");


	

	

	int rowCount = firstSheet.getLastRowNum()-firstSheet.getFirstRowNum();




	for (int i = 1; i <= rowCount; i++) {



			List<String> RuleCreationList = new ArrayList<String>();

			Row row = firstSheet.getRow(i);


			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				String eachCellValue = "";
				if(cell == null){
					RuleCreationList.add(eachCellValue);
					continue;
				}

				//cell.setCellType(Cell.CELL_TYPE_STRING);
				eachCellValue = cell.getStringCellValue();
				RuleCreationList.add(eachCellValue);
			}

			//}

		String	RuleSet = RuleCreationList.get(1);
		
		System.out.println(RuleSet);

		
		
}
	}
}