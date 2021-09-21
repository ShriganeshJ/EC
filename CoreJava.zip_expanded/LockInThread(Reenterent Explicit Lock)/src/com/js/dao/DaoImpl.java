package com.js.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DaoImpl {
	
	
	
	List<ProductTableEntity> list =ProductDB.getProducts();
	

	public  void  sellProduct(String productName,int quantity)
	{
	System.out.println(Thread.currentThread().getName());
	
		
		for(int i=0;i<list.size();i++)
		{
			
			if(list.get(i).getName().equals(productName))
			{
				
				
				list.get(i).setQuantity(list.get(i).getQuantity()-quantity);
				System.out.println(Thread.currentThread().getName()+" Updated");
				
			}
			
			
			
		}
		
		
	}
	
	
	
	public List<ProductTableEntity> getProductTable()
	{
		
		return list;
	}
	
	
	
	
	
	
}
