package com.js.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.js.beans.CasesBO;
import com.js.beans.CasesVO;


public class DetailsDAOImpl implements DetailsDAO {

	public DetailsDAOImpl() {
		// TODO Auto-generated constructor stub

		System.out.println("DAO constructor");
	}

	@Autowired
	JdbcTemplate jt;
	int[] data;

	@Override
	public int[] getDetails(List<CasesBO> list) {

		data = jt.batchUpdate("INSERT INTO public.\"UserDetails\"(\r\n" + "	id, use_id, title, completed)\r\n"
				+ "	VALUES (?, ?, ?, ?)", new BatchPreparedStatementSetter() {

					@Override
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						// TODO Auto-generated method stub

						ps.setInt(1, list.get(i).getId());
						ps.setInt(2, list.get(i).getUserId());
						ps.setString(3, list.get(i).getTitle());
						ps.setBoolean(4, list.get(i).isCompleted());

					}

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return list.size();
					}
				});
		// TODO Auto-generated method stub

		System.out.println("List of data" + data);

		return data;

	}

}
