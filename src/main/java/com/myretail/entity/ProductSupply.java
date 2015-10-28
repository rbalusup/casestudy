package com.myretail.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table("product_supply")
public class ProductSupply {
	@PrimaryKeyColumn(name="product_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String productId;

	@PrimaryKeyColumn(name="location_id", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
	private String locationId;
	
	@PrimaryKeyColumn(name="reservation_id", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	private String reservationId;

	@Column(value="supply_qty")
	private BigDecimal supplyQty;

	@PrimaryKeyColumn(name = "update_timestamp", ordinal = 3, type = PrimaryKeyType.CLUSTERED)
	private Timestamp updateTimestamp;

	public ProductSupply() {
		super();
	}
	
	public ProductSupply(String productId, String locationId, String reservationId, BigDecimal supplyQty, Timestamp updateTimestamp) {
		super();
		this.productId = productId;
		this.locationId = locationId;
		this.reservationId = reservationId;
		this.supplyQty = supplyQty;
		this.updateTimestamp = updateTimestamp;
	}

	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getReservationId() {
		return reservationId;
	}


	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public BigDecimal getSupplyQty() {
		return supplyQty;
	}

	public void setSupplyQty(BigDecimal supplyQty) {
		this.supplyQty = supplyQty;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "Employee [productId=" + productId + ", locationId=" + locationId + ", reservationId=" + reservationId + ", supplyQty=" + supplyQty + ", updateTimestamp=" + updateTimestamp + "]";
	}
}
