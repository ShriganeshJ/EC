package com.idfc.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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

public class ReadFieles022 {

	FileOutputStream fos;
	HSSFWorkbook wb;
	DataFormatter df;
	String their_reference;
	String errorCount;
	String errorText;
	String status;

	public ReadFieles022(String their_reference, String errorCount, String errorText, String status)
			throws IOException {
		// TODO Auto-generated constructor stub
		this.their_reference = their_reference;
		this.errorCount = errorCount;
		this.errorText = errorCount;
		this.status = status;
		fos = new FileOutputStream("input\\Demo02.xls");
		wb = new HSSFWorkbook();
		df = new DataFormatter();
	}

	public void redSheet0() throws IOException, InterruptedException {

		HSSFSheet sheet = wb.createSheet();

		Row row0 = sheet.createRow(0);

		row0.createCell(0).setCellValue("their_referance");

		Row row1 = sheet.createRow(1);
		row1.createCell(1).setCellValue("their_referance");
		Row row2 = sheet.createRow(2);
		row2.createCell(2).setCellValue("their_referance");
		Row row3 = sheet.createRow(3);
		row3.createCell(3).setCellValue("their_referance");
		Row row4 = sheet.createRow(4);
		row4.createCell(4).setCellValue("their_referance");

		wb.write(fos);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		ReadFieles022 rfs = new ReadFieles022("abcd", "abcd", "abcd", "abcd");
		rfs.redSheet0();
	}

}
