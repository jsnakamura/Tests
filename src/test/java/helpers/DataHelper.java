package helpers;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHelper {

	public static HashMap<String, String> storeValues = new HashMap<String, String>();

	public static List<HashMap<String, String>> data() {

		List<HashMap<String, String>> myData = new ArrayList<>();
		try {
			FileInputStream fileInput = new FileInputStream(
					System.getProperty("user.dir") + "//src//test//resources//testData/TestData.xlsx");

			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
			XSSFSheet sheet = workbook.getSheet("TestData");

			Row headerRow = sheet.getRow(0);

			sheet.forEach((Row row) -> {

				if (row.getRowNum() == 0)
					return;

				HashMap<String, String> currentHash = new HashMap<String, String>();

				row.forEach((Cell cell) -> {

					switch (cell.getCellType()) {

					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(String.valueOf((int) cell.getNumericCellValue()) + "\t");

						currentHash.put(headerRow.getCell(cell.getColumnIndex()).getStringCellValue(),
								String.valueOf((int) cell.getNumericCellValue()));
						break;

					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t");

						currentHash.put(headerRow.getCell(cell.getColumnIndex()).getStringCellValue(),
								cell.getStringCellValue());
						break;
					}

				});

				myData.add(currentHash);
			});

			fileInput.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		return myData;
	}

	public static String getMapValue(List<HashMap<String, String>> datamap, int row, String field) {

		return datamap.get(row).get(field);
	}
}
