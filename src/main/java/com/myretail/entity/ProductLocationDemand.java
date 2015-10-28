package com.myretail.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table("product_location_demand")
public class ProductLocationDemand {
	
	@PrimaryKeyColumn(name="product_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String productId;

	@PrimaryKeyColumn(name="location_id", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
	private String locationId;
	
	@PrimaryKeyColumn(name="reservation_id", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
	private String reservationId;

	@Column(value="demand_qty")
	private BigDecimal demandQty;

	@Column(value = "update_timestamp")
	private Timestamp updateTimestamp;

	public ProductLocationDemand() {
		super();
	}
	
	public ProductLocationDemand(String productId, String locationId, String reservationId, BigDecimal demandQty, Timestamp updateTimestamp) {
		super();
		this.productId = productId;
		this.locationId = locationId;
		this.reservationId = reservationId;
		this.demandQty = demandQty;
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

	public BigDecimal getDemandQty() {
		return demandQty;
	}

	public void setDemandQty(BigDecimal demandQty) {
		this.demandQty = demandQty;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "Employee [productId=" + productId + ", locationId=" + locationId + ", reservationId=" + reservationId + ", demandQty=" + demandQty + ", updateTimestamp=" + updateTimestamp + "]";
	}
}
