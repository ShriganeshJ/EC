package com.idfc.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

import com.idfc.beans.Sheet0;
import com.idfc.beans.Sheet1;
import com.idfc.beans.Sheet2;
import com.idfc.beans.Sheet3;
import com.idfc.beans.Sheet4;
import com.idfc.beans.Sheet5;

public class ReadFieles {

	FileInputStream fis;
	HSSFWorkbook wb;
	DataFormatter df;
	Sheet0 sheet0;
	Sheet1 sheet1;
	Sheet2 sheet2;
	Sheet3 sheet3;
	Sheet4 sheet4;
	Sheet5 sheet5;

	public ReadFieles() throws IOException {
		// TODO Auto-generated constructor stub

		fis = new FileInputStream(new File("input\\Demo.xls"));
		wb = new HSSFWorkbook(fis);
		df = new DataFormatter();
	}

	public List<Sheet0> redSheet0() throws IOException, InterruptedException {

		List<Sheet0> sheetList = new ArrayList<Sheet0>();

		HSSFSheet sheet = wb.getSheetAt(0);

		for (Row row : sheet) {

			sheet0 = new Sheet0();

			sheet0.setCHEQUEID(df.formatCellValue(row.getCell(0)));
			sheet0.setCHEQUETYPE(df.formatCellValue(row.getCell(1)));
			sheet0.setDEALINGBANKID(df.formatCellValue(row.getCell(2)));
			sheet0.setPAYMENTMODE(df.formatCellValue(row.getCell(3)));
			sheet0.setCHEQUENUM(df.formatCellValue(row.getCell(4)));
			sheet0.setCHEQUEDATE(df.formatCellValue(row.getCell(5)));
			sheet0.setDEPOSIT_STATUS(df.formatCellValue(row.getCell(6)));
			sheet0.setDEPOSIT_MAKER(df.formatCellValue(row.getCell(7)));
			sheet0.setDEPOSITDATE(df.formatCellValue(row.getCell(8)));
			sheet0.setPAYSLIPNO(df.formatCellValue(row.getCell(9)));
			sheet0.setCMS_DEP_SLIP_NO(df.formatCellValue(row.getCell(10)));
			sheet0.setMC_DATE_AUTHORIZATIONDATE(df.formatCellValue(row.getCell(11)));
			sheet0.setMC_DATE_AUTHORIZATIONDATE(df.formatCellValue(row.getCell(12)));
			sheet0.setPRODUCTFLAG1(df.formatCellValue(row.getCell(13)));
			sheet0.setPRODUCTFLAG_CUSTOMERNAME(df.formatCellValue(row.getCell(14)));
			sheet0.setAGREEMENTNO(df.formatCellValue(row.getCell(15)));
			sheet0.setBRANCHID(df.formatCellValue(row.getCell(16)));
			sheet0.setBRANCHDESC(df.formatCellValue(row.getCell(17)));
			sheet0.setRECEIPTNO(df.formatCellValue(row.getCell(18)));
			sheetList.add(sheet0);

		}

		System.out.println("File 01 Id" + Thread.currentThread().getId());
		System.out.println("File 01 Name" + Thread.currentThread().getName());

		return sheetList;

	}

	public List<Sheet1> redSheet1() throws IOException, InterruptedException {

		List<Sheet1> sheetList = new ArrayList<Sheet1>();

		HSSFSheet sheet = wb.getSheetAt(1);

		for (Row row : sheet) {

			sheet1 = new Sheet1();

			sheet1.setCHEQUEID(df.formatCellValue(row.getCell(0)));
			sheet1.setCHEQUETYPE(df.formatCellValue(row.getCell(1)));
			sheet1.setDEALINGBANKID(df.formatCellValue(row.getCell(2)));
			sheet1.setPAYMENTMODE(df.formatCellValue(row.getCell(3)));
			sheet1.setCHEQUENUM(df.formatCellValue(row.getCell(4)));
			sheet1.setCHEQUEDATE(df.formatCellValue(row.getCell(5)));
			sheet1.setDEPOSIT_STATUS(df.formatCellValue(row.getCell(6)));
			sheet1.setDEPOSIT_MAKER(df.formatCellValue(row.getCell(7)));
			sheet1.setDEPOSITDATE(df.formatCellValue(row.getCell(8)));
			sheet1.setPAYSLIPNO(df.formatCellValue(row.getCell(9)));
			sheet1.setCMS_DEP_SLIP_NO(df.formatCellValue(row.getCell(10)));
			sheet1.setMC_DATE_AUTHORIZATIONDATE(df.formatCellValue(row.getCell(11)));
			sheet1.setMC_DATE_AUTHORIZATIONDATE(df.formatCellValue(row.getCell(12)));
			sheet1.setPRODUCTFLAG1(df.formatCellValue(row.getCell(13)));
			sheet1.setPRODUCTFLAG_CUSTOMERNAME(df.formatCellValue(row.getCell(14)));
			sheet1.setAGREEMENTNO(df.formatCellValue(row.getCell(15)));
			sheet1.setBRANCHID(df.formatCellValue(row.getCell(16)));
			sheet1.setBRANCHDESC(df.formatCellValue(row.getCell(17)));
			sheet1.setRECEIPTNO(df.formatCellValue(row.getCell(18)));
			sheetList.add(sheet1);

		}

		System.out.println("File 01 Id" + Thread.currentThread().getId());
		System.out.println("File 01 Name" + Thread.currentThread().getName());

		return sheetList;
	}

	public List<Sheet2> redSheet2() throws IOException, InterruptedException {

		List<Sheet2> sheetList = new ArrayList<Sheet2>();

		HSSFSheet sheet = wb.getSheetAt(2);

		for (Row row : sheet) {

			sheet2 = new Sheet2();

			sheet2.setCHEQUEID(df.formatCellValue(row.getCell(0)));
			sheet2.setCHEQUETYPE(df.formatCellValue(row.getCell(1)));
			sheet2.setDEALINGBANKID(df.formatCellValue(row.getCell(2)));
			sheet2.setPAYMENTMODE(df.formatCellValue(row.getCell(3)));
			sheet2.setCHEQUENUM(df.formatCellValue(row.getCell(4)));
			sheet2.setCHEQUEDATE(df.formatCellValue(row.getCell(5)));
			sheet2.setDEPOSIT_STATUS(df.formatCellValue(row.getCell(6)));
			sheet2.setDEPOSIT_MAKER(df.formatCellValue(row.getCell(7)));
			sheet2.setDEPOSITDATE(df.formatCellValue(row.getCell(8)));
			sheet2.setPAYSLIPNO(df.formatCellValue(row.getCell(9)));
			sheet2.setCMS_DEP_SLIP_NO(df.formatCellValue(row.getCell(10)));
			sheet2.setMC_DATE_AUTHORIZATIONDATE(df.formatCellValue(row.getCell(11)));
			sheet2.setMC_DATE_AUTHORIZATIONDATE(df.formatCellValue(row.getCell(12)));
			sheet2.setPRODUCTFLAG1(df.formatCellValue(row.getCell(13)));
			sheet2.setPRODUCTFLAG_CUSTOMERNAME(df.formatCellValue(row.getCell(14)));
			sheet2.setAGREEMENTNO(df.formatCellValue(row.getCell(15)));
			sheet2.setBRANCHID(df.formatCellValue(row.getCell(16)));
			sheet2.setBRANCHDESC(df.formatCellValue(row.getCell(17)));
			sheet2.setRECEIPTNO(df.formatCellValue(row.getCell(18)));
			sheetList.add(sheet2);

		}

		System.out.println("File 01 Id" + Thread.currentThread().getId());
		System.out.println("File 01 Name" + Thread.currentThread().getName());
		return sheetList;

	}

}
