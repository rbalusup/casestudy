package com.myretail.entity;

import java.util.Date;

import org.springframework.cassandra.core.Ordering;
import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table("inventory")
public class Inventory {
	
	@PrimaryKeyColumn(name="product_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String productId;

	@PrimaryKeyColumn(name="location_id", ordinal = 1, type = PrimaryKeyType.CLUSTERED, ordering = Ordering.ASCENDING)
	private String locationId;

	@Column(value="avail_on_hand")
	private Double availOnHand;

	@Column(value = "avail_on_hand_sync_time")
	private Date availOnSyncTime;

	public Inventory() {
		super();
	}
	
	public Inventory(String productId, String locationId, Double availOnHand, Date availOnSyncTime) {
		super();
		this.productId = productId;
		this.locationId = locationId;
		this.availOnHand = availOnHand;
		this.availOnSyncTime = availOnSyncTime;
	}

	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Date getAvailOnSyncTime() {
		return availOnSyncTime;
	}

	public void setAvailOnSyncTime(Date availOnSyncTime) {
		this.availOnSyncTime = availOnSyncTime;
	}

	public Double getAvailOnHand() {
		return availOnHand;
	}

	public void setAvailOnHand(Double availOnHand) {
		this.availOnHand = availOnHand;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "Employee [productId=" + productId + ", locationId=" + locationId + ", availOnHand=" + availOnHand + ", availOnSyncTime=" + availOnSyncTime + "]";
	}
}
