package com.idfc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.idfc.beans.Sheet0;
import com.idfc.beans.Sheet1;
import com.idfc.beans.Sheet2;
@Repository("daorepo")
public class DAOImpl implements DAO {
	
	private  String sheet1Query="INSERT INTO public.sheet1(\r\n"
			+ "	chequeid, chequetype, dealingbankid, paymentmode, chequenum, chequedate, chequeamt, deposit_status)\r\n"
			+ "	VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	private  String sheet2Query="INSERT INTO public.sheet2(\r\n"
			+ "	chequeid, chequetype, dealingbankid, paymentmode, chequenum, chequedate, chequeamt, deposit_status)\r\n"
			+ "	VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	private  String sheet3Query="INSERT INTO public.sheet3(\r\n"
			+ "	chequeid, chequetype, dealingbankid, paymentmode, chequenum, chequedate, chequeamt, deposit_status)\r\n"
			+ "	VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	
	
	@Autowired
	JdbcTemplate jt;

	@Override
	public int[] insertSheet1(List<Sheet0> sheet) {
		
		
		int i[];
		
	i=	jt.batchUpdate(sheet1Query, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				// TODO Auto-generated method stub
				
				ps.setString(1, sheet.get(i).getCHEQUEID());
				ps.setString(2, sheet.get(i).getCHEQUETYPE());
				ps.setString(3, sheet.get(i).getDEALINGBANKID());
				ps.setString(4, sheet.get(i).getPAYMENTMODE());
				ps.setString(5, sheet.get(i).getCHEQUENUM());
				ps.setString(6, sheet.get(i).getCHEQUEDATE());
				ps.setString(7, sheet.get(i).getCHEQUEAMT());
				ps.setString(8, sheet.get(i).getDEPOSIT_STATUS());
				
				
			}
			
			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return sheet.size();
			}
		});
		
		
		
		
		// TODO Auto-generated method stub
		return i;
	}

	@Override
	public int[] insertSheet2(List<Sheet1> sheet) {
		// TODO Auto-generated method stub
		
		
		
		int i[]=null;
i=	jt.batchUpdate(sheet2Query, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				// TODO Auto-generated method stub
				
				ps.setString(1, sheet.get(i).getCHEQUEID());
				ps.setString(2, sheet.get(i).getCHEQUETYPE());
				ps.setString(3, sheet.get(i).getDEALINGBANKID());
				ps.setString(4, sheet.get(i).getPAYMENTMODE());
				ps.setString(5, sheet.get(i).getCHEQUENUM());
				ps.setString(6, sheet.get(i).getCHEQUEDATE());
				ps.setString(7, sheet.get(i).getCHEQUEAMT());
				ps.setString(8, sheet.get(i).getDEPOSIT_STATUS());
				
				
			}
			
			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return sheet.size();
			}
		});
		
		
		
		
		// TODO Auto-generated method stub
		return i;
	}

	@Override
	public int[] insertSheet3(List<Sheet2> sheet) {
		
		
		
		int i[]=null;
i=	jt.batchUpdate(sheet3Query, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				// TODO Auto-generated method stub
				
				ps.setString(1, sheet.get(i).getCHEQUEID());
				ps.setString(2, sheet.get(i).getCHEQUETYPE());
				ps.setString(3, sheet.get(i).getDEALINGBANKID());
				ps.setString(4, sheet.get(i).getPAYMENTMODE());
				ps.setString(5, sheet.get(i).getCHEQUENUM());
				ps.setString(6, sheet.get(i).getCHEQUEDATE());
				ps.setString(7, sheet.get(i).getCHEQUEAMT());
				ps.setString(8, sheet.get(i).getDEPOSIT_STATUS());
				
				
			}
			
			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return sheet.size();
			}
		});
		
		
		
		
		// TODO Auto-generated method stub
		return i;
		
		
	}



}
