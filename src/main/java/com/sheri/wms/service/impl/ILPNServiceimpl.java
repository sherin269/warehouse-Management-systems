package com.sheri.wms.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheri.wms.dao.ILPNDao;
import com.sheri.wms.dao.ItemDao;
import com.sheri.wms.dto.ILPNDto;
import com.sheri.wms.entity.ILPNEntity;
import com.sheri.wms.entity.ItemEntity;
import com.sheri.wms.service.ILPNService;
import com.sheri.wms.utils.GeneralUtils;
@Service
public class ILPNServiceimpl implements ILPNService
{
	@Autowired 
	ILPNDao ilpnDao;
	@Autowired 
	ItemDao itemDao;
	
	@Autowired 
	ModelMapper modelMapper;
	@Override
	public boolean receiveLpn(ILPNDto ilpnDto) 
	{
		ILPNEntity newIlpnEntity=modelMapper.map(ilpnDto, ILPNEntity.class);
		if(validateLpn(ilpnDto,newIlpnEntity))
		{
			
			newIlpnEntity.setStatus(100);
			ilpnDao.saveIlpn(newIlpnEntity);
			return true;
		}else
		{
			return false;
		}
	}
	private boolean validateLpn(ILPNDto ilpnDto , ILPNEntity newIlpnEntity)
	{
		if(GeneralUtils.isNullOrEmpty(ilpnDto.getIlpnNumber()))
		{
			System.out.println("ILPN Number can not be empty");
			ilpnDto.addError("ILPN Number can not be empty");
			
		}
		if(GeneralUtils.isNullOrEmpty(ilpnDto.getItemName()))
		{
			System.out.println("Item Name can not be empty");
			ilpnDto.addError("Item Name can not be empty");
			
		}
		if(ilpnDto.getQty()==null || ilpnDto.getQty()<1)
		{
			System.out.println("Invalid iLPN quantity....");
			ilpnDto.addError("Invalid iLPN quantity");
			
		}
		
		
		
		if(ilpnDto.hasErrors()) 
			return false;
		
		ItemEntity itemEntity=itemDao.getItemByItemName(ilpnDto.getItemName());
		
		if(itemEntity==null)
		{
			System.out.println("The item does not exist in the system(ITEM_MASTER). Please provide a valid item");
			ilpnDto.addError("The item does not exist in the system(ITEM_MASTER). Please provide a valid item");
			return false;
		}
		newIlpnEntity.setItemEntity(itemEntity);
		
		ilpnDto.setItemId(itemEntity.getItemId());
		
		ILPNEntity ilpnEntityOld=ilpnDao.getILPNByIlpnNumber(ilpnDto.getIlpnNumber());
		if(ilpnEntityOld!=null)
		{
			ilpnDto.addError("ILPN "+ilpnDto.getIlpnNumber()+" Already exist");
			return false;
		}
		
		
		return true;
		
	}
	/*private boolean loadLPN(Integer id)
	{
		
		ILPNEntity ilpnEntity=ilpnDao.getIlpn(id);
		try
		{
		if(ilpnEntity!=null)
		{
			ILPNEntity ent=optEntity.get();
			return true;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			return false;
		
	}*/

}
