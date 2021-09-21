package com.idfc.dao;

import java.util.List;

import com.idfc.beans.Sheet0;
import com.idfc.beans.Sheet1;
import com.idfc.beans.Sheet2;

public interface DAO {

	public int[] insertSheet1(List<Sheet0> sheet);

	public int[] insertSheet2(List<Sheet1> sheet);

	public int[] insertSheet3(List<Sheet2> sheet);

}
