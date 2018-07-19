package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.ProductBO;
import com.nt.bo.ProductResultBO;

@Repository
public class ProductDAOImpl implements ProductDAO {

	private static final String GET_PRODUCTS = "select * from product where(id is not null and id=?) or (name is not null and name like ?) or (price is not null and quantity=?)";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public List<ProductResultBO> getProducts(ProductBO pBO) {
		List<ProductResultBO> listResultBO = null;

		listResultBO = (List<ProductResultBO>) jt.query(GET_PRODUCTS, new ResultSetExtractor<List<ProductResultBO>>() {

			@Override
			public List<ProductResultBO> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<ProductResultBO> listrbo = new ArrayList<>();
				while (rs.next()) {
					System.out.println(rs.getInt(1)+"\n"+ rs.getString(2)+"\n"+ rs.getFloat(3)+"\n"+
							rs.getInt(4)+"\n"+ rs.getDate(5)+"\n"+ rs.getDate(6));
					ProductResultBO rbo = new ProductResultBO(rs.getInt(1), rs.getString(2), rs.getFloat(3),
							rs.getInt(4), rs.getDate(5), rs.getDate(6));
					listrbo.add(rbo);
				}
				return listrbo;
			}

		},pBO.getProductId(),pBO.getProductName(),pBO.getQuantity());
		return listResultBO;
	}

}
