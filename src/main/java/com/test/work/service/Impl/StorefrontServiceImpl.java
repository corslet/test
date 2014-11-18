package com.test.work.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.work.dao.StorefrontDao;
import com.test.work.model.Storefront;
import com.test.work.service.StorefrontService;

@Service("storefrontService")
@Transactional(readOnly = true)
public class StorefrontServiceImpl implements StorefrontService{

	@Autowired
	private StorefrontDao storefrontDao;
	
	@Override
	@Transactional(readOnly = false)
	public void saveUser(Storefront storefront) {
		// TODO Auto-generated method stub
		storefrontDao.saveStorefront(storefront);
	}
}
