package com.myretail.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataAccessException;

@Configuration
public class LoadBatchData extends CassandraUtil {

	public void loadData() {
		try {
			cassandraTemplate().execute(
					"BEGIN BATCH USING TIMESTAMP " + "   "
							+ "insert INTO myretail.product_demand(product_id, reservation_id, demand_qty, update_timestamp ) VALUES ('125', '5', 14.5, '2015-09-17T18:30:00.000+0000'); "
							+ "INSERT INTO myretail.product_demand(product_id, reservation_id, demand_qty, update_timestamp) VALUES  ('126', '6', 15.5, '2015-09-17T18:30:00.000+0000'); "
							+ "INSERT INTO myretail.product_demand(product_id, reservation_id, demand_qty, update_timestamp) VALUES  ('127', '7', 16.5, '2015-09-17T18:30:00.000+0000'); "
							+ "INSERT INTO myretail.product_demand(product_id, reservation_id, demand_qty, update_timestamp) VALUES  ('128', '8', 17.5, '2015-09-17T18:30:00.000+0000'); " 
					+ "APPLY BATCH");
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		LoadBatchData loadBatchData = new LoadBatchData();
		loadBatchData.loadData();
	}
}
