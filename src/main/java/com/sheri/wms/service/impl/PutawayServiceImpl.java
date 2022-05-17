package com.sheri.wms.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheri.wms.dao.ILPNDao;
import com.sheri.wms.dao.InventoryDao;
import com.sheri.wms.dao.ItemDao;
import com.sheri.wms.dao.LocationDao;
import com.sheri.wms.dto.PutawayDto;
import com.sheri.wms.entity.ILPNEntity;
import com.sheri.wms.entity.InventoryEntity;
import com.sheri.wms.entity.ItemEntity;
import com.sheri.wms.entity.LocationEntity;
import com.sheri.wms.service.PutawayService;
import com.sheri.wms.utils.GeneralUtils;
@Service
public class PutawayServiceImpl implements PutawayService
{	
	@Autowired
	ILPNDao ilpnDao;
	@Autowired
	ItemDao itemDao;
	@Autowired
	LocationDao locationDao;
	@Autowired
	InventoryDao inventoryDao;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public void putawayILPN(PutawayDto pdto)
	{
		InventoryEntity inventoryEntity=new InventoryEntity();
		validatePutaway(pdto,inventoryEntity);
		
		if(!pdto.hasErrors())
		{
			inventoryDao.saveInventory(inventoryEntity);
			
			
		}
		
		return ;
	}
	private void validatePutaway(PutawayDto pdto,InventoryEntity inventoryEntity)
	{  
		if(GeneralUtils.isNullOrEmpty(pdto.getLpnNumber()))
		{
			pdto.addError("ILPN Number Cannot Be Empty");
		}
		if(GeneralUtils.isNullOrEmpty(pdto.getLocationBarcode()))
		{
			pdto.addError("Location Barcode Cannot Be Empty");
		}
		if(pdto.hasErrors())
		{
			return;
		}
		ILPNEntity ilpnEntity= ilpnDao.getILPNByIlpnNumber(pdto.getLpnNumber());
		
		
		
		if(ilpnEntity==null)
		{
			pdto.addError("ILPN Doesnot Exist in DB...Please Enter A Valid ILPN");
			
		}
		else if(ilpnEntity.getStatus()==null || ilpnEntity.getStatus()!=100)
		{
			pdto.addError("Invalid ILPN Status...");
		}
		else
		{
			ilpnEntity.setStatus(200);
			
			
			inventoryEntity.setItemEntity(ilpnEntity.getItemEntity());
			inventoryEntity.setAllocatedQty(0);
			
			inventoryEntity.setOnhandQty(ilpnEntity.getQty());
		}
		
		LocationEntity locationEntity=locationDao.getLocationByBarcode(pdto.getLocationBarcode());
		
		if(locationEntity==null)
		{
			pdto.addError("Invalid location...Try with valid Locations");
		}
		else
		{
			inventoryEntity.setLocationEntity(locationEntity);
		}
		
		
		
		
	}

}
