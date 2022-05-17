package com.sheri.wms.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sheri.wms.dao.ILPNDao;
import com.sheri.wms.entity.ILPNEntity;

@Transactional
@Repository
public class ILPNDaoImpl implements ILPNDao
{
	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean saveIlpn(ILPNEntity ilpnEntity)
	{
		System.out.println("Going to save iLPN to DB");
		sessionFactory.getCurrentSession().saveOrUpdate(ilpnEntity);
		return true;
	}
	@Override
	@Transactional
	public List<ILPNEntity> getIlpn() 
	{
		List<ILPNEntity>ilpnEntity=sessionFactory.getCurrentSession().createQuery("from ILPNEntity").list();
		
		return ilpnEntity;
	}
	@Override
	@Transactional
	public ILPNEntity getIlpn(Integer ilpnId)
	{
		ILPNEntity ilpnEntity=(ILPNEntity)sessionFactory.getCurrentSession().get(ILPNEntity.class, ilpnId);
		return ilpnEntity;
	}
	@Override
	@Transactional
	public ILPNEntity getILPNByIlpnNumber(String ilpnNumber)
	{
		//ILPNEntity ilpnEntity=new ILPNEntity();
		List<ILPNEntity> ilpnList=sessionFactory.getCurrentSession().createQuery("from ILPNEntity where ilpnNumber='"+ilpnNumber+"'").list();
		if(ilpnList.size()>0)
			return ilpnList.get(0);
		else
			return null;
	}
	
	

}
