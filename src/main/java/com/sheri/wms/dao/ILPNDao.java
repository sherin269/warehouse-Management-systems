package com.sheri.wms.dao;

import java.util.List;

import com.sheri.wms.entity.ILPNEntity;



public interface ILPNDao 
{
	public boolean saveIlpn(ILPNEntity ilpnEntity);

	public List<ILPNEntity> getIlpn();
	public ILPNEntity getIlpn(Integer ilpnId);

	ILPNEntity getILPNByIlpnNumber(String ilpnNumber);

}
