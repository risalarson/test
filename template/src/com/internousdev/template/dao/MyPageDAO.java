package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.internousdev.template.dto.MyPageDTO;
import com.internousdev.template.util.DBConnector;

public class MyPageDAO {

	public MyPageDTO getMyPageUserInfo(String item_transaction_id, String user_master_id) throws SQLException{
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		MyPageDTO myPageDTO=new MyPageDTO();

		String sql="SELECT iit.item_name, ubit.total_price, ubit.total_count, "
				+ "ubit.pay FROM user_buy_item_transaction ubit.item_transaction_id=? "
				+ "AND ubit.user_master_id=? ORDER BY ubit.insert_date DESC";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
		}
	}
}
