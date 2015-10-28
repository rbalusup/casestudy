package com.myretail.entity;

import java.util.Date;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table("product_demand")
public class ProductDemand {
	
	@PrimaryKeyColumn(name="product_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String productId;
	
	@PrimaryKeyColumn(name="reservation_id", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
	private String reservationId;

	@Column(value="demand_qty")
	private Double demandQty;

	@Column(value = "update_timestamp")
	private Date updateTimestamp;

	public ProductDemand() {
		super();
	}
	
	public ProductDemand(String productId, String reservationId, Double demandQty, Date updateTimestamp) {
		super();
		this.productId = productId;
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

	public Date getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public Double getDemandQty() {
		return demandQty;
	}

	public void setDemandQty(Double demandQty) {
		this.demandQty = demandQty;
	}

	@Override
	public String toString() {
		return "Employee [productId=" + productId + ", reservationId=" + reservationId + ", demandQty=" + demandQty + ", updateTimestamp=" + updateTimestamp + "]";
	}
}
