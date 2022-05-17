package com.sheri.wms.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sheri.wms.dao.ItemDao;
import com.sheri.wms.entity.ItemEntity;

@Repository
public class ItemDaoImpl implements ItemDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<ItemEntity> getItems()
	{
		List<ItemEntity> itemEtityList = sessionFactory.getCurrentSession().createQuery("from ItemEntity").list();
		return itemEtityList;
		
	}
	@Override
	@Transactional
	public boolean saveItem(ItemEntity itemEntity)
	{
		/*
		 * Session session = sessionFactory.openSession();
		 * session.saveOrUpdate(itemEntity); sessionFactory.close();
		 */
		 sessionFactory.getCurrentSession().saveOrUpdate(itemEntity);
		return true;
	}
	@Override
	@Transactional
	public ItemEntity getItemById(Integer itemId) {
		ItemEntity it;
		it=(ItemEntity) sessionFactory.getCurrentSession().get(ItemEntity.class, itemId);
		return it;
	}
	
	
	@Override
	@Transactional
	public void deleteItem(Integer itemId)
	{
		ItemEntity itemEntity=new ItemEntity(); 
		itemEntity.setItemId(itemId);
		sessionFactory.getCurrentSession().delete(itemEntity);
	}
	@Override
	@Transactional
	public ItemEntity getItemByItemName(String itemName)
	{
		
		List<ItemEntity> itemsList=sessionFactory.getCurrentSession().createQuery("from ItemEntity where itemName='"+itemName+"'").list();
		if(itemsList.size()>0)
			return itemsList.get(0);
		else
			return null;
	}
	
	
	
   /*
	private DataSource dataSource;
    
    public ItemDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }
	
    @Override
    public List<ItemDto> getItems() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "SELECT * from item_master";
        List<ItemDto> listUser = jdbcTemplate.query(sql, new RowMapper<ItemDto>() {
            @Override
            public ItemDto mapRow(ResultSet rs, int rowNumber) throws SQLException {
            	ItemDto item = new ItemDto();
            	item.setItemId(rs.getInt("item_id"));
            	item.setItemName(rs.getString("item_category"));
            	item.setItemDesc(rs.getString("item_description"));
            	item.setItemPrice(rs.getString("item_name"));;
                return item;
            }
        });
        return listUser;
    }
    */
    
   
}
