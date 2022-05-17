package com.sheri.wms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name="TASK")
public class TaskEntity extends BaseEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="seqgen", sequenceName="TASK_ID_AUTOINC_SEQ")
	@Column(name="TASK_ID")
	private Integer taskId;
	
	@Column(name="ORDER_NUMBER")
	private String orderNumber;
	
	
	@ManyToOne(cascade=CascadeType.ALL)  
	private ItemEntity itemEntity;
	
	@Column(name="QTY")
	private Integer qty;
	
	@ManyToOne(cascade=CascadeType.ALL)  
	private LocationEntity locationEntity;

	@Column(name="STATUS")
	private Integer status;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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

	public LocationEntity getLocationEntity() {
		return locationEntity;
	}

	public void setLocationEntity(LocationEntity locationEntity) {
		this.locationEntity = locationEntity;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	


}
