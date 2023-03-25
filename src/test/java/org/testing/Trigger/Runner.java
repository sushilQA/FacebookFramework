	package org.testing.Trigger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Runner {

	public static void main(String[] args) throws BiffException, IOException {

		XmlSuite xmlSuite = new XmlSuite();
		xmlSuite.setName("Suite1");
		XmlTest xmlTest = new XmlTest(xmlSuite);
		File file = new File("../YTFramwork/src/test/java/org/testing/Trigger/TestRunner.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		ArrayList<XmlClass> arrayList1 = new ArrayList<XmlClass>();
		for (int i = 1; i < rows; i++) {
			Cell cell = sheet.getCell(4, i);
			if (cell.getContents().equals("Y")) {
				Cell pkgName = sheet.getCell(2, i);
				Cell class_name = sheet.getCell(3, i);
				String v = pkgName.getContents() + "." + class_name.getContents();
				XmlClass xmlClass1 = new XmlClass(v); // xmlclass
				arrayList1.add(xmlClass1);
			}
		}
		System.out.println(arrayList1.size());
		xmlTest.setClasses(arrayList1);
		ArrayList<XmlTest> arrayList2 = new ArrayList<XmlTest>();
		arrayList2.add(xmlTest);
		xmlSuite.setTests(arrayList2);
		ArrayList<XmlSuite> arrayList3 = new ArrayList<XmlSuite>();
		arrayList3.add(xmlSuite);
		TestNG testNG = new TestNG();
		testNG.setXmlSuites(arrayList3);
		testNG.run();
	}
}
