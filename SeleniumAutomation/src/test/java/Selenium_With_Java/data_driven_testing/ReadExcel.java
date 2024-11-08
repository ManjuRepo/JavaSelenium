package Selenium_With_Java.data_driven_testing;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;

public class ReadExcel {
	public static void main(String[] args) {

		// FileInputStream used to get the data from excel sheet

		try (FileInputStream file = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\testdata\\Comparision Repost.xlsx"))) {
			Workbook workbook = WorkbookFactory.create(file);
			Sheet sheet = workbook.getSheet("OCT 1st");
			for (Row row : sheet) {
				for (Cell cell : row) {

					if (cell.toString().contains(
							"GET-/api/tlmsh/getrolloverplannew/{staffPositionId},{month},{year},{reportingStaffPositionId},{rolloverType}")) {
						System.out.print(cell.toString() + "\t");
					}
				}
				System.out.println();
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
