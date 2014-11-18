package com.test.work.dao.Impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.test.work.dao.StorefrontDao;
import com.test.work.model.Storefront;

@Repository
public class StorfrontDaoImpl extends AbstractDaoImpl<Storefront, String> implements StorefrontDao
{
	protected StorfrontDaoImpl() {
		super(Storefront.class);
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	    public List<Storefront> findUsers(String userName) {
	        return findByCriteria(Restrictions.like("userName", userName, MatchMode.START));
	    }

	@Override
	public void saveStorefront(Storefront storefront) {
		// TODO Auto-generated method stub
		saveOrUpdate(storefront);
	}
}
