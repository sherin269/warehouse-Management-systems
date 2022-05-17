package com.sheri.wms.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="ILPN")

public class ILPNEntity extends BaseEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="seqgen", sequenceName="ILPN_ID_AUTOINC_SEQ")
	@Column(name="ILPN_ID")
	private Integer ilpnId;
	
	@Column(name="ILPN_NUMBER")
	private String ilpnNumber;
	
	
	@ManyToOne(fetch = FetchType.EAGER)  
	private ItemEntity itemEntity;
	
	@Column(name="QTY")
	private Integer qty;
	
	@Column(name="BATCH")
	private String batch;
	
	@Column(name="STATUS")
	private Integer status;
	
	@Column(name="CURRENT_LOCATION")
	private Integer currentLocation;

	public Integer getIlpnId() {
		return ilpnId;
	}

	public void setIlpnId(Integer ilpnId) {
		this.ilpnId = ilpnId;
	}

	public String getIlpnNumber() {
		return ilpnNumber;
	}

	public void setIlpnNumber(String ilpnNumber) {
		this.ilpnNumber = ilpnNumber;
	}

	

	public ItemEntity getItemEntity() {
		return itemEntity;
	}

	public void setItemEntity(ItemEntity itemEntity) {
		this.itemEntity = itemEntity;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Integer currentLocation) {
		this.currentLocation = currentLocation;
	}

}
