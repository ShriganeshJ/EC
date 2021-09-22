package com.js.dao;

import java.util.ArrayList;
import java.util.List;

public class ProductDB {
	
	
	
	public static List<ProductTableEntity> getProducts()
	{
		List<ProductTableEntity> list = new ArrayList<ProductTableEntity>();
		
		for(int i=0;i<2000;i++)
		{
			ProductTableEntity entity = new ProductTableEntity();
			
			entity.setId(i);
			entity.setName("product"+i);
			entity.setQuantity(2000);
			
			list.add(entity);
		}
		
		
		return list;
		
		
	}

}
