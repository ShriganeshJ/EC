package com.js.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.js.beans.CasesBO;
import com.js.beans.CasesVO;
@Repository("DAO")
public interface DetailsDAO {
	
	
	public int [] getDetails(List<CasesBO> list);

}
