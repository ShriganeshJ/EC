package com.idfc.controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.idfc.beans.Sheet0;
import com.idfc.beans.Sheet1;
import com.idfc.beans.Sheet2;
import com.idfc.dao.DAO;
import com.idfc.dao.DAOImpl;
import com.idfc.read.ReadFieles;

@SpringBootApplication
@ComponentScan("com.idfc.dao")
public class Controller {

	static ApplicationContext ctx;
	private static List<Sheet0> sheet0List;
	private static List<Sheet1> sheet1List;
	private static List<Sheet2> sheet2List;

	public static void main(String[] args) throws IOException {
		ExecutorService service = Executors.newFixedThreadPool(5);
		ReadFieles files = new ReadFieles();

		service.submit(() -> {
			try {
				sheet0List = files.redSheet0();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		service.submit(() -> {
			try {
				sheet1List = files.redSheet1();
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		service.submit(() -> {
			try {
				sheet2List = files.redSheet2();
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		service.shutdown();

		ctx = SpringApplication.run(Controller.class, args);
		
		
		DAO dao= ctx.getBean("daorepo",DAOImpl.class);
		
	
		System.out.println("sheet01::"+dao.insertSheet1(sheet0List));	
		System.out.println("sheet02::"+dao.insertSheet2(sheet1List));	
		System.out.println("sheet03::"+dao.insertSheet3(sheet2List));	

	}

}
